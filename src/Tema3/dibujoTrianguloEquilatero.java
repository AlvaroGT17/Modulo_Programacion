package Tema3;

public class dibujoTrianguloEquilatero {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println("");
			for (int a = 4; a>i; a--) {
				System.out.print(" ");
			}
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			for (int a = 1; a<i; a++) {
				System.out.print("*");
			}
			
		}
	}

}
