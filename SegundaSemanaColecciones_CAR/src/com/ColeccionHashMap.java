package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionHashMap {

	public static void main(String[] args) {
		//En Java se usa HashMap para almacenar elementos en pares clave/valor y puedes acceder 
		//a estos elementos almacenados en un HashMap utilizando la clave del elemento, 
		//que es �nica para cada elemento. 
		//Caracteristicas:
		/*Los elementos se almacenan en pares clave/valor.
		*Los elementos no mantienen ning�n orden cuando se agregan. Los datos est�n desordenados.
		*En caso de que hayan claves duplicadas, la �ltima anular� a las otras.
		*Los tipos de datos se especifican utilizando clases contenedoras en lugar de tipos de datos primitivos.*/
		
		//Sintaxis de un HasMap 
		//HashMap<KeyDataType, ValueDataType> MiHashMap = new HashMap<>();
		
		//En la sintaxis anterior:
		/*KeyDataType indica el tipo de datos de todas las claves que se almacenar�n en el archivo HashMap.
		*valueDataType indica el tipo de datos de todos los valores que se almacenar�n en el HashMap.
		*MiHashMap es el nombre que le damos al HashMap.*/
		Map<Integer, String> hashMap = new HashMap<>();
		
		Map<Integer, Integer> hashMap1 = new HashMap<>();
		
		//Agregar Elementos a un HashMap
		//Para agregar elementos a un HashMap, hacemos uso del m�todo put(). 
		//Toma dos par�metros: la clave y el valor del elemento que se agrega.
		hashMap.put(1, "Registro 1");
        hashMap.put(2, "Registro 2");
        hashMap.put(3, "Registro 3");
        hashMap.put(4, "Registro 4");
        
        System.out.println(hashMap);
        
        //Acceder a los Elementos de un HashMap con get()
        //Este m�todo toma un par�metro: la clave del elemento al que se accede.
        System.out.println(hashMap.get(2));//Puedes usar el m�todo get() para acceder a los elementos 
        //almacenados en un archivo HashMap.
        
        //Cambiar el Valor de los Elementos de un HashMap
        //Para cambiar el valor de los elementos de un HashMap, hacemos uso del m�todo replace(). 
        //Se necesitan dos par�metros: la clave del emento que se cambiar� y el nuevo valor que se le asignar�:
        hashMap.replace(1, "Registro 0");
        hashMap.replace(2, "Registro 1");
        hashMap.replace(3, "Registro 2");
        hashMap.replace(4, "Registro 3");
        
        System.out.println(hashMap);
        
        //Eliminar Elementos de un HashMap
        //Puedes usar el m�todo remove() para eliminar el elemento de un archivo HashMap. 
        //Toma un par�metro: la clave del elemento que se eliminar�.
        
        hashMap.remove(4);
        
        System.out.println(hashMap);
        
        System.out.println(hashMap.size()); //Devuelve el n�mero de elementos en un HashMap.
        
        //Para eliminar todos los elementos del HashMap
        hashMap.clear();
        System.out.println(hashMap);	
        
        //No es posible contener distintos tipos de datos ya que desde que es instanciada debe de declararse el tipo de
        //dato que va a contener.
        
        hashMap1.put(1, 1);
        hashMap1.put(2, 2);
        hashMap1.put(3, 3);
        hashMap1.put(4, 4);
        
        System.out.println(hashMap1.toString());//Cambia los elementos de la coleccion a String si son de otro tipo de dato
        System.out.println(hashMap1);
        
	}

}
