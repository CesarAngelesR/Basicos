package com.ciclos;

import java.util.Scanner;

public class Ciclos6_CAR {

	public static void main(String[] args) {
		/* 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		todo el dinero lo reinvierte?*/
		Scanner input = new Scanner(System.in);
		
		double inversion = 1000.00;
		
		for (int i = 1; i <= 12; i++) {
			inversion = inversion + (inversion*.02);
			System.out.println("La inversion del mes " + i + " es: $" + String.format("%.2f",inversion));
		}

	}

}
