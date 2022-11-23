package Tema3;

import java.util.Scanner;

public class dibujoAsteriscoInvaertido {

	public static void main(String[] args) {
		
Scanner teclado=new Scanner(System.in);
		
		System.out.print("ingrese un numero: ");
		int n = teclado.nextInt();
		for (int i = n; i >= 1; i--) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			}


	}

}
