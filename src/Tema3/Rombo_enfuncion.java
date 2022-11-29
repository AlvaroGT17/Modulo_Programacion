/* crear una funcion que reciba los caracteres y un valor numerico y pinte el rombo. Ejemplo de la llamada:
 * Pintar rombo ('j','-',5)
 * 
 * LLamar a la funcion
 * PintarRombo ('.','O',6)
 * PintarRombo ('*','-',7)
 * PintarRombo ('X','-',8)
 */

package Tema3;

public class Rombo_enfuncion {

	public static void main(String[] args) {
		
		PintarRombo ('.','O',6);
		PintarRombo ('*','-',7);
		PintarRombo ('X','-',8);

	}

	private static void PintarRombo(char c, char d, int num) {

		int guion=1;
		
		for (int i = num; i >= 1; i--) {
			for (int a = 1; a<=i; a++) {
				System.out.print(c);
			}
			for (int b = 1; b <= guion; b++) {
				System.out.print(d);
			}
			for (int b = 1; b <= i; b++) {
				System.out.print(c);
			}
			
			guion=guion+2;
			System.out.println("");
					
		}
		
		
		
		for (int b = 0; b < guion; b++) {
			System.out.print(d);
		}
		System.out.println("");
		
		
		
		for (int i = 1; i <= num; i++) {
			for (int a = 1; a<=i; a++) {
				System.out.print(c);
			}
			for (int b = 1; b <= (guion-2); b++) {
				System.out.print(d);
			}
			for (int b = 1; b <= i; b++) {
				System.out.print(c);
			}
			
			guion=guion-2;
			System.out.println("");
		}
		
	}

}
