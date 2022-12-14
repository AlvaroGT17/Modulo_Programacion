package srcAlvaroGómezTejada_supuesto;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

// Declaracion de variables-------------------------------------------------------------------------------------------------	

		int master1 = 0;
		int master2 = 9;
		int master3 = 3;
		int master4 = 6;
		int convinacion1 = 0;
		int convinacion2 = 0;
		int convinacion3 = 0;
		int convinacion4 = 0;
		int aciertos = 0;
		int coincidencias = 0;
		boolean repetidos = false;

		int cont = 1;
		
// Bucle principal del programa---------------------------------------------------------------------------------------------	

		while (cont < 10) {

			// Idicador de intento en curso---------------------------------------------------------------------------------
			
			System.out.println("Intento: " + cont + " --------------------------------------------------------\n");

			// Lectura de los numeros del jugador---------------------------------------------------------------------------
			
			convinacion1 = leernum();
			convinacion2 = leernum();
			convinacion3 = leernum();
			convinacion4 = leernum();
			
			// Presentacion de los nuemros introducidos---------------------------------------------------------------------
			
			System.out.println("");
			System.out.println("Numeros introducidos: [" + convinacion1 + ", " + convinacion2 + ", " + convinacion3
					+ ", " + convinacion4 + "]\n");

			// Comprovaciones de: repeticion, aciertos, coincidencia y comprovacion total de aciertos-----------------------
			
			
			repetidos=comprovacionrepetidos(convinacion1, convinacion2, convinacion3, convinacion4);
			if (repetidos==true) {
				cont--;
			}
			
			
			aciertos = comprovaraciertos(convinacion1, convinacion2, convinacion3, convinacion4, master1, master2,
					master3, master4);
			System.out.println("El numero de aciertos es: " + aciertos);

			coincidencias = comprovarcoincidencias(convinacion1, convinacion2, convinacion3, convinacion4, master1,
					master2, master3, master4);
			System.out.println("El numero de coincidencias es: " + coincidencias + "\n");

			if (convinacion1 == master1 && convinacion2 == master2 && convinacion3 == master3
					&& convinacion4 == master4) {
				System.out.print("LO LOGRASTE, tan solo te llevó " + cont + " intentos.");
				break;
			}
			
// Indicador de intentos----------------------------------------------------------------------------------------------------
			System.out.println("Intentos restantes: " + (10 - cont) + "\n");
			cont++;

		}

		if (cont==10) {
		System.out.println("Lo lamento, después de 10 intentos no lo conseguiste.");
		}
		
	}

// Metodo para comprovar si hay numeros repetidos --------------------------------------------------------------------------	

	private static boolean comprovacionrepetidos(int convinacion1, int convinacion2, int convinacion3,
			int convinacion4) {

		boolean resultado = false;

		if ((convinacion1 == convinacion2) || (convinacion1 == convinacion2) || (convinacion1 == convinacion4)) {
			resultado = true;
		} else if ((convinacion2 == convinacion1) || (convinacion2 == convinacion3) || (convinacion2 == convinacion4)) {
			resultado = true;
		} else if ((convinacion3 == convinacion1) || (convinacion3 == convinacion2) || (convinacion3 == convinacion4)) {
			resultado = true;
		} else if ((convinacion4 == convinacion1) || (convinacion4 == convinacion2) || (convinacion4 == convinacion3)) {
			resultado = true;
		}

		if (resultado == true) {

			System.out.println("**************************************************************************");
			System.out.println("*    Lo siento, pero la convinacion tiene numeros repetidos              *");
			System.out.println("*      y no esta permitido vuelva a introducir una convinacion valida    *");
			System.out.println("*         Este intento no se contara.                                    *");
			System.out.println("*                                                                        *");
			System.out.println("**************************************************************************\n");

		}

		return resultado;
	}

// Metodo para comprovar las coincidencias ---------------------------------------------------------------------------------	

	private static int comprovarcoincidencias(int convinacion1, int convinacion2, int convinacion3, int convinacion4,
			int master1, int master2, int master3, int master4) {

		int contadorCoincidencias = 0;

		if (convinacion1 == master2 || convinacion1 == master3 || convinacion1 == master4) {
			contadorCoincidencias++;
		}
		if (convinacion2 == master1 || convinacion2 == master3 || convinacion2 == master4) {
			contadorCoincidencias++;
		}
		if (convinacion3 == master1 || convinacion3 == master2 || convinacion3 == master4) {
			contadorCoincidencias++;
		}
		if (convinacion4 == master1 || convinacion4 == master2 || convinacion4 == master3) {
			contadorCoincidencias++;
		}
		return contadorCoincidencias;
	}

// Metodo para comprovar los aciertos --------------------------------------------------------------------------------------	

	private static int comprovaraciertos(int convinacion1, int convinacion2, int convinacion3, int convinacion4,
			int master1, int master2, int master3, int master4) {
		int contadorAciertos = 0;

		if (convinacion1 == master1) {
			contadorAciertos++;
		}
		if (convinacion2 == master2) {
			contadorAciertos++;
		}
		if (convinacion3 == master3) {
			contadorAciertos++;
		}
		if (convinacion4 == master4) {
			contadorAciertos++;
		}
		return contadorAciertos;
	}

// Metodo para leer por teclado --------------------------------------------------------------------------------------------	

	private static int leernum() {

		Scanner teclado = new Scanner(System.in);
		int num=0;
		
		do{
			try {
				System.out.print("Ingrese un numero comprendido entre ( 0 y 9 ): ");
				num = teclado.nextInt();
				teclado.nextLine();
				
	
			} catch (Exception e) {
				System.out.println("");
				System.out.println(
						"ERROR !!! El Numero introducido es muy grande para la variable definida o introdujo caracteres no permitidos\n");
			}
		
		}while (num < 0 || num > 9);

		return num;
		
	}
	
}
