package com.arrays;

import java.util.Scanner;

public class Arrays3_CAR {

	public static void main(String[] args) {
		/* 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		caracteres.*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese la frase para agregar al Array: ");
		String frase=input.nextLine();
		input.close();
		char [] arrayFrase = new char[frase.length()] ;
		for (int i = 0; i < frase.length(); i++) {
			arrayFrase[i]=frase.charAt(i);
		}
		System.out.println("El Array quedo de la siguiente manera: ");
		for (int i = 0; i < arrayFrase.length; i ++) {
			System.out.print(arrayFrase[i]);
		}
	}

}
