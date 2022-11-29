package Tema3;

import java.util.Scanner;

public class Ejercicio7_pag19 {

	public static void main(String[] args) {
	
Scanner teclado=new Scanner(System.in);

	int n=0;
	
	do {
		System.out.print("ingrese un numero: ");
		n = teclado.nextInt();
		
		if (n!=0) {
			
			pintarRombo(n);
		}
		
	} while (n!=0);
		



		
		
		
	}

	private static void pintarRombo(int n) {
		
		for (int i = 1; i <= n; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
			System.out.print(i);
			}
		}
		
		for (int i = (n-1); i >= 1; i--) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
			System.out.print(i);
			}
		}
		
		System.out.println("\n");
		
	}

}
