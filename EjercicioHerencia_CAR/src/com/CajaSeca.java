package com;

public class CajaSeca extends Remolque{
	private double capacidad;
	private String transporta;
	
	public CajaSeca() {}

	public CajaSeca(String nombre, int numEjes, String suspencion, int modelo, String tamano, double capacidad,
			String transporta) {
		super(nombre, numEjes, suspencion, modelo, tamano);
		this.capacidad = capacidad;
		this.transporta = transporta;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTransporta() {
		return transporta;
	}

	public void setTransporta(String transporta) {
		this.transporta = transporta;
	}

	@Override
	public String toString() {
		return "\nCajaSeca [capacidad=" + capacidad + " toneladas, transporta=" + transporta + ", \ntoString()=" + super.toString()
				+ "]";
	}
	
}
