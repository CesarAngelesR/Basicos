package com;

public class Luz {
	private String marca;
	private String tamano;
	private String color;
	private int cantidad;
	public Luz() {}
	public Luz(String marca, String tamano, String color, int cantidad) {
		super();
		this.marca = marca;
		this.tamano = tamano;
		this.color = color;
		this.cantidad = cantidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Luz [marca=" + marca + ", tamano=" + tamano + ", color=" + color + ", cantidad=" + cantidad + "]";
	}
	
	
}
