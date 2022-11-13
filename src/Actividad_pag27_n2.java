import java.util.Scanner;

/* Crea una aplicación que calcule la media aritmetica de dos notas enteras. Hay que tener en cuenta 
 * que la media puede contener decimales.
 */

public class Actividad_pag27_n2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int note;
		int note2;
		double avarage;

		System.out.print("Deme la primera nota: ");
		note = teclado.nextInt();
		System.out.print("Deme la segunda nota: ");
		note2 = teclado.nextInt();
		
		avarage = (note + note2) / 2.0;
		
		System.out.print("La nota media de las cantidades introducidas es: " + avarage);

	}

}
