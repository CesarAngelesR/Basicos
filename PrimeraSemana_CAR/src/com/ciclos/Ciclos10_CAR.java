package com.ciclos;

import java.util.Scanner;

public class Ciclos10_CAR {

	public static void main(String[] args) {
		/* 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
		impares y además muestre la sumatoria de los positivos y sumatoria de los impares.*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int numero = input.nextInt(), numerorest = numero - 10, numerosum = numero + 10, sumaPosit=0, sumaImp=0;

		for (int i = numerorest; i < numerosum; i++) {
			if (i<0) {
				System.out.print(i + " negativo,");
				if(i%2==0) {
					System.out.println(" es par");
				}else {
					System.out.println(" es impar");
				}
			}else if(i>0) {
				System.out.print(i + " positivo,");
				sumaPosit+=i;
				if(i%2==0) {
					System.out.println(" es par");
				}else {
					sumaImp+=i;
					System.out.println(" es impar");
				}
			}else {
				System.out.println("0 Es cero.");
			}
		}
		input.close();
		System.out.println("La sumatoria de los numeros positivos es: " + sumaPosit);
		System.out.println("La sumatoria de los numeros impares es: " + sumaImp);
	}
}