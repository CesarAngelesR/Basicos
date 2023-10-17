package com;

public class Remolque {
	private String nombre;
	private int numEjes;
	private String suspencion;
	private int modelo;
	private String tamano;
	
	public Remolque() {}

	public Remolque(String nombre, int numEjes, String suspencion, int modelo, String tamano) {
		this.nombre = nombre;
		this.numEjes = numEjes;
		this.suspencion = suspencion;
		this.modelo = modelo;
		this.tamano = tamano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	public String getSuspencion() {
		return suspencion;
	}

	public void setSuspencion(String suspencion) {
		this.suspencion = suspencion;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Remolque [nombre=" + nombre + ", numEjes=" + numEjes + ", suspencion=" + suspencion + ", modelo="
				+ modelo + " , tamano=" + tamano + "]";
	}
	
	public void trabajando() {
		System.out.println("El remolque se encuentra sin trabajar");
	}
	
	public String trabajando(String zona) {
		return "El remolque se encuetra trabajando en la zona de " + zona;
	}

}
