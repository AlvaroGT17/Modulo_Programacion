/* Crear una funcion que reciba un numero y debuelva el factorial. realizar un programa que visualice el gactorial de los numeros del 1 al 10*/

package Tema3;

import java.util.Scanner;

public class funcion_factorial {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de números a ingresar: ");
		int n = teclado.nextInt();
		int suma = 0;
		
		
		factorial(n);

	}

	private static void factorial(int n) {
		
		int producto=1;
		int i;
		for (i = 1; i < (n + 1); i++) {
			producto=producto*i;
			
		}
		System.out.printf("%2d! =%,14%d %n ", i, producto );
	}

}
