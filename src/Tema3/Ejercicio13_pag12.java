/*
Partiendo del ejercicio anterior realiza los cambios necesarios para que además pida por teclado
el número máximo de letras a mostrar, debe ser un número > 0, si no es >0 se pide de nuevo. Por
ejemplo si el número máximo de letras es 4 se deben mostrar como máximo 4 letras en los grupos
de letras (abcd), si es 7 se deben mostrar 7 letras (abcdefg). 

Observa los ejemplos de ejecución:

Introduce el nº de términos a mostrar: 6
Introduce el número máximo de letras: 4
a ab abc abcd a1 ab1

Introduce el nº de términos a mostrar: 12
Introduce el número máximo de letras: 1
a a1 a2 a3 a4 a5 a6 a7 a8 a9 a10 a11

Introduce el nº de términos a mostrar: 7
Introduce el número máximo de letras: 10
a ab abc abcd abcde abcdef abcdefg

Introduce el nº de términos a mostrar: 15
Introduce el número máximo de letras: 7
a ab abc abcd abcde abcdef abcdefg a1 ab1 abc1 abcd1 abcde1 abcdef1 abcdefg1 a2
 */

package Tema3;

import java.util.Scanner;

public class Ejercicio13_pag12 {

	public static void main(String[] args) {
		System.out.print("Ingrese el número de veces que se repetira el bucle: ");
		int num = leernum();
		System.out.print("Ingrese el número de caracteres imprimiran en el bucle: ");
		int numcaracteres=leernum();
		dibujarserie(num, numcaracteres);
		
	}

	private static void dibujarserie(int num, int numcaracter) {

		char letra = 'a';
		int y = 1;
		
		for (int x = 1, contador = 1, contadorvuelta = 0; x <= num; x++, contador++) {
			letra = 'a';
			if (contador > numcaracter) {
				contador = 1;
				contadorvuelta++;
			}
			for (y = 1; y <= contador; y++, letra++) {
				System.out.print(letra);
			}

			if (contadorvuelta >= 1) {
				System.out.print(contadorvuelta);
			}
			System.out.print(" ");

		}

	}

	private static int leernum() {

		Scanner teclado = new Scanner(System.in);

		int num;

		do {
			num = teclado.nextInt();
		} while (num < 0);

		return num;
	}

}
