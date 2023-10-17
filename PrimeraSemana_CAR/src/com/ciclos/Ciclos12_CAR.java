package com.ciclos;

import java.util.Scanner;

public class Ciclos12_CAR {

	public static void main(String[] args) {
		/*12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		cuando el promedio de las edades sea superior a 25*/
		
		Scanner input = new Scanner(System.in);
		
		int edad, promedio=0, sumaEdad=0, c=0;
		
		while (promedio < 25) {
			c++;
			System.out.print("Ingrese la edad: ");
			edad=input.nextInt();
			sumaEdad+=edad;
			promedio=sumaEdad/c;			
		}
		System.out.println("El programa terminó, el promedio es: " + promedio);
	}

}
