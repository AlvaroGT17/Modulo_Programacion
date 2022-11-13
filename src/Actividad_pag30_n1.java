import java.util.Scanner;

/* Escribe un programa que pida un número al usuario e indique mediante un literal booleano (true o false)
 * si el número es par. 
 */
public class Actividad_pag30_n1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double number;
		double operation;
		boolean result;
		
		System.out.print("Ingrese el número que quiera consultar: ");
		number = teclado.nextDouble();
		
		operation= number % 2.0;
		
		result= operation == 0;
		
		System.out.print("El número " + number + " que ingresó es par: ??? " + result);

	}

}
