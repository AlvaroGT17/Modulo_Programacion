package Tema1y4;

public class EjercicioPizarra220221025 {

	public static void main(String[] strg) {
		
		// Aqui llamamos a la funciÃ³n leer declarando 
		int x = -20;
		int c = leer(x);
		System.out.println("Número de cifras de: " + x + " = " + c);

		// De esta forma llamamos a la funcion dentro de la impresion por pantalla.
		
		System.out.println("Número de cifras de: 0 es: " + leer(0));
		System.out.println("Número de cifras de: 10 es: " + leer(10));
		System.out.println("Número de cifras de: 200 es: " + leer(200));
		System.out.println("Número de cifras de: 3000 es: " + leer(3000));
		System.out.println("Número de cifras de: 40000 es: " + leer(40000));
		System.out.println("Número de cifras de: 500000 es: " + leer(500000));

	}

	// Creamos el metodo que compara los numeros y nos dice cuantos digitos tenemos en el nÃºmero ingresado.
	
	static int leer(int n) {

		int numero = 0;

		if (n < 0 || n > 99999) {
			numero = -1;
		} else if (n < 10) {
			numero = 1;
		} else if (n < 100) {
			numero = 2;
		} else if (n < 1000) {
			numero = 3;
		} else if (n < 10000) {
			numero = 4;
		} else {
			numero = 5;

		}
		return numero;
	}
}
