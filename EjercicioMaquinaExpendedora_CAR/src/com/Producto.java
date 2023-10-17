package com;

public class Producto {
	private String nombre;
	private String tipo;
	private String marca;
	private double precio;
	
	public Producto(){}

	public Producto(String nombre, String tipo, String marca, double precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", precio=$" + precio;
	}

}
