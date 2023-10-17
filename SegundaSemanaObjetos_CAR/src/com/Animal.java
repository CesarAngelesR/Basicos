package com;

public class Animal {
	
	//La clase nos rive como plantilla de un objeto
	
	//El objeto lo vamos a modelar con atributos y comportamientos.
	//Aqui empleamos el pilar de ABSTRACCION
	
	//Definimos o modelamos nuestro objeto con sus respectivos atributos
	
	//Para encapsular o proteger la informacion, contamos con modificadores de acceso
	//tanto para los atributos como los metodos
	
	private String nombre;
	private double peso;
	private int edad;
	private double tamaño;
	private String color;
	
	//Contamos con metodos para construir o defenir valores en nuestros objetos.
	
	//Metodos constructores
	//Principalmente 2 mas usados:
	//Contructor vacio
	public Animal() {
		//Nos sirve para crear o instanciar un objeto sin valores asignados inicialmente
		//Sirve como comodin para posteriomente asignar valor a mi objeto.
	}
	//Metodo constructor con todos los argumentos
	public Animal(String nombre, double peso, int edad, double tamaño, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
		this.tamaño = tamaño;
		this.color = color;
	}
	//Puedo generar mas constructores de acuerdo a como a mi me convenga
	//No hay limite
	public Animal(String nombre, int edad, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	//Por convencion casi siempre solo tenemos el constructor con todos los parametros y el
	//constructor vacio, gracias a ello, o gracias al uso del constructor vacio podemos asignar
	//valores a nuestro objeto posteriormente con ayuda de los metodos de asignacion de valores.
	
	//Metodos Getters y Setters
	//Se generan con: click derecho<source<Generar Getters and Setters.
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//El metodo toString es servirnos como una especie de radiografia para poder visualizar toda la composicion
	//o atributos de nuestro objeto
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + ", tamaño=" + tamaño + ", color="
				+ color + "]";
	}
	
	
}
