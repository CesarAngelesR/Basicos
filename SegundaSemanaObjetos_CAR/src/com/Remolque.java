package com;

public class Remolque {
	private int modelo;
	private String tipo;
	private char tamano;
	private int ejes;
	private String placas;
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public char getTamano() {
		return tamano;
	}
	public void setTamano(char tamano) {
		this.tamano = tamano;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
	}
	public Remolque() {}
	public Remolque(int modelo, String tipo, char tamano, int ejes, String placas) {
		this.modelo = modelo;
		this.tipo = tipo;
		this.tamano = tamano;
		this.ejes = ejes;
		this.placas = placas;
	}
	@Override
	public String toString() {
		return "Remolque [modelo=" + modelo + ", tipo=" + tipo + ", tamano=" + tamano + ", ejes=" + ejes + ", placas="
				+ placas + "]";
	}
	
	
}
