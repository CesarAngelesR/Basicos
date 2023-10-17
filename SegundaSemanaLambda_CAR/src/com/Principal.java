package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// Las funciones LAMBDA fueron introducidas en Java8 junto con otras funciones 
		
		//Sinonimos de expresiones LAMBDA: Funcion Anonima, Funciones de Cierre, Closures, Metodos Anonimos.
		//Implementan un metodo de una interfase funcional.
		
		//Sintaxis: (parametros)->{cuerpo-lamda}
		//*El opreador lambda -> separa la declaracion de parametros de la declaracion del cuerpo de la funcion
		//*Parametros: Cuando se tiene un solo parametro no es necesario usar parentesis.
		//	cuando no se tienen parametros, o cunado se tiene dos o mas es necesario usar parentesis.
		//*Cuerpo de lambda: Cuando el cuerpo de la expresion lambda tiene una unica linea no es necsario
		// utilizar llaves y no necesitan especificar la clausura return en el caso de que deban devolver valores.
		//	Cuando el cuerpo de la expresion lambda tiene mas de una linea se hace necesario utilizar llaves y es
		// 	necesario incluir la clausura return en el caso de que la funcion deba devolver un valor.
		
		IEjemplo mensajeNuevo = (n) -> System.out.println(n +", Bienvenido a las expresiones LAMBDA\n");
		
		mensajeNuevo.mensaje("Cesar");
		
		ICalculadora calculadora = (n1,n2)->{
			double resultado = n1+n2;
			System.out.println("El resultado de la suma es: " + resultado);
		};
		calculadora.operacion(5, 8);
		
		
		ICalculadora calculadora1 = (n1,n2)->{
			double resultado = n1-n2;
			System.out.println("El resultado de la resta es: " + resultado + "\n");
		};
		calculadora1.operacion(15, 9);
		
		//Partimos de una interfaz funcional y atravez de expresiones lambda implementamos
		//de diferentes maneras un mismo metodo definido en la clase ejecutora
		
		List <String>listaNombres = new ArrayList<>();
		listaNombres.add("Jose");
		listaNombres.add("Pedro");
		listaNombres.add("Cesar");
		listaNombres.add("Luis");
		listaNombres.add("Carlos");
		
		System.out.println(listaNombres);
		System.out.print("\n");
		
		//Haciendo uso de forEach con un consumer donde decimos que lista es la lista de nombres
		//La expresion que se encuentra antes del simbolo lambda indica que nombre de la lista que es el
		//parametro y el sysout es el cuerpo del lambda.
		
		listaNombres.forEach(lista -> System.out.println("Nombre: " + lista));
		System.out.print("\n");
		//Se crea un ArrayList que contengra valorew de tipo enteros
		
		//Uso de API STREAM
		//La API Stream ofrece un enfoque alternativo de "tuberías y filtros" 
		//para el procesamiento de colecciones
		//La API Stream te proporciona una forma de procesar datos de manera 
		//más eficiente al realizar una única ejecución sobre ellos, independientemente 
		//de la cantidad de información que estés procesando o de si estás 
		//realizando múltiples cálculos
		
		//Forma de declarar un Stream
		
		//Forma1:Creando un objeto Stram e ingresando los valores
		Stream<String> streamDeString = Stream.of("Jose","Luis","Juan","Antonio");
		
		//Transformando un Stream a una coleccion:
		List<String> lista3 = streamDeString.collect(Collectors.toList());
		System.out.println("Stream convertido a List: " + lista3);
		System.out.print("\n");
		
		//Forma2:Creando una coleccion o lista y posteriormente indicando al nombre
		//de la coleccion que es un Stream mediante .stream()
		List <String> lista0 = Arrays.asList("Jose","Luis","Juan","Antonio");
		lista0.stream();
		
		List <Integer>lista = new ArrayList<>();
		//Se agregan valores a la lista.
		lista.add(10);
		lista.add(15);
		lista.add(13);
		lista.add(30);
		lista.add(25);
		lista.add(22);
		
		//Utilisamos el Stream junto con la expresion lambda para realizar un filtro dentro de un
		//rango de valor y se imprime en consola los resultados del filtro.
		lista.stream().filter(edad -> edad > 11 && edad < 29 ).forEach(list -> System.out.println("Edades " + list));
		System.out.print("\n");
		
		//Creamos una ArrayList a partir de una clase
		List<Moneda> listaM = new ArrayList<>();
		
		//Agregamos valores de acuerdo a lo que solicta el constructor de la clase padre
		listaM.add(new Moneda(1,"Bitcoin", "BTC", 61000));
		listaM.add(new Moneda(2,"Dollar", "DLS", 17));
		listaM.add(new Moneda(3,"Ethereum", "ETH", 4100));
		
		//Se imprimen los valores de la ArrayList
		listaM.forEach(list -> System.out.println("Moneda: " + list.getMoneda()));
		System.out.print("\n");
		
		//En el Stram se agraga un flitro y solo se imprimen los valores que fueron flitrados
		listaM.stream().filter(valor -> valor.getValor() > 5000).forEach(list -> System.out.println("Moneda: " + list.getMoneda()));
		System.out.print("\n");
		
		//Utilizando Stream junto con expresiones lambdas, filter y el metodo contains indicamos que se filtren los nombres de la lista
		//y se impriman unicamente los nombres que contienen la letra "a"
		lista3.stream().filter(letra -> letra.contains("a")).forEach(list -> System.out.println("Nombres con la letra A: " + list));
	}

}
