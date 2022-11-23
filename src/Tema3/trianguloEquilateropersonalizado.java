package Tema3;

import java.util.Scanner;

public class trianguloEquilateropersonalizado {

	public static void main(String[] args) {

		dibujo(introducirnum());

	}

	private static void dibujo(int introducirnum) {
		int n= introducirnum;
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			for (int a = n; a>i; a--) {
				System.out.print(" ");
			}
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			for (int a = 1; a<i; a++) {
				System.out.print("*");
			}
			
		}
		
	}

	private static int introducirnum() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el tamaño del triangulo: ");
		int num = teclado.nextInt();
		return num;
	}

}
