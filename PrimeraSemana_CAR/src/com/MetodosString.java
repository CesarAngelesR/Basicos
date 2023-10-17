package com;

public class MetodosString {

	public static void main(String[] args) {
		//Metodos de la clase String
		
		//Declaramos una cadena de texto 
		String cadena = "Hoy es 8 de agosto de 2023";
		
		//.length(): Devuelve el tamaño de la cadena de texto a un valor numerico entero
		System.out.println("La cantidad de caracteres es: " + cadena.length());
		
		//.charAt(): Nos devuelve el indice o posicion en la que se encuentra determinado
		//caracter en la cadena de texto
		System.out.println("El  caracter seleccionado de la cadena es: " + cadena.charAt(25));
		System.out.println("El equivalente es: " + (cadena.charAt(cadena.length()-1)));

		//.substring - Nos devuelve una subcadena a partir del indice especificado
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(5,10));
		
		//.toLowerCase()/toUpperCase()-Convierte la cadena a minusculas o mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals()-compara el valor de un objeto
		System.out.println("Es igual = " + cadena.equals("hoy es 8 de agosto de 2023"));
		
		//.equalsIgnoreCase()-compara las cadenas ignorando el uso de mayusculas y minusculas
		System.out.println("Es igual = " + cadena.equalsIgnoreCase("hoy es 8 de agosto de 2023"));
		
		//.replace -reemplaza las apariciones de un texto o caracter contro que indiquemos
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "/"));

	}

}
