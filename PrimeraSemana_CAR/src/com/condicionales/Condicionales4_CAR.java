package com.condicionales;

import java.util.Scanner;

public class Condicionales4_CAR {
	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y
		// compruebe si es una letra mayúscula.

		Scanner input = new Scanner(System.in);

		System.out.print("Escriba una palabra: ");
		String cadena = input.next();

		for (int i = 0; i < cadena.length(); i++) {

			if (Character.isUpperCase(cadena.charAt(i))) {
				System.out.println("La letra " + cadena.charAt(i) + " es mayuscula");
			} else {
				System.out.println("La letra " + cadena.charAt(i) + " es minuscula");
			}

		}

	}

}
