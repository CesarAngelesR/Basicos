package com;

public class Moneda {
	private int codigo;
	private String moneda;
	private String descripcion;
	private int valor;
	
	public Moneda(int codigo, String moneda, String descripcion, int valor) {
		super();
		this.codigo = codigo;
		this.moneda = moneda;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public Moneda() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
