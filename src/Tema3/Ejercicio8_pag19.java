/*Realizar un programa que dibuje un tablero de ajedrez con las letras B y N.

B N B N B N B N
N B N B N B N B
B N B N B N B N
N B N B N B N B
B N B N B N B N
N B N B N B N B
B N B N B N B N
N B N B N B N B

*/

package Tema3;

public class Ejercicio8_pag19 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=8; i++) {
			for (int x=0; x<8;x++) {
				if(i%2!=0) {
					if (x%2!=0) {
						System.out.print("B ");
					}else {
						System.out.print("N ");
					}
					}else {
						if (x%2!=0) {
							System.out.print("N ");
						}else {
							System.out.print("B ");
					}
					}
			}
			System.out.println("");
		}
		
	}

}
