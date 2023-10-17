package com.ciclos;

import java.util.Scanner;

public class Ciclos9_CAR {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos

		Scanner input = new Scanner(System.in);
		int numero1, numero2, menor, mayor;

		System.out.print("Introduce el primer numero: ");
		numero1 = input.nextInt();
		System.out.print("Introduce el segundo numero que sea distinto al primero: ");
		numero2 = input.nextInt();

		if (numero1 == numero2) {
			System.out.println("Debes introducir dos números distintos");
		} else {

			while (numero1 > 0 || numero2 > 0) {

				if (numero1 > numero2) {
					mayor = numero1;
					menor = numero2;
					numero1 = 0;
					numero2 = 0;
				} else {
					mayor = numero2;
					menor = numero1;
					numero1 = 0;
					numero2 = 0;
				}
				System.out.println("Números pares desde " + menor + " hasta " + mayor + ": ");
				for (int i = menor; i <= mayor; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
			}
		}
	}
}