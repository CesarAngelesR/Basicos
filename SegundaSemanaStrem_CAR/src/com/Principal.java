package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		// Api Stream es una funcionalidad a partir de Java 8 que nos va a permitir
		// hacer un mejor uso de
		// los datos de una coleccion
		// En una coleccion contamos con muchos datos y esos datos vamos a poder
		// solicitarlos de acuerdo
		// a como mejor nos convenga

		// El API Stream nos permite ordenar o filtrar informacion de una manera mas
		// efectiva

		// Podemos tener declarado un flujo de fatos

		Stream<String> nombres = Stream.of("Cesar", "Alanis", "Luz", "Guadalupe").filter(lista -> lista.contains("a"));

		// Una vez filtramos la informacion la llevamos a una lista
		List<String> names = nombres.collect(Collectors.toList());

		// Muestra los resultados de la lista en consola
		System.out.println(names);

		// Creamos una lista para nuestros objetos persona
		List<Persona> lista = new ArrayList<Persona>();

		// Creamos una lista para pasar los valores de elementos filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista oridinal
		
		
		lista.add (new Persona("Jorge", 37, "Masculino"));
		lista.add (new Persona("Alanis", 25, "Femenino"));
		lista.add (new Persona("Cesar", 39, "Masculino"));
		lista.add (new Persona("Oscar", 25, "Masculino"));
		lista.add (new Persona("Sergio Martinez", 40, "Masculino"));
		lista.add (new Persona("Guadalupe", 25, "Femenino"));
		
		//Ciclo for
		/*for (int i=0 ; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		//Ciclo for each
		for (Persona i:lista) {
			System.out.println(i);
		}*/
		//Ciclo for each en una sola linea
		//lista.forEach(System.out::println);
		
		//Filtrar algun genero de nuestros objetos persona
		
		/*for(Persona i:lista) {
			if (i.getGenero().contentEquals("Masculino")){
				listaFiltrada.add(i);
				System.out.println(i);
			}
		}*/
		
		//Filtrar con el API Stream a las personas de genero femenino
		
		/*listaFiltrada= lista.stream().filter(i->i.getGenero().equals("Femenino")).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
		
		listaFiltrada.forEach(System.out::println);*/
		
		//Ordenar a las personas por edad ascendente
		
		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
		System.out.println("\n");
		
		//Ordenar a las personas por edad descendente
		listaFiltrada = lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
		System.out.println("\n");
		
		//Solicitar un valor boolean si algun elemento o varios cumplen con alguna condicion
		
		boolean alguno = lista.stream().anyMatch(a -> a.getEdad()<30);
		System.out.println(alguno);
		
		//Retornar un valor a la clase Optional
		//La clase Optinonal nos ayuda a manejar valores que pueden no existir, osea valores que pudiran ser nulos
		
		Optional<Persona> menorEdad = lista.stream().min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
	
	}

}
