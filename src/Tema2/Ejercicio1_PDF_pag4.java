package Tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_PDF_pag4 {

	public static void main(String[] args) {

		int number1 = leer();
		int number2 = leer();
		comparacion(number1, number2);

	}

	private static int leer() {

		Scanner teclado = new Scanner(System.in);
		int num = 0;

		try {

			System.out.print("Ingrese un numero: ");
			num = teclado.nextInt();
			teclado.nextLine();

		} catch (InputMismatchException es) {

			System.out.print("ERROR al introducir el número");
			teclado.nextLine();
			num = 0;

		}

		return num;
	}

	private static void comparacion(int number1, int number2) {

		if (number1 == number2) {

			System.out.print("El número " + number1 + " y el número " + number2 + " son iguales");

		}

		if (number1 > number2) {

			System.out.print("El número " + number1 + " el mayor que el número " + number2);

		}

		if (number1 < number2) {

			System.out.print("El número " + number2 + " el mayor que el número " + number1);

		}
	}

}
