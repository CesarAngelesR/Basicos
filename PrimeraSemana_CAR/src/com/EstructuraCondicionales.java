package com;

import java.util.Scanner;

public class EstructuraCondicionales {

	public static void main(String[] args) {
		/*//Estructuras de desicion - if - valores booleans
		
		int x = 9;
		
		if (x <= 9) {//Si la condicion se cumple, realiza lo siguiente
			System.out.println("Si");//Si no se cumple la condicion esta linea no se ejecuta
		}else {//Si la condicion no se cumple ejecuta lo siguiente
			System.out.println("No");
		}
		
		String nombre = "Murcielago";
		System.out.println(nombre.length());
		
		//Condiciones compuestas con operadores logicos AND, OR, NOT, DFERENTE DE, IGUALDAD
		
		//AND - && Devuelve true cuando se cumplen todas las condiciones
		if (nombre.length()<20 && nombre.length()>11) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//OR - || Devuelve true cuando se cumplen con alguna de las condiciones
		if (nombre.length()<20 || nombre.length()>11) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//IGUALDAD o comparacion -==-Revisa o compara si el valor asignado es el mismo contra el que
		//lo vamos a comparar
		//Con un solo igual -=- lo que hacemos es asignar un valor a la variable
		if (x==100) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		//DIFERENTE DE -!=- Compara los valores y manda true si son diferentes
		if (x!=9) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//NOT -!- Niega una condicion (Cambia el valor de true a false y viseversa)
		if (!(x==9)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		*/
		
		//Estructura If-else concatenado o anidado
		
		int d = 3;
		
		/*if (d==1) {
			System.out.println("Lunes");
		}else if (d==2){
			System.out.println("Martes");
		}else if (d==3){
			System.out.println("Miercoles");
		}else if (d==4){
			System.out.println("Jueves");
		}else if (d==5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}*/
		
		//Estructura de desicion SWITCH CASE
		
		Scanner input=new Scanner(System.in);
		System.out.println("Ingresa un numero");
		d=input.nextInt();
		
		switch (d) {
		case 1:System.out.println("Lunes");
			
			break;
		case 2:System.out.println("Martes");
		
		break;
		case 3:System.out.println("Miercoles");
		
		break;
		case 4:System.out.println("Jueves");
		
		break;
		case 5:System.out.println("Viernes");
		
		break;

		default:System.out.println("Desconocido");
			break;
		}
		
		
	}//Cierre del main

}//Cierre de la clase
