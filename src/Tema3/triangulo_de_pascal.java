package Tema3;

import java.util.Scanner;

public class triangulo_de_pascal {

	public static void main(String[] args) {

		System.out.print("Ingrese el numero que corresponde al número de filas: ");
		int n = leernum();
		
		pintarPascal(n);

	}

	private static void pintarPascal(int n) {
		
		

		for (int i = 0; i <= n; i++) {

			for (int m = 0; m <= i; m++) {
				int e=factorial(i) / (factorial(m) * (factorial((i-m))));
				System.out.print(e);
			}
			System.out.println("");
		}

	}

	private static int factorial(int num) {

		int numero = 1;
		for (int i = 1; i <= num; i++) {

			numero = i * numero;

		}
		return numero;
	}

	private static int leernum() {

		Scanner teclado = new Scanner(System.in);

		int num;
		num = teclado.nextInt();
		return num;
	}

}
