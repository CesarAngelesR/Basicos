package com.ciclos;

import java.util.Scanner;

public class Ciclos3_CAR {
	public static void main(String[] args) {
		//3. Realiza un programa para determinar si un String es palíndromo. 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce la palabra o frase sin espacios: ");
		String palabra = input.nextLine(),palindromo = "";
		
		for (int i=palabra.length(); 0 < i; i--) {
			palindromo = palindromo + palabra.charAt(i-1);
		}
		System.out.println(palindromo);	
		System.out.println(palabra);
		
		if (palindromo.equalsIgnoreCase(palabra)){
		System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
	}
}
