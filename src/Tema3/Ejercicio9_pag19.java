/*Visualizar N términos de esta serie, N se leerá de teclado
A1, AA2, AAA3, AAAA4, AAAAA5, ........ AAAAAA......N
Por ejemplo, si N es 4 se debe mostrar: A1, AA2, AAA3, AAAA4
 * 
 */


package Tema3;

import java.util.Scanner;

public class Ejercicio9_pag19 {

	public static void main(String[] args) {
		
		
		
		pintarbucle();

	}

	private static void pintarbucle() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el numero de vueltas para el bucle: ");
		int num = teclado.nextInt();
		
		for (int i=1; i<=num;i++) {
			for (int x=1; x<=i;x++) {
				System.out.print("A");
				
				}
			
			if (i<num) {
					System.out.print(i + ", ");
				}else{
					System.out.print(i + ".");
					
			}
		}
		
	}

}
