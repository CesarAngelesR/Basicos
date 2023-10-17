package com;

//La herencia se realiza con la palabra reservada extends, despues del nombre de la clase
//que hereda comportamientos y atributos.
public class Empleado extends Persona{
	
	//Esta seria la clase hija
	//Puede tener sus propios atributos
	
	private double salario;
	private String rfc;
	private String horario;
	public Empleado() {}
	
	//Constructor con todos los parametro de empleado mas los parametros de la clase padre "Persona"
	public Empleado(String nombre, String genero, int edad, double salario, String rfc, String horario) {
		super(nombre, genero, edad);
		this.salario = salario;
		this.rfc = rfc;
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", horario=" + horario + ", toString()="
				+ super.toString() + "]";
	}
	
	//Al heredar de una clase abstracta la clase hija debe implmentear y definir como se van
	//a realizar los metodos abstractos o metodos no implementador en la clase padre
	@Override
	public void trabajar() {
		System.out.println("Trabajando");
		
	}

	public void trabajar(int horas) {
		System.out.println("Trbajando " + horas + " horas en el turno");
		
	}
	
	
	

}
