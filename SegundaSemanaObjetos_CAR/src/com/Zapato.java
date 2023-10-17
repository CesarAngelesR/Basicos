package com;

public class Zapato {
	private String temporada;
	private char sexo;
	private int talla;
	private String material;
	private int año;
	
		
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Zapato() {}

	public Zapato(String temporada, int talla, char sexo, String material, int año) {
		this.temporada = temporada;
		this.talla = talla;
		this.sexo = sexo;
		this.material = material;
		this.año = año;
	}

	@Override
	public String toString() {
		return "Zapatos [temporada=" + temporada + ", talla=" + talla + ", sexo=" + sexo + ", material=" + material
				+ ", año=" + año + "]";
	}
}
