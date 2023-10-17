package com.condicionales;

import java.util.Scanner;

public class Condicionales8_CAR {

	public static void main(String[] args) {
		/*
		 * 8. Realiza un programa que pida por teclado el resultado (dato entero)
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		 * letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		 * caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		 * mostrará el mensaje: “ERROR: número incorrecto”.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese el numero obtenido al tirar el dado: ");
		int numero = input.nextInt();

		String dato;

		switch (numero) {
		case 1:
			dato = "seis";
			System.out.println("El numero de la casa opuesta es " + dato + " (Numero de letras: " + dato.length() + ")");

			break;
		case 2:
			dato = "cinco";
			System.out.println("El numero de la casa opuesta es " + dato + " (Numero de letras: " + dato.length() + ")");

			break;

		case 3:
			dato = "cuatro";
			System.out.println("El numero de la casa opuesta es " + dato + " (Numero de letras: " + dato.length() + ")");

			break;

		case 4:
			dato = "tres";
			System.out.println("El numero de la casa opuesta es " + dato + " (Numero de letras: " + dato.length() + ")");

			break;
		case 5:
			dato = "dos";
			System.out.println("El numero de la casa opuesta es " + dato + " (Numero de letras: " + dato.length() + ")");

			break;
		case 6:
			dato = "uno";
			System.out.println("El numero de la casa opuesta es " + dato + " (Numero de letras: " + dato.length() + ")");

			break;

		default:
			System.out.println("Este numero es incorrecto");
			break;
		}
	}

}