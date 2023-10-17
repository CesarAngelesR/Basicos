package com; //La primera linea indica el nombre del paquete

public class TiposDeDatos {//Este es el nombre de la clase
	public static void main(String[] args) {//Metodo "main"
		//Comentario de una linea se les pone
		//dos diagonales antes del enunciado
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 * Nombres de los paquetes-inician con minusculas
		 * Nombres de las clases-inician con mayusculas
		 * Respetamos uso de CamelCase
		*/
		
		//Para guardar cambios en el codigo usamos Ctrl + S
		
		//Declaracion de tipos de datos
			/*Tipos de datos primitivos
			 * NUMEROS ENTEROS
			 */
		//Declarando variables de esto tipos de datos
		byte numero1; //byte -128 a 127: variable declarada, sin valor asignado
		short numero2;//No pueden existir nombres de variables duplicados aunque contengan
		//distinto tipo de dato
		int numero3;//emplea 4 bites de memoria
		long numero4; 
		
		numero1 = 5;//Las variables declaradas sin valores se les asigna un valor posteriormente
		numero1 = 9;//Puedo asignar valores posteriores pero recordemos que existe la verticalidad
		//por lo que ahora vale 9 y se omite su valor atrasado.
		
		//Variables declaradas con un valor asignado inicialmente
		byte numero5=127;//Emplea 1 byte de memoria.
		short numero6=32767;//Emplea 2 bytes de memoria
		int numero7=2147483647;//Emplea 4 byte de memoria
		long numero8=2147483649l;//Emplea 8 bytes Las variables de tipo long una ves exeden 
		//el rango del valor de int necesita utilizar un sufijo "L" mayuscula o minuscula para poder contener el valor.
		//La variable mas utilizada de los numericos enteros es la de tipo "int"
		
		/*TIPOS DE DATOS PRIMITIVOS
		 * NUMEROS EN PUNTO O COMA FLOTANTE(DECIMALES)
		 */
		float numero9 =9.89f;
		//Float ocupa 4 bytes y necesita emplear el sufijo "F" mayuscula o miniscula para contener el
		//valor asignado
		double numero10 = 9.89;//Ocupa 8 bytes 
		//La variable comodin a utilizar es la tipo "double"
		
		
		//TIPOS DE DATOS PRIMITIVOS
		/*Booleans
		 * 
		 */
		boolean evalua = true; //Facilitan el trabajo al evaluar condiciones o expresiones
		//Solo admiten valores true o false.
		
		char caracter = 'n';//Puede contener un solo caracter 
		//Se le asigna el valor de ese caracter entre comilla simple
		
		/*TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATOS ESTRUCTURADOS
		 * TIPOS DE DATO OBJETO
		 * TIPOS DE DATO REFERENCIALES
		 * TIPOS DE DATO ENVOLTORIO
		 */
		
		//Cadena de Texto (String)
		
		String cadena = "Hola mundo hoy es martes 8 de agosto";
		
		String nombre = "Cesar Angeles Rodriguez";
		//El tipo de dato String admite  secuencia de caracteres
		//letras, simbolos, espacios, numeros
		//Pero al admitir valores numericos podemos hacer opreaciones con ellos
		
		//Tipos de datos Envoltorio
		Byte numero11 = 127;
		Short numero12 = 3000;
		Integer numer13 = 2000000;
		Long numero14 = 2000000000000l;
		Double numero15 = 351205.235;
		Float numero16 = 45624.24415f;
		Character letra = 'k';
		
		numero11.toString();//Las funcionalidades de los tipos de datos envoltorio se visualizan
		//al escribir un punto "." despues del nombre de la variable para utilizar esa propiedad 
		//de acuerdo a lo que necesitemos realizar
		
		//Para poder darle salida a nuestros datos y visualizarlos en consola
		System.out.println("Hola mundo");
		System.out.println(numero12);
		System.out.println((numero12 + numero11));
		
		//Concatenacion es mostrar dos instrucciones distintas
		System.out.println("El resultado es " + (numero12 + numero11));
	}

}
