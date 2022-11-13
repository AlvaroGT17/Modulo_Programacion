import java.util.Scanner;

/* Leer dos números por teclado y mostrar el menor
 * 
 */

public class ActividadPizarra_20220922_n1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int number1;
		int number2;
		int result;
		String iguality;
		
		System.out.print("Introdudca el primer número: ");
		number1=teclado.nextInt();
		
		System.out.print("Introdudca el segundo número: ");
		number2=teclado.nextInt();
		
		result= number1>number2? number1 : number2;
		
		System.out.println("El mayor es el número " + result);
		
		iguality= number1==number2? " Iguales": " Diferentes";
		
		System.out.print("Los numeros " + number1 + " y " + number2 + " son: " + iguality);
		
	}
}
