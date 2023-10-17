package com.ciclos;

import java.util.Scanner;

public class Ciclos4_CAR {

	public static void main(String[] args) {
		/*
		 * 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como
		 * resultado cuántas veces existe esa letra dentro de la frase. Si no existe,
		 * imprimir un mensaje “Carácter no encontrado”.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = input.nextLine();

		System.out.print("Introduce la letra a contar (Reconoce entre minusculas y mayusculas): ");
		char letra = input.next().charAt(0);
		String contador = "";
		int c = 0;

		for (int i = 1; i <= frase.length(); i++) {
			if (letra == frase.charAt(i - 1)) {
				c++;
			}

		}
		if (c == 0) {
			System.out.println("Caracter no encontrado");
		} else {
			System.out.print("El numero de veces que existe " + letra + " es: " + c);
		}
	}
}
