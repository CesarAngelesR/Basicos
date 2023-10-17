package com;

public class Herramienta {
	private String nombre;
	private String tamano;
	private String manterial;
	private int cantidad;
	private String color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getManterial() {
		return manterial;
	}
	public void setManterial(String manterial) {
		this.manterial = manterial;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Herramienta() {}
	public Herramienta(String nombre, String tamano, String manterial, int cantidad, String color) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.manterial = manterial;
		this.cantidad = cantidad;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Herramienta [nombre=" + nombre + ", tamano=" + tamano + ", manterial=" + manterial + ", cantidad="
				+ cantidad + ", color=" + color + "]";
	}
	
}
