package com.ciclos;

import java.util.Scanner;

public class Ciclos801_CAR {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1, numero2, menor, mayor;

		do {
			System.out.print("Introduce un número entero: ");
			numero1 = sc.nextInt();
			System.out.print("Introduce otro número entero distinto del anterior: ");
			numero2 = sc.nextInt();
			if (numero1 == numero2) {
				System.out.println("Debes introducir dos números distintos");
			}
		} while (numero1 == numero2);

		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}

		System.out.println("Números desde " + menor + " hasta " + mayor + " : ");
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
