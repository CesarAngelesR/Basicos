package com;

import java.util.Vector;

public class ColeccionVector {

	public static void main(String[] args) {
		//Vector: Es similar a un Array, la diferencia estriba en que un vector crece automáticamente 
		//cuando alcanza la dimensión inicial máxima. 
		//Además, proporciona métodos adicionales para añadir, eliminar elementos, e insertar elementos entre otros dos existentes.
		
		//Cuando creamos un vector u objeto de la clase Vector, podemos especificar su dimensión inicial, 
		//y cuanto crecerá si rebasamos dicha dimensión.
		Vector vector = new Vector(20, 5);//Tenemos un vector con una dimensión inicial de 20 elementos. Si rebasamos dicha dimensión 
		//y guardamos 21 elementos la dimensión del vector crece a 25.
		
		//Al segundo constructor, solamente se le pasa la dimensión inicial.
		Vector vector2=new Vector(20);//Si se rebasa la dimensión inicial guardando 21 elementos, la dimensión del vector se duplica.
		
		//Con el tercer constructor, se crea un vector cuya dimensión inicial es 10.
		Vector vector3=new Vector();//La dimensión del vector se duplica si se rebasa la dimensión inicial, por ejemplo, cuando se pretende guardar once elementos.
		
		//Con .add vamos añadiendo registros a la coleccion
		vector.add("Registro 1");
		vector.add("Registro 2");
		vector.add("Registro 3");
		vector.add("Registro 4");
		vector.add("Registro 5");
		
		System.out.println(vector);
		
		//Inserta un registro en la coleccion en la posicion del indice que es despues de la coma
		vector.insertElementAt("Registro 0", 0); 
		System.out.println(vector);
		
		//Eliminar elementos:
		vector.remove(5);//Mediante posicion.
		System.out.println(vector);
		vector.remove("Registro 4");//Mediante el objeto.
		System.out.println(vector);
		
		//Agregar una posicion en el indice y desplaza a los demas
		vector.add(1,"///");
		System.out.println(vector);
		
		//Si queremos sustituir un valor de una posicion
		vector.set(1, "Otro ejemplo");
		System.out.println(vector);
		
		//Devuelve el numero de elementos de la coleccion
		System.out.println("Numero  de elementos: " + vector.size());
		//Devuelve la dimencion de la coleccion
	    System.out.println("Dimension de la coleccion: " + vector.capacity());
	    
	    //Mostrando los elementos de la lista de manera individual
        for(int i=0; i<vector.size(); i++){
            System.out.println(vector.elementAt(i));
        }
        
        //Declara una lista sin parametrisarla, es decir, sin indicar el tipo de dato que va a contener
        vector2.add("Registro1");
        vector2.add(2);
        vector2.add(3.33);
        vector2.add('4');
        vector2.add(true);
        
        System.out.println(vector2);
	}

}
