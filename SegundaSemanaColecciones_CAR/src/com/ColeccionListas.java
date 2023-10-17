package com;


import java.util.ArrayList;
import java.util.List;

public class ColeccionListas {

	public static void main(String[] args) {
		// COLECCIONES
		//Listas, Set, Vector, HashMap
		
		//Listas: Estructura secuencial donde cada elemento tiene un indice o posicion, se le puede conocer como array unidimencional
		//El primer elemento ocupa la posicion 0, Admitiendo objetos repetidos (elementos repetidos)
		
		//Declarando una lista con el tipo de dato que vamos a guardar en ella
		
		List <String> texto = new ArrayList<String>();
		
		List <Integer> enteros = new ArrayList<Integer>();
		
		//Agragr elementos a nuestra lista
		texto.add("Elemento 1");
		texto.add("Elemento 2");
		texto.add("Elemento 3");
		
		enteros.add(1);
		enteros.add(2);
		
		//Mostrar elementos de la lista
		System.out.println(texto);
		
		//Mostrar un elemento especifico de mi lista
		System.out.println(texto.get(1));
		
		//Devolver un valor True si el elemento exite en la lista
		System.out.println(texto.contains("Elemento 3"));
		
		//Eliminar elementos mediante la posicion
		texto.remove(2);
		System.out.println(texto);
		//Mediante el objeto
		texto.remove("Elemento 1");
		System.out.println(texto);
		
		//Agregar una posicion en el indice y desplaza a los demas
		texto.add(1,"///");
		System.out.println(texto);
		
		//Si queremos sustituir un valor de una posicion
		texto.set(1, "Otra cosa");
		System.out.println(texto);
		
		//Declara una lista sin parametrisarla, es decir, sin indicar el tipo de dato que va a contener
		
		List coleccion = new ArrayList();
		coleccion.add("Arendiendo de colecciones");
		coleccion.add(1);
		coleccion.add(3.5);
		coleccion.add(true);
		coleccion.add('ñ');
		System.out.println(coleccion);
		
		//Mostrando los elementos de la lista de manera individual
		
		for (int i = 0; i<coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}
	}

}
