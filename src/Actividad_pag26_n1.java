// Pedir al usuario su edad y mostrar la que tendra el proximo año.

// Lo primero que haremos sera importar la libreria que necesitaremos para scannear lo introducido por teclado.
import java.util.Scanner;

public class Actividad_pag26_n1 {

	public static void main(String[] args) {

		// Creamos el objeto para capturar lo que introducimos por teclado.
		Scanner number = new Scanner(System.in);

		// Le pedimos al usuario que ingrese su edad.
		System.out.println("Ingrese su edad porfavor: ");
		int edad = number.nextInt();

		// Realizamos la operación aritmetica para saber la edad que tendra el año que
		// viene.
		edad = edad++;

		// Por ultimo imprimimos el resultado del programa.
		System.out.print("La edad que tendra el año que viene es: " + edad);

	}

}
