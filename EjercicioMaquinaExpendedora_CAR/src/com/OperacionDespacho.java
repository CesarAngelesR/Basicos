package com;

public class OperacionDespacho {
	private Producto producto;
	private double cambio;
	
	public OperacionDespacho() {}
	
	public OperacionDespacho(Producto producto, double cambio) {
		this.producto = producto;
		this.cambio = cambio;
	}
	
	@Override
	public String toString() {
		return producto + ", Su cambio es cambio: $" + cambio;
	}
	
	
	
}
