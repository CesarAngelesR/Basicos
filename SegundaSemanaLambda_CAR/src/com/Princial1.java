package com;

public class Princial1 {
	public static void main(String[] args) {
		
	
	//Lambda  - Son expresiones o funciones anonimas que implementan un metodo de una interfase funcional
	//lo cual nos permite escribir el metodo inmediatamente para su uso inmediato sin necesidad de que una clase
	//defina como va a reslizarse
	//Su operador es (->)
	//Sintaxis: (parametros) -> {cuerpo lambda}

	//Treamos una instacia de la interfase funcional y defiimos como realiar ese metodo con los parametros que tiene
		
	IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a+b));
	
	//Una vez definida podemoshacer uso inmediato del metodo
	
	suma.operacion(15, 16);
	
	IMetodo resta = (a,b)-> System.out.println("La resta es: " + (a+b));
	
	resta.operacion(8, 4);
	
	
	}
}
