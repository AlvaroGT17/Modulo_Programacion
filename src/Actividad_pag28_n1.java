import java.util.Scanner;

/* Diseña una aplicación que calcule la longitud y el área de una circunferencia. Para ello el
 * usuario debe introducir el radio (que puede contener decimales).
 */

public class Actividad_pag28_n1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese el radio de la circunferencia: ");
		double radio = teclado.nextDouble();

		System.out.print(
				"La longitud de la circunferencia será: " + (3.14 * radio) + " y su área es " + (3.14 * radio * radio));

	}

}
