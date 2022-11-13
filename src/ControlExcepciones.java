import java.util.Scanner;

public class ControlExcepciones {
	public static void main(String[] args) {
		// Instaciar la clase Scanner o
		// crear el objeto leer Scanner leer = new Scanner(System.in);

		Scanner leer = new Scanner(System.in);

		System.out.print("Ingrese su nombre: "); // con esta linea le preguntamos al usuario el nombre.

		String nombre = leer.nextLine(); // con esta linea escaneamos lo que escribe el usuario y lo
										 // guardamos en la variable "nombre".

		System.out.print("Ingrese su Edad: "); // con esta linea le preguntamos al usuario su edad.

		int edad = leer.nextInt(); // con esta linea escaneamos lo que escribe el usuario y lo
								   // guardamos en la variable "edad"

		System.out.print("Ingrese un caracter: "); // con esta linea le pedimos al usuario un caracter.

		char c = leer.next().charAt(0); // con esta linea escaneamos lo que escribe el usuario y lo
										// guardamos en la variable "edad"

		System.out.println("\nNombre: " + nombre); // con las siguienetes lineas lo que hacemos es mostrar por pantalla
		System.out.println("Edad: " + edad); 	   // el contenido de las variables.
		System.out.println("Valor de Cahar: " + c);

	}
}