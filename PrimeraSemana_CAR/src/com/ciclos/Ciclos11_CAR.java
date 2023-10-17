package com.ciclos;

import java.util.Scanner;

public class Ciclos11_CAR {

	public static void main(String[] args) {
		/* 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		ancho y el alto. Ejemplo: 8 x 8*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese el numero de ancho: ");
		int ancho = input.nextInt();
		
		System.out.print("Ingrese el numero de alto: ");
		int alto = input.nextInt();
		
		char punto = '*';
		String linea = "";
		
		for (int i = 0; i < ancho; i++) {
			linea = linea + punto;
		}
		
		for (int i = 0; i < alto; i++) {
			System.out.println(linea);
		}
	}

}
