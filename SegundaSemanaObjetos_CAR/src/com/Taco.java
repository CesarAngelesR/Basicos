package com;

public class Taco {
	private String deQueEs;
	private char cebolla;
	private char salsa;
	private int cantidad;
	private char paraLlevar;
	
	public String getDeQueEs() {
		return deQueEs;
	}
	public void setDeQueEs(String deQueEs) {
		this.deQueEs = deQueEs;
	}
	public char getCebolla() {
		return cebolla;
	}
	public void setCebolla(char cebolla) {
		this.cebolla = cebolla;
	}
	public char getSalsa() {
		return salsa;
	}
	public void setSalsa(char salsa) {
		this.salsa = salsa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public char getParaLlevar() {
		return paraLlevar;
	}
	public void setParaLlevar(char paraLlevar) {
		this.paraLlevar = paraLlevar;
	}
	public Taco() {}
	public Taco(String deQueEs, char cebolla, char salsa, int cantidad, char paraLlevar) {
		this.deQueEs = deQueEs;
		this.cebolla = cebolla;
		this.salsa = salsa;
		this.cantidad = cantidad;
		this.paraLlevar = paraLlevar;
	}
	@Override
	public String toString() {
		return "Taco [deQueEs=" + deQueEs + ", cebolla=" + cebolla + ", salsa=" + salsa + ", cantidad=" + cantidad
				+ ", paraLlevar=" + paraLlevar + "]";
	}
}
