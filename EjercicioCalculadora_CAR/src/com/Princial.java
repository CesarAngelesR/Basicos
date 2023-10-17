package com;

import java.util.Scanner;

public class Princial {

	public static void main(String[] args) {
		//Crar clase calculadora
		//le declaran atributos (Caracteristicas de una calculadora (fisicas))
		//Generan metodos, contructores, GT ST
		//Declarar 4 metodos abstractos:sumar, restar, multiplica, dividir.
		//Esto hara que la clase calculadora sea abstracta y entoces crear otra clase que se
		//llame cientifica, heredando de calculadora e implementara los metodos y ustedes 
		//definiran las operaciones
		
		Scanner input = new Scanner(System.in);
		
		Cientifica cient = new Cientifica("CASIO","NEGRO", "2023");
		
		System.out.print("Que poreacion desea realiza; s=suma, r=resta, m=multiplicacion, d=divicion: ");
		char seleccion=input.next().charAt(0);
		String tipo = null;
		double operacion=0.0;
		
		if (seleccion == 's'|| seleccion =='S') {
			System.out.print("Ingrese los numeros que desea sumar: ");
			double n1= input.nextDouble();
			double n2= input.nextDouble();
			operacion = cient.suma(n1, n2);
			System.out.println(cient);
			tipo = "suma";
			
			
		}else if (seleccion == 'r'||seleccion == 'R') {
			System.out.print("Ingrese los numeros que desea restar: ");
			double n1= input.nextDouble();
			double n2= input.nextDouble();
			operacion = cient.resta(n1, n2);
			System.out.println(cient);
			tipo = "resta";
			
		}else if (seleccion == 'm'||seleccion == 'M') {
			System.out.print("Ingrese los numeros que desea multiplicar: ");
			double n1= input.nextDouble();
			double n2= input.nextDouble();
			operacion = cient.multiplicacion(n1, n2);
			System.out.println(cient);
			tipo = "multipliacion";
			
		}else if (seleccion == 'd'||seleccion == 'D') {
			System.out.print("Ingrese los numeros que desea dividir: ");
			double n1= input.nextDouble();
			double n2= input.nextDouble();
			operacion = cient.divicion(n1, n2);
			System.out.println(cient);
			tipo = "Divicion";
			
		}
		else {
			System.out.println("Valores no encontrados");
		}
		
		System.out.println("El resultado de la " + tipo + " es: " + operacion);
		
		cient.tomarTemperatura();
		//Las clases pueden tomar comportamientos de 3 lados:
		//1.-Metodos Propios
		//2.-De otras clases (Clases Padre)/Clase Abstracta
		//3.-Interfases
		
	}

}
