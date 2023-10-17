package com;

public class Computadora {
	
	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	//Estos atributos en la vida real tambien son objetos y aqui tambien pueden serlo
	private Ram ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	public Computadora() {}

	public Computadora(String marca, String modelo, double precio, String color, Ram ram, Almacenamiento disco,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", \nram=" + ram + ", \ndisco=" + disco + ", \ncpu=" + cpu + "]";
	}
	
}
