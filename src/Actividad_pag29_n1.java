import java.util.Scanner;

/*Realiza una aplicación que solicire al usuario su edad y le indique su es mayor de edad
 * (mediante un literal booleano: true o false).
*/
public class Actividad_pag29_n1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		byte age;
		boolean adult;
		
		System.out.print("Ingrese su edad: ");
		age= teclado.nextByte();
		
		adult = age >= 18;
		
		System.out.print("Usted es mayor de edad: " + adult);

	}

}
