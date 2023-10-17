package com;

import java.util.Scanner;

public class EntradaDeDatos {
	public static void main(String[] args) {
		//Vamos a a prender a introducir valores
		//por teclado haciendo uso de scanner
		
		//Declarar la variable para guardar el tipo de dato a solicitar
		
		int edad;
		String nombre;
		//Creamos una instancia o variable de la clase Scanner
		Scanner input = new Scanner (System.in);
		
		//Enviamos mensaje en la consola que nos indique que hacer
		System.out.print("Ingresa tu edad: ");
		edad = input.nextInt();//Permite leer un numero entero introducido por el teclado.
		
		input.nextLine();
		
		System.out.print("Introduce tu nombre: ");
		nombre = input.nextLine();
		
		//Al tener instanciado un objeto de la clase scanner no es necesario crear otro
		//para volver a introducir datos
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
		
		input.close();//Si ya no voy a introducir mas valores por teclado
		//cierro scanner para ahorrar espacio en memoria
		
		/*System.out.print("Introduce 2 numero: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("La suma de x + y = " + (x+y));
		*/
	}

}
