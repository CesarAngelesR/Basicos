package com.condicionales;

import java.util.Scanner;

public class Condicionales12_CAR {

	public static void main(String[] args) {
		//12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
		//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce el peso: ");
		double peso = Double.parseDouble(input.next());
		
		System.out.print("Introduce la estatura: ");
		double estatura=Double.parseDouble(input.next());
		
		double imc = peso/(Math.pow(estatura, 2));
		
		if (imc < 16) {
			System.out.println("Criterio de ingreso en hospital");
		}else if (imc>=16 && imc<=17) {
			System.out.println("Infrapeso");
		}else if (imc>=17 && imc<=18) {
			System.out.println("Bajo Peso");
		}else if (imc>=18 && imc<=25) {
			System.out.println("Peso Normal (Saludable)");
		}else if (imc>=25 && imc<=30) {
			System.out.println("Sobrepeso (Obecidad grado I)");
		}else if (imc>=30 && imc<=35) {
			System.out.println("Sobrepeso cronico (Obecidad grado II)");
		}else if (imc>=35 && imc<=40) {
			System.out.println("Obecidad premorvida (Obecidad grado III)");
		}else if (imc>=40) {
			System.out.println("Obecidad morvida");
		}
	}

}
