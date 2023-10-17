package com.condicionales;

import java.util.Scanner;

public class Condicionales2_CAR {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		Scanner input = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		int numero = input.nextInt();
		
		if (numero%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}

	}
}
