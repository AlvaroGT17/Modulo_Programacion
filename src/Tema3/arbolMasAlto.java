/* Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el 
 * árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada árbol 
 * (terminando la introducción de datos cuando se utilice −1 como altura). Los árboles se identifican 
 * mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar una aplicación 
 * que resuelva el problema planteado.
 */

package Tema3;

import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class arbolMasAlto {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int id =0;
		int altura =0;
		int mayorAltura =0;
		int mayorId=0;
		
		while (altura !=-1) {
			
			System.out.print("Ingrese la altura del arbol con id " + id + ": ");
			altura=teclado.nextInt();
			
			if (altura>mayorAltura) {
				mayorAltura= altura;
				mayorId=id;
			}
			
			id++;
			
		}
		
		System.out.print("El arbol mas alto introducido es al que le corresponde el id " + mayorId + " con una altura de " + mayorAltura + " cm.");

	}

}
