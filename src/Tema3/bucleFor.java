package Tema3;

import java.util.Scanner;

public class bucleFor {

	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {
			System.out.print(a + " ");
		}

		Scanner teclado = new Scanner(System.in);

		System.out.println("");
		System.out.println("==================================================");

		System.out.print("Ingrese la cantidad de números a ingresar: ");
		int n = teclado.nextInt();
		int suma = 0;
		
		for (int i = 1; i < (n + 1); i++) {
			suma = suma + i;
			if (i < n ) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + suma);
			}
		}

	}

}
