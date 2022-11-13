package Tema1y4;
import java.util.Scanner;

public class Ejercicio1_pizarra_20221026 {

	public static void main(String[] args) {

		// declaramos la variable "n" que nos recogera el numero introducido por el
		// teclado
		int n;

		// llamamos a la funcion leer para recibir el numero a analizar
		n = leer();

		// llamamos a la funcion selleccionador pasandole la variable "n"
		sleccionador(n);

	}

	// Esta funcion lo que no ara sera recoger un numero que el usuario a
	// introducido por teclado.
	static int leer() {

		Scanner teclado = new Scanner(System.in);
		int numero1 = 0;

		try {

			System.out.print("Ingrese un numero comprendido entre 0 y 9999: ");
			numero1 = teclado.nextInt();
			teclado.nextLine();

		} catch (java.util.InputMismatchException control) {
			System.out.println("Numero mal introducido");

		}

		return numero1;

	}

	// Esta funcion lo que nos va a hacer es segun el numero de digitos que tiene el
	// numero llamara a otra
	// funcion que nos diga si es capicua o no.
	static void sleccionador(int n) {

		if (n < 10) {
			comparador1(n);
		} else if (n < 100) {
			comparador2(n);
		} else if (n < 1000) {
			comparador3(n);
		} else {
			comparador4(n);
		}

	}

	private static void comparador4(int n) {

		int num = n;

		int num1 = num / 10;
		int r1 = num % 10;
		int num2 = num1 / 10;
		int r2 = num1 % 10;
		int num3 = num2 / 10;
		int r3 = num2 % 10;

		if (num3 == r1 && r3 == r2) {

			System.out.print("El numero " + num + " es capicua");

		} else {

			System.out.print("El numero " + num + " no es capicua");

		}

	}

	private static void comparador3(int n) {

		int num = n;

		int num1 = num / 10;
		int r1 = num % 10;
		int num2 = num1 / 10;
		int r2 = num1 % 10;
		int num3 = num2 / 10;
		int r3 = num2 % 10;

		if (num3 == r2) {

			System.out.print("El numero " + num + " es capicua");

		} else {

			System.out.print("El numero " + num + " no es capicua");

		}

	}

	private static void comparador2(int n) {

		int num = n;

		int num1 = num / 10;
		int r1 = num % 10;
		int num2 = num1 / 10;
		int r2 = num1 % 10;
		int num3 = num2 / 10;
		int r3 = num2 % 10;

		if (num1 == r1) {

			System.out.print("El numero " + num + " es capicua");

		} else {

			System.out.print("El numero " + num + " no es capicua");

		}

	}

	private static void comparador1(int n) {

		System.out.print("El numero " + n + " es capicua");

		
			}

}
