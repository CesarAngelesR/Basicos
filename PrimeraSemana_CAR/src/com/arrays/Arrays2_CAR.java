package com.arrays;

import java.util.Scanner;

public class Arrays2_CAR {

	public static void main(String[] args) {
		/* 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		1 al 100. Obt�n la suma de todos ellos y la media.*/
		
		int [] numeros = new int [100];
		double suma=0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
			suma+=(i+1);
		}
		System.out.println("La sumatoria de los numeros del 1 al 100 es: " + (int)suma + " y la media es: " + (suma/=100));
	}
}
