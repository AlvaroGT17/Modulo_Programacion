/* Codificar el juego «el número secreto», que consiste en acertar un número entre 1 y 100 
 * (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para los que 
 * se indica: «mayor» o «menor», según sea mayor o menor con respecto al número secreto. El proceso
 * termina cuando el usuario acierta o cuando se rinde (introducien do un −1).*/

package Tema3;

import java.util.Scanner;

public class adibinaCualEsElNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numSec = (int) (Math.random() * 100);
		System.out.println(numSec);
		int num = 0;
		int cont = 0;

		while (num != numSec || num == -1) {

			System.out.println("Ingrese un número para intentar adibinar el número secreto: ");
			num = teclado.nextInt();

			if (num > numSec) {
				System.out.println("El número introducido es mayor al buscado");
			} else if (num < numSec) {
				System.out.println("El número introducido es menor al buscado");
			}

			cont++;

		}

		if (num == numSec) {
			System.out.println("Enorabuena has gando, lo conseguistes en " + cont + " intentos.");
		} else if (num == -1) {
			System.out.println("Lamento tu decision de rendirte");
		}
	}

}
