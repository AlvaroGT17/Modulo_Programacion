package Tema1y4;
import java.util.Scanner;

/* Escribir un programa que pida un número al usuario y muestre su valor absoluto.
 */
public class Actividad_pag34_n1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number;
		
		System.out.println("Escriba un número: ");
		number= teclado.nextInt();
		
		int consult= (number* -1);
		
		consult=(number > 0)? number: consult;
		
		System.out.print("El valor absoluto del número ingresado es: " + consult);

	}

}
