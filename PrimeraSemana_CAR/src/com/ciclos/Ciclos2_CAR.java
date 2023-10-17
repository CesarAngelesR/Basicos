package com.ciclos;

import java.util.Scanner;

public class Ciclos2_CAR {

	public static void main(String[] args) {
		/* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		23 x 95 = ???*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Introduce un numero para realizar su tabla de multiplicar: ");
		int numero = input.nextInt();
		
		System.out.print("Introduce la iteracion deseada: ");
		int iterac = input.nextInt();
		
		for (int i = 1; i <= iterac; i++) {
			System.out.println(numero + " multiplicado por " + i + "=" + (numero*i)); 
		}
		input.close();
	}

}
