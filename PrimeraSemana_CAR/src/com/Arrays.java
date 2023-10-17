package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays o arreglos son una estructura que nos permite almacenar un tipo de datos en comun y
		//estos no pueden crecer en tiempo de ejecucion
		
		//Declarando un array con su tamaño
		
		int [] numeros; //Tenemos declarado un array de numeros enteros sin valores asingnados ni un tamaño.
		
		int [] numeros2= new int [5];//un array declarado con su tamaño inicial, 
		//podra contener 5 numeros enteros
		
		String nombre = "Cesar";
		
		char [] name = new char [4];
		//Los elementos de un array se acceden mediante su indice, el cual comienza en 0 para el primer elemento
		//contenido en el.
		//Podemos acceder y modificar los elementos de la siguiente manera:
		
		numeros2[0] = 11;
		numeros2[1] = 12;
		numeros2[2] = 13;
		numeros2[3] = 14;
		numeros2[4] = 15;
		
		
		//Mostrar en consola un valor del array
		System.out.println(numeros2[4]);
		
		//Pordemos declarar un array con valores asignados dese un inicio
		
		int [] numeros3 = {1,2,3,4,5,6,7,8,9,10};
		
		
		//Imprimir en pantalla todos los valoes del array podemos recorrer cada una de la posiciones
		//con un ciclo
		
		for (int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
		//Podemos hacer uso del un ciclo for each
		for(int i:numeros3) {
		System.out.println(i);
		}
		//Un array es capaz de contener tipos de datos primitivos como objeto o clases:
		String [] nombres= {"Cesar", "Alanis","Rafael"}; 
		
		for (int i = 0; i < nombres.length; i ++) {
			System.out.println(nombres[i]);
		}
	}
}