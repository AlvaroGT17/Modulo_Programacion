package Tema1y4;
//Realiza una función que reciba dos números y devuelva el producto.
//Realiza una función que reciba dos números y muestre en pantalla el producto.
//Realiza el método main() que haga uso de las funciones anteriores. Los números
//que se envían a la función se leerán de teclado.


public class Actividad1PDF {

	public static void main(String[] args) {
		
		System.out.print("El resultado de la multiplicacion es: " + producto(32,2));

	}

	public static int producto(int a , int b) {
		
		int producto= a*b;
		return producto;
		
	}
}
