package Tema5;

import java.util.Arrays;

public class primerArray {

	public static void main(String[] args) {
		
		int numeros[]= new int[10];
		
		for (int i=0; i<10; i++) {
			numeros[i]= (int)(Math.random()*(1+100));
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println();
		System.out.println(numeros+"\n");
		System.out.println(numeros.length + "\n");
		
		for (int i=0; i<10; i++) {
			System.out.print(" " + numeros[i]);
		}
	}

}
