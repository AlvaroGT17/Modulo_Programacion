// leer numero con control de escepciones y con esclusion de numeros negativos pasandolos a positivos

package Moudulos_Prefabricados;

import java.util.Scanner;

public class leerNum {

	public static void main(String[] args) {
		

	}

	private static int leernum() {

		int num=0;
			try {
				Scanner teclado = new Scanner(System.in);
				System.out.print(" Frase ");
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
