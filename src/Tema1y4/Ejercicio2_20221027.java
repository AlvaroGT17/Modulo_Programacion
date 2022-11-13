package Tema1y4;
import java.util.Scanner;

public class Ejercicio2_20221027 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double num1 = introducciondouble(teclado);
		double num2 = introducciondouble(teclado);
		int operacion = introduccionint(teclado);
		
		
		seleccion(operacion, num1, num2);
	}

	private static double introducciondouble(Scanner teclado) {
		double num1;
		System.out.print("Introduzca un numero: ");
		num1 = teclado.nextDouble();
		return num1;
	}
	
	private static int introduccionint(Scanner teclado) {
		int num1;
		System.out.print("Introduzca un numero: ");
		num1 = teclado.nextInt();
		return num1;
	}
	

	private static void seleccion(int operacion, double num1, double num2) {

		switch (operacion) {

		case 1:
			System.out.print("El resultado de la suma es: " + (num1 + num2));
			break;
		case 2:
			System.out.print("El resultado de la resta es: " + (num1 - num2));
			break;
		case 3:
			System.out.print("El resultado de la multiplicación es: " + (num1 * num2));
			break;
		case 4:
			if (num2 == 0) {
				System.out.print("El divisor es 0 y el resultado daria infinito");
			} else {
				System.out.print("El resultado de la suma es: " + (num1 / num2));
			}
			break;
		default:
			System.out.print("Lo lamento la opcion seleccionada es ERRONEA!!!");

		}

	}

}
