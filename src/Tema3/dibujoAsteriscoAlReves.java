package Tema3;

import java.util.Scanner;

public class dibujoAsteriscoAlReves {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("ingrese un numero: ");
		
		int n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			
			for (i = n; n >= 1; i--) {
				System.out.print("");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}

	}

}
