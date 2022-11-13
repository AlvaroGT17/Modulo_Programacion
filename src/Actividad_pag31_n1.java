import java.util.Scanner;

/* Diseña un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influiran en esta
 * decisión: si está lloviendo y si hemos teminado nuestras tareas. Solo podremos salir a la calle si no está
 * lloviendo y si hemos terminado nuestras tareas. Existe una opción en la que, indistintamente de lo anterior,
 * podremos salir a la calle: el echo de que tenhamos que ir a la biblioteca. Solicitar al usuario mediante
 * booleanos si llueve, si ha finalizado sus tareas y si necesita ir a la biblioteca. El algoritmo debe de mostrar
 * mediante boolenao si es posible que se le otorge permiso para ir a la calle.
 */

public class Actividad_pag31_n1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		boolean rain;
		boolean homework;
		boolean library;
		boolean permission;
		
		System.out.println("Conteste a las preguntas con true para si o false para no.");
		System.out.print("¿Hoy no esta lloviendo? ");
		rain=teclado.nextBoolean();
		System.out.print("¿Ha terminado sus deberes? ");
		homework=teclado.nextBoolean();
		System.out.print("¿Tiene que ir a la biblioteca? ");
		library=teclado.nextBoolean();
		
		permission= rain==true && homework==true || library==true;
		
		System.out.print("Hoy adquieres el permiso para salir: " + permission);
		
	}

}
