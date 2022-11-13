package Tema1y4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad2Pizarra_20221018 {

	static Scanner teclado;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un número: ");
		int number = LeerNumero("Introduce un numero");
		int number2 = LeerNumero("Introduce un numero 2");

		if (number > number2) {

			System.out.print("El numero mayor es " + number);

		}

		if (number < number2) {

			System.out.print("El numero mayor es " + number2);

		}

		if (number == number2) {

			System.out.print("Los dos numeros son iguales");

		}

	}

	public static int LeerNumero(String m) {

		int number = 0;
		System.out.print(m);

		try {
			number = teclado.nextInt();
		} catch (InputMismatchException ex) {
			number = 0;
			System.out.println("\t error al leer el numero");
		}
		teclado.nextLine();
		return number;
	}
}