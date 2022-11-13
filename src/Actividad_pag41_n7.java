/*Escribe un programa que tome como entrada un número entero e indique qué cantidad 
hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo : 
A 2 hay que sumarle 5 para que el resultado ( 2 + 5 = 7 ) sea múltiplo de 7 . 
A 13 hay que sumarle 1 para que el resultado ( 13 + 1 = 14 ) sea múltiplo de 7 . 
Si proporcionas el número 2 o el 13 , la salida de la aplicación debe ser 5 o 1 , respectiva mente . 
Pista : El operador módulo puede ser muy útil para solucionar esta actividad . */

import java.util.Scanner;

public class Actividad_pag41_n7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number;
		int amount;
		int numberMas;
		
		
		System.out.print("Ingrese un número: ");
		number= teclado.nextInt();

		 amount = number % 7;
	     numberMas = 7 - amount;
	
		
		System.out.print("Para que " + number + " sea multiplo de 7 hay que sumarle " + numberMas);

	}

}
