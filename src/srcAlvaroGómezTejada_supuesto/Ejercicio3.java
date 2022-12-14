package srcAlvaroGómezTejada_supuesto;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

// Declaracion de variables-----------------------------------------------------------------------------------------------------		

		int filas = 0;
		int montanas = 0;

// Lectura de parametros y llamada a metodos------------------------------------------------------------------------------------

		System.out.print("Ingrese el numero de filas por montaña: ");
		filas = leernum();
		System.out.print("Ingrese el numero de montañas: ");
		montanas = leernum();
		System.out.println("");

		dibujo(filas, montanas);

	}

	
// Metodo para hacer el dibujo solicitado---------------------------------------------------------------------------------------

	
	private static void dibujo(int filas, int montanas) {

		int posicion1 = filas;
		int posicion2 = filas;
		int posicion = 1;

		if (filas == 0) {
		
			System.out.print("Fin del programa.");

		} else {

			for (int x = 1; x <= filas; x++) {
				for (int y = 1; y <= ((filas * 2) - 1) * montanas; y++) {
					if (posicion == posicion1 || posicion == posicion2) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					posicion++;
					if (posicion > filas * 2 - 1) {
						posicion = 1;
					}
				}

				System.out.println("");
				posicion1--;
				posicion2++;

			}

			System.out.println("");

		}

	}

	
	
// Metodo para leer numeros por teclado-----------------------------------------------------------------------------------------
	
	
	private static int leernum() {

		int num = 0;
		try {
			Scanner teclado = new Scanner(System.in);
			num = teclado.nextInt();
			teclado.nextLine();

		} catch (Exception e) {
			System.out.print(
					"ERROR !!! El Numero introducido es muy grande para la variable definida o introdujo caracteres no permitidos");
		}

		return num;

	}

}
