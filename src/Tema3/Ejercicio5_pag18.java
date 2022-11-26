package Tema3;

import java.util.Scanner;

public class Ejercicio5_pag18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca el número de filas: ");
		int filas = teclado.nextInt();

		for (int i = 0; i <= filas; i++) {

			System.out.println("");

			for (int j = 0; j <= filas; j++) {

				if (i == j) {
					System.out.print(" 1 ");
				} else {
					System.out.print(" 0 ");
				}
			}

		}

	}

}
