/*Realiza un programa que visualice este rombo:
;;;;;-;;;;;
;;;;---;;;;
;;;-----;;; Los caracteres del rombo ( ; - ) se
;;-------;; pedirán por teclado.
;---------;
-----------
;---------;
;;-------;;
;;;-----;;;
;;;;---;;;;
;;;;;-;;;;;
*/

package Tema3;

public class Ejercicio6_pag18 {

	public static void main(String[] args) {
		
		int guion=1;
		
		for (int i = 5; i >= 1; i--) {
			for (int a = 1; a<=i; a++) {
				System.out.print(";");
			}
			for (int b = 1; b <= guion; b++) {
				System.out.print("-");
			}
			for (int b = 1; b <= i; b++) {
				System.out.print(";");
			}
			
			guion=guion+2;
			System.out.println("");
			
			
			
		}
		
		for (int b = 0; b < guion; b++) {
			System.out.print("-");
		}
		System.out.println("");
		
		for (int i = 1; i <= 5; i++) {
			for (int a = 1; a<=i; a++) {
				System.out.print(";");
			}
			for (int b = 1; b <= (guion-2); b++) {
				System.out.print("-");
			}
			for (int b = 1; b <= i; b++) {
				System.out.print(";");
			}
			
			guion=guion-2;
			System.out.println("");
		}
		
	}

}
