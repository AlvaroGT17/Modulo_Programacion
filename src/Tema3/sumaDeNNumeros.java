package Tema3;

import java.nio.file.FileSystemLoopException;
import java.util.Scanner;

public class sumaDeNNumeros {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n=0;
		int c=0;
		int suma=0;
		int num=0;
		
		do {
			System.out.print("Ingrese el numero de cifras que quiere introducir:");
			n=teclado.nextInt();
			teclado.nextLine();
			if (n<=0) {
				System.out.println("Lo lamento el número es 0 o menor, intentelo de nuevo.");
			}
			
		}while (c<n); {
			System.out.print("Ingrese el numero a sumar:");
			num= teclado.nextInt();
			suma=suma=num;
		}
		
		System.out.print("La suma de los " + n+ " numero es: " + suma);                                                             
		
	}

}
