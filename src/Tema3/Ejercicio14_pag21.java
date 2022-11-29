/*
Realiza un proceso repetitivo en el que se lea un número por teclado y se muestre el número de
cifras que tiene. El proceso finaliza cuando se introduce el 0. Si el número es negativo se calcula
el positivo.
*/

package Tema3;

import java.util.Scanner;

public class Ejercicio14_pag21 {

	public static void main(String[] args) {

		int num=0;
		
		do {
			
			num = leernum();
			if (num>0 && num<=9) {
				System.out.println("El numero " + num + " tiene 1 cifra.");
			}else if (num>=10 && num<=99) {
				System.out.println("El numero " + num + " tiene 2 cifra.");
			}else if (num>=100 && num<=999) {
				System.out.println("El numero " + num + " tiene 3 cifra.");
			}else if (num>=1000 && num<=9999) {
				System.out.println("El numero " + num + " tiene 4 cifra.");
			}else if (num>=10000 && num<=99999) {
				System.out.println("El numero " + num + " tiene 5 cifra.");
			}else if (num>=100000 && num<=999999) {
				System.out.println("El numero " + num + " tiene 6 cifra.");
			}else if (num>=1000000 && num<=9999999) {
				System.out.println("El numero " + num + " tiene 7 cifra.");
			}else if (num>=10000000 && num<=99999999) {
				System.out.println("El numero " + num + " tiene 8 cifra.");
			}else if (num>=100000000 && num<=999999999) {
				System.out.println("El numero " + num + " tiene 9 cifra.");
			}else if (num>=100000000 && num<=2147483647){
				System.out.println("El numero " + num + " tiene 10 cifra.");
			}
			
		} while (num!=0);

	
	}
	
	private static int leernum() {

		int num=0;
			try {
				Scanner teclado = new Scanner(System.in);
				System.out.print("Ingrese el numero que quiere analizar: ");
				num = teclado.nextInt();
				teclado.nextLine();
				if(num<0) {
					num=(num*-1);
				}
								
			} catch (Exception e) {
				System.out.print("ERROR !!! El Numero introducido es muy grande para la variable definida o introdujo caracteres no permitidos");
			}

			return num;
				

			
		}
}