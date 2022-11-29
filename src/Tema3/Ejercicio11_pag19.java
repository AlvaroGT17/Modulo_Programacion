/* Pintar la siguiente serie para un numero n leído de teclado, por ejemplo para n= 5 pinta

a
ab
abc
abcd
abcde
*/



package Tema3;

public class Ejercicio11_pag19 {

	public static void main(String[] args) {
		
		char letra='a';
		for (int x=1; x<=5;x++) {
			letra='a';
			for (int y=1;y<=x;y++,letra++) {
				System.out.print(letra);
				
			}
				
			System.out.println("");
			
		}

	}

}
