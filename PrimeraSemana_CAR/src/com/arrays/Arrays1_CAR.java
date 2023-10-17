package com.arrays;

import java.util.Scanner;

public class Arrays1_CAR {
	public static void main(String[] args) {
		
	/*1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
	Muestra por consola el índice y el valor al que corresponde.*/
		
		Scanner input = new Scanner(System.in);
		int[] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese el numumero del indice " + i + ":");
			numeros[i]=input.nextInt();
		}
		input.close();
		System.out.println("El array se ha completado, estos son los numeros: ");
		for (int i = 0; i < numeros.length; i ++) {
			System.out.println("En el indice " + i + " esta el numero " +numeros[i]);
		}
	}
}
