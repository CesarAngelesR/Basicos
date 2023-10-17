package com;

public class Zapato {
	private String temporada;
	private char sexo;
	private int talla;
	private String material;
	private int a�o;
	
		
	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Zapato() {}

	public Zapato(String temporada, int talla, char sexo, String material, int a�o) {
		this.temporada = temporada;
		this.talla = talla;
		this.sexo = sexo;
		this.material = material;
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Zapatos [temporada=" + temporada + ", talla=" + talla + ", sexo=" + sexo + ", material=" + material
				+ ", a�o=" + a�o + "]";
	}
}
