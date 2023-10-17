package com;

public abstract class Persona {
	
	//Esta clase va a funcionar como una clase padre.
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Acciones o comportamientos que puede tener una persona
	//Ejemplos de accion de una persona
	
	public void respirar() {//El modificador void permite que mi metodo no retorne forsosamente un valor
		System.out.println("Esta respirando....");
	}
	//Metodo que requiere un retorno de un tipo de dato
	public String comer() {
		String comiendo="Pizza";
		return "comiendo " + comiendo;
		
	}
	
	public void correr() {
		System.out.println("Corriendo...");
	}
	//Creando un metodo polimorfico, es decir, tiene el mismo nombre pero haremos que se
	//comporte de manera diferemte mediante la sobrecarga de argumentos
	public void correr(int kilometros) {
		System.out.println("Corriendo " + kilometros + " kilometros");
	}
	
	//Un metodo bastracto es aquel que define que hacer pero no como hacer
	//Es decir, es un metodo que no tiene cuerpo.
	//Y el metodo tendra que ser implementdo por una clase hija
	
	public abstract void trabajar();
	public abstract void trabajar(int horas);
	
}
