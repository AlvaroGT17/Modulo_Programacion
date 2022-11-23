package Tema3;

import java.util.Scanner;

public class tabla_de_multiplicar_funcion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indique de que tabla quiere mostrar: ");
		int num=teclado.nextInt();
		teclado.nextLine();
		int i=0;
		
		for (i=0; i<=num; i++) {
			
			System.out.println();
			
		}
		
		
		
		
		
		}
			
			

	private static void tabla_de_multiplicar(int num) {
		
		int mult=0;
		
		for (int i=0; i<=10; i++) {
			mult=num*i;
			System.out.println(num + " x " + i + " = " + mult);
	}
	}

}

