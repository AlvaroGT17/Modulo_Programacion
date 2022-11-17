package Tema3;

import java.util.Scanner;

public class aprender_a_contar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de numeros que desea contar: ");
		int num = teclado.nextInt();
		teclado.nextLine();

		for (int i = 1; i < (num + 1); i++) {
			System.out.print(i + ", ");
		}

	}

}
