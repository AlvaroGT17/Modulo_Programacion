/* Dise�ar un programa que muestre, para cada n�mero introducido por teclado, si es par, si es 
 * positivo y su cuadrado. El proceso se repetir� hasta que el n�mero introducido sea 0.*/

package Tema3;

import java.util.Scanner;

public class caracteristicasDeUnNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese el n�mero a examinar: ");
		int num = teclado.nextInt();
		int numpar = 0;
		int numcuadrado = 0;

		while (num != 0) {
			

		numpar = num % 2;
		numcuadrado = num * num;

		if (numpar == 0) {
			System.out.println("El n�mero " + num + " es par");
		} else {
			System.out.println("El n�mero " + num + " no es par");
		}

		if (num > 0) {
			System.out.println("El n�mero " + num + " es positivo");
		} else {
			System.out.println("El n�mero " + num + " es negativo");
		}

		System.out.println("El cuadrado de " + num + " es: " + numcuadrado);
		System.out.println("======================================================");
		System.out.print("Ingrese el n�mero a examinar: ");
		num = teclado.nextInt();
		}

	}

}
