/*

Realiza un programa Java de nombre serieLetras que lea de teclado un número N mayor que 0 y
muestre en pantalla N términos de la siguiente serie separados por espacios en blanco:
a ab abc abcd abcde a1 ab1 abc1 abcd1 abcde1 a2 ab2 abc2
abcd2 abcde2 …..

N terminos
Si el número N no es > 0 se debe leer de nuevo.
Por ejemplo, Si N = 2 el programa debe mostrar 2 términos: a ab

Ejemplo de ejecución para distintos valores de N:
Introduce el nº de términos a
mostrar: 5
a ab abc abcd abcde

Introduce el nº de términos a
mostrar: 8
a ab abc abcd abcde a1 ab1 ab c1

Introduce el nº de términos a mostrar: 10
a ab abc abcd abcde a1 ab1 abc1 abcd1 abcde1

Introduce un el nº de términos a mostrar: 11
a ab abc abcd abcde a1 ab1 abc1 abcd1 abcde1 a2

*/

package Tema3;

import java.util.Scanner;

import Tema1y4.LeerDosNumeros;

public class Ejercicio12_pag20 {

	public static void main(String[] args) {

		int num = leernum();
		dibujarserie(num);

	}

	private static void dibujarserie(int num) {

		char letra = 'a';
		for (int i = 1; i <= num; i++) {
			System.out.print(" ");
			letra = 'a';
			for (int x=1;x<=num;x++) {
				for (int j = 1; j <= 5; j++, letra++) {
					System.out.print(letra);
					
				}
				
				for (int j = 1; j <= i; j++) {
					if(j>1 && j==i) {
						System.out.print(x);
					}
				}
				
			}
		}
			
	}
	

	private static int leernum() {

		Scanner teclado = new Scanner(System.in);

		int num;

		do {
			System.out.print("Ingrese el numero que quiere que se repita el bucble: ");
			num = teclado.nextInt();
		} while (num < 0);

		return num;
	}

}
