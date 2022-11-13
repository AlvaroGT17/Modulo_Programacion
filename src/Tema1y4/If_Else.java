package Tema1y4;
import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Damen un numero: ");

		int number = sc.nextInt();

		if (number > 0) {
			System.out.print("El numero es mayor que 0");
		} else {
			if (number < 0) {
				System.out.print("El numero es menor 0");
			} else {
				System.out.print("El numero es igual a 0");
			}
		}

	}

}
