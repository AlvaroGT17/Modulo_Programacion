package Tema1y4;
/* Solicita al usuario un número real y calcula su raíz cuadrada . 
 * Implementa el programa utilizando el nombre cualificado 
 * de las clases , en lugar de utilizar ninguna importación .
 */

import java.util.Scanner;


public class Actividad_pag42_n23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number;
		double result;
		
		System.out.print("Ingrese un numero entero para allar su raiz cuadrada: ");
		number=teclado.nextInt();
		
		result= Math.sqrt(number);
		
		System.out.printf("El resultado de la raiz cuadrada es: %,9.4f", result);

	}

}
