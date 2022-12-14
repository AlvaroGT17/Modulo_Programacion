package srcAlvaroGómezTejada;

import java.util.Scanner;

public class Ejercicio3agt {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Alvaro Gómez Tejada\n");

		pintaSeriesagt();

		System.out.println("Fin del ejercicio 3");

	}

	
// Metodo para leer numeros -------------------------------------------------------------------------------------------------------
	
	
	public static int leerNumagt(String m, int nummin, int nummax) {

		Scanner teclado = new Scanner(System.in);

		int num = 0;

		boolean continuar;

		System.out.print(m);
		do {
			continuar = true;

			try {
				num = teclado.nextInt();
			} catch (Exception e) {
				continuar = false;
			}
			teclado.nextLine();

			if (num < nummin || num > nummax || !continuar) {
				System.out.print("Numero Incorrecto, intentalo de nuevo: ");
			}
		} while (num < nummin || num > nummax || !continuar);

		return num;
	}
	
	
// Metodo que ejecuta y pinta la secuencia ------------------------------------------------------------------------------------------
	

	public static void pintaSeriesagt() {
		int termino = 0;

		do {
			termino = leerNumagt("Introduce un numero (1 a 1000)  (0 para finalizar): ", 0, 1000);
			System.out.println("");

			int digito = 2;
			int num = 1;
			int vueltas = 1;

			for (int x = 1; x <= termino; x++) {
				for (int y = 1; y <= digito; y++) {

					if (x % 2 != 0 && (y == digito)) {
						System.out.print(num);
					} else if (x % 2 == 0 && (y == (digito - digito) + 1)) {
						System.out.print(num);
					} else {
						System.out.print("0");
					}
					if (y == digito && y < termino) {
						System.out.print(", ");
					}
				}
				if (vueltas >= 2) {
					vueltas = 0;
					digito++;
					num++;
				}
				vueltas++;

			}
			System.out.println();
		} while (termino != 0);
	}
}
