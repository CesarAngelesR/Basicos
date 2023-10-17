package com;

public class Llanta {
	private String tamano;
	private String marca;
	private String dot;
	private int cantidad;
	public Llanta() {}
	public Llanta(String tamano, String marca, String dot, int cantidad) {
		super();
		this.tamano = tamano;
		this.marca = marca;
		this.dot = dot;
		this.cantidad=cantidad;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDot() {
		return dot;
	}
	public void setDot(String dot) {
		this.dot = dot;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Llanta [tamano=" + tamano + ", marca=" + marca + ", dot=" + dot + ", cantidad=" + cantidad + "]";
	}
	
	
}
