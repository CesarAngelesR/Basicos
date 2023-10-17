package com;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ColeccionSet {
	
	//Tambien puede agragar datos desde una instacia u objeto.
	enum ejemploESet {Registro1, Registro2, Registro3, Registro4, Registro5};//No admite espacios.

	public static void main(String[] args) {
		
		// SET: Permitir almacenar una coleccion de elementos no repetidos y sin ordenar.
		//Ventajas: No permite elementos duplicado asegurando asi elementos no duplicados; Uso sencillo del metodo add.
		//Desventajas: No tiene acceso aleatorio; Poca eficiencia a la hora de ordenar elementos
		//Variantes:
		//HashSet: Es rapida, Sin duplidados, No ordenacion, No acceso aleratorio.
		//LinkedHashSet; Ordenacion de entrada, Eficiente al acceder, No eficiente al agregar.
		//TreeSet: Es ordenado, Poco Eficiente.
		//EnumSet: La mejor para tipos enumerado.
		//CopyOnWriteArraySet: Especifico concurrencia, Eficiente lectura, Poca eficiente escritura, Poco eficiente de eliminar.
		//ConcurrentSkipListSet: Especifico concurrencia, Admite ordenacion, Con muchos elementos no es eficiente.
		
		//Declaramos el set con el tipo de dato que vamos a guardar en ella
		Set ejemploHSet = new HashSet(); 
		Set ejemploLHS = new LinkedHashSet();
		Set ejemploTSet = new TreeSet();
		EnumSet <ejemploESet> registros = EnumSet.allOf(ejemploESet.class);
		Set ejemploASet = new CopyOnWriteArraySet();
		Set ejemploCSLSet = new ConcurrentSkipListSet();
		
		
		ejemploHSet.add("Registro 1");
		ejemploHSet.add(5);
		ejemploHSet.add('A');
		ejemploHSet.add(256.95);
		ejemploHSet.add(true);
				
		ejemploLHS.add("Registro 1");
		ejemploLHS.add(5);
		ejemploLHS.add('A');
		ejemploLHS.add(256.36);
		ejemploLHS.add(false);

		ejemploTSet.add(5);
		ejemploTSet.add(6);
		ejemploTSet.add(7);
		ejemploTSet.add(8);
		ejemploTSet.add(9);

		ejemploASet.add("Registro 1");
		ejemploASet.add(5);
		ejemploASet.add('A');
		ejemploASet.add(256.365);
		ejemploASet.add(true);
		
		ejemploCSLSet.add("Registro 1");
		ejemploCSLSet.add("Registro 2");
		ejemploCSLSet.add("Registro 3");
		ejemploCSLSet.add("Registro 4");
		ejemploCSLSet.add("Registro 5");
		
		//Algunos metodos de las colecciones tipo SET:
		//.clear() Elimina todos los elementos que contenga la coleccion
		//.size() Devuelve un int con la cantidad de elementos que estan contenidos en la coleccio
		//.toString Convierte los elementos de la coleccion en datos tipo String
		//
				
		System.out.println("Ejemplo HashSet: Puede recibir diferentes tipos de datos al no parametrizarla");
		System.out.println(ejemploHSet);
		System.out.println("\nEjemplo LinkedHashSet: Puede recibir diferentes tipos de datos al no parametrizarla");
		System.out.println(ejemploLHS);
		System.out.println("\nEjemplo TreeSet: No puede recibir diferentes tipos de datos al no parametrizarla. Unicamente recibe un tipo de dato");
		System.out.println(ejemploTSet);
		System.out.println("\nEjemplo EnumSet: No se representan como un tipo de dato sino como vectores bits");
		System.out.println(registros);
		System.out.println("\nEjemplo CopyOnWriteArraySet: Puede recibir diferentes tipos de datos al no parametrizarla");
		System.out.println(ejemploASet);
		System.out.println("\nEjemplo ConcurrentSkipListSet: No puede recibir diferentes tipos de datos al no parametrizarla. Unicamente recibe un tipo de dato");
		System.out.println(ejemploCSLSet);
		
	}

}
