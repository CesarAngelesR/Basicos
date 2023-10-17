package com.arrays;

import java.util.Scanner;

public class Arrays2_CAR {

	public static void main(String[] args) {
		/* 2. Crea un array de números de 100 posiciones, que contendrá los números del 
		1 al 100. Obtén la suma de todos ellos y la media.*/
		
		int [] numeros = new int [100];
		double suma=0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
			suma+=(i+1);
		}
		System.out.println("La sumatoria de los numeros del 1 al 100 es: " + (int)suma + " y la media es: " + (suma/=100));
	}
}
