package com;

public class Suspencion {
	private String marca;
	private String tamano;
	private int cantidad;
	private String tipo;
	public Suspencion() {}
	public Suspencion(String marca, String tamano, int cantidad, String tipo) {
		super();
		this.marca = marca;
		this.tamano = tamano;
		this.cantidad = cantidad;
		this.tipo =tipo;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Suspencion [marca=" + marca + ", tamano=" + tamano + ", cantidad=" + cantidad + ", tipo=" + tipo + "]";
	}
	

}
