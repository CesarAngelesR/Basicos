package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{
	
	public Cientifica() {}

	public Cientifica(String marca, String color, String modelo) {
		super(marca, color, modelo);
	}

	@Override
	public double suma(double n1, double n2) {
		double suma=n1+n2;
		return suma;
	}

	@Override
	public double resta(double n1, double n2) {
		double resta = n1-n2;
		return resta;
	}

	@Override
	public double multiplicacion(double n1, double n2) {
		double mult = n1*n2;
		return mult;
	}

	@Override
	public double divicion(double n1, double n2) {
		double div = n1/n2;
		return div;
	}

	@Override
	public String toString() {
		return "Propiedades de la calculadora Cientifica: " + super.toString() + "]";
	}

	@Override
	public void tomarTemperatura() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce tu temperatura: ");
		double tem= input.nextDouble();
		System.out.println("Tu temperatura es: " + tem );
		
	}
	
}
