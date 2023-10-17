package com;

public class Celular {
	private String pantalla;
	private double capacidadAlm;
	private String camara;
	private double ram;
	private int peso;
	
	//MODIFICADORES
	
	//Al agregar un modificador "static" a una variable o metodo estamos declarando que ese
	//miembro pertenece a la clase en si y no a instancias separadas
	
	//Con el modificador "final" declaramos el uso de valores inmutables (constantes)
	private final int precio = 20000;

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public double getCapacidadAlm() {
		return capacidadAlm;
	}

	public void setCapacidadAlm(double capacidadAlm) {
		this.capacidadAlm = capacidadAlm;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public Celular() {}

	public Celular(String pantalla, double capacidadAlm, String camara, double ram, int peso) {
		super();
		this.pantalla = pantalla;
		this.capacidadAlm = capacidadAlm;
		this.camara = camara;
		this.ram = ram;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Celular [pantalla=" + pantalla + ", capacidadAlm=" + capacidadAlm + ", camara=" + camara + ", ram="
				+ ram + ", peso=" + peso + ", precio= " + precio + "]";
	}
}
