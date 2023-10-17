package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader, BufferReader y FileWriter
		
		//Intentar realizar la lectura de un archivo de prueba
		
		String linea;
		
		//En ocasiones para realizar la comunicacion efectiva de algun documento o comunicarnos
		//con un programa externo, es recomendable el uso try-catch.
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			//Clase file -Representar en el archivo de memoria
			File archivo = new File("C:\\Users\\gdelo\\OneDrive\\Escritorio\\archivo.txt");//le pasamos como argumento la ruta de nuestro archiv
			/*FileReader-Permite abrir el archivo para la lectura
			FileReader fr = new FileReader(archivo);
			//BufferReader-Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			//Vamos a crear un ciclo en caso de que nuestro archivo tenga varias lineas de texto
			while ((linea = buffer.readLine())!=null){
				System.out.println(linea);
			}*/
			
			String texto = "\nCesar Angeles Rodriguez\n";
			//FileWriter -Escribe o pasa un valor de caracter o String a mi archivo
			FileWriter line= new FileWriter(archivo, true);
			//para que la clase FileWriter respete el contenido origial de mi archivo,
			//tengo que indicar un valor boolean en true
			
			line.write(texto);//Escibimos el String en el documento
			line.close();//confirmamos cambio y se cierra el proceso de escritura
					
		} catch (Exception e) {//Si ocurre un error o excepcion,
			//se ejecuta lo siguiente
			System.out.println("Archivo no encontrado");
			//si necesito saber que esta ocurriendo con el bloque try puedo mandar a imprimir la
			//traza del error
			System.out.println(e);
			//o
			e.printStackTrace();
		}

	}

}
