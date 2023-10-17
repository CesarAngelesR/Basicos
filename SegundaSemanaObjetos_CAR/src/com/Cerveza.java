package com;

public class Cerveza {
	private String nombre;
	private String estilo;
	private int presentacionMl;
	private String elaborcion;
	private String marca;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getPresentacionMl() {
		return presentacionMl;
	}
	public void setPresentacionMl(int presentacionMl) {
		this.presentacionMl = presentacionMl;
	}
	public String getElaborcion() {
		return elaborcion;
	}
	public void setElaborcion(String elaborcion) {
		this.elaborcion = elaborcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Cerveza() {}
	public Cerveza(String nombre, String estilo, int presentacionMl, String elaborcion, String marca) {
		this.nombre = nombre;
		this.estilo = estilo;
		this.presentacionMl = presentacionMl;
		this.elaborcion = elaborcion;
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Cerveza [nombre=" + nombre + ", estilo=" + estilo + ", presentacionMl=" + presentacionMl
				+ ", elaborcion=" + elaborcion + ", marca=" + marca + "]";
	}
	
}


