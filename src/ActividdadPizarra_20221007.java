
public class ActividdadPizarra_20221007 {

	public static void main(String[] args) {

		System.out.println("Llamada 1 al metodo saludar");
		Saludar();

		System.out.println("Llamada 2 al metodo saludar");
		Saludar();

		System.out.println("Llamada 3 al metodo saludar");
		Saludar();

		System.out.println("Hagamos un suma ");
		SumaNumeros(20, 30);
		
		int s= SumaDosNumeros(34, 234);

	}

	// Función sin parámetros, visualiza 2 saludos en pantalla
	// No recibe ni devuelve ningún valor

	private static void Saludar() {

		System.out.println("Buenos dias");
		System.out.println("Saludos dede guradalajara");
	}

	// Función que recibe 2 parámetros enteros y muestra la suma en pantalla

	private static void SumaNumeros(int a, int b) {
		int suma = a + b;

		System.out.println("La suma es: " + suma);
	}

	// Función que recibe 2 parámetros enteros y devuelve la suma
	private static int SumaDosNumeros(int a, int b) {
		int suma = a + b;
		return suma;
	}
}
