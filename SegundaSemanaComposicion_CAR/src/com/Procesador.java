package com;

public class Procesador {
	
	private String marca;
	private String modelo;
	private int nucleos;
	private int hilos;
	private double frecuencia;
	public Procesador() {}
	public Procesador(String marca, String modelo, int nucleos, int hilos, double frecuencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.frecuencia = frecuencia;
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
	public int getNucleos() {
		return nucleos;
	}
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}
	public int getHilos() {
		return hilos;
	}
	public void setHilos(int hilos) {
		this.hilos = hilos;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nucleos=" + nucleos + ", hilos=" + hilos
				+ ", frecuencia=" + frecuencia + "]";
	}
	
	
	
	

}
