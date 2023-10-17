package com;

public class Remolque {
	private Llanta eje1;
	private Luz stop;
	private Suspencion suspencion;
	private double Largo;
	private int numeroEjes;
	public Remolque() {	}
	public Remolque(Llanta eje1, Luz stop, Suspencion suspencion, double largo, int numeroEjes) {
		super();
		this.eje1 = eje1;
		this.stop = stop;
		this.suspencion = suspencion;
		Largo = largo;
		this.numeroEjes = numeroEjes;
	}
	public Llanta getEje1() {
		return eje1;
	}
	public void setEje1(Llanta eje1) {
		this.eje1 = eje1;
	}
	public Luz getStop() {
		return stop;
	}
	public void setStop(Luz stop) {
		this.stop = stop;
	}
	public Suspencion getSuspencion() {
		return suspencion;
	}
	public void setSuspencion(Suspencion suspencion) {
		this.suspencion = suspencion;
	}
	public double getLargo() {
		return Largo;
	}
	public void setLargo(double largo) {
		Largo = largo;
	}
	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	@Override
	public String toString() {
		return "Remolque [\neje1=" + eje1 + ", \nstop=" + stop + ", \nsuspencion=" + suspencion + ", \nLargo=" + Largo
				+ ", \nnumeroEjes=" + numeroEjes + "]";
	}
	

}
