package Tema3;

import java.util.Scanner;

public class maximo_minimo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indique el número de cifras a comparar: ");
		int num = teclado.nextInt();
		
		if (num > 0 ) {
			
			int cont = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
						
			while ( cont < num ) {
				
				System.out.print("Indique el " + (cont+1) + "º de número a comparar: ");
				
				int num2 = teclado.nextInt();
				
				if (num2 > max) {
					max = num2;
				}
				
				if (num2 < min) {
					min= num2;
				}
				
				cont++;
			}
			
			System.out.println("El número maximo introducido es: " + max);
			System.out.println("El número maximo introducido es: " + min);
			
		} else {
			System.out.print("El numero introducido es erroneo.");
		}
		
		
		
	}

}
