package com;

public class Principal {

	public static void main(String[] args) {
		
		
		//Al volver abstracta a la clase persona ya no es posible 
		//hacer una instancia de la misma
		/*Persona persona1 = new Persona("Pedro", "Masculino", 28);
		
		System.out.println(persona1);
		persona1.respirar();//Desde la clase padre*/
		
		Empleado empleado1= new Empleado();
		
		empleado1.setNombre("Peter");
		empleado1.setGenero("Masculino");
		empleado1.setEdad(28);
		empleado1.setSalario(18000);
		empleado1.setRfc("AEGP280504MFC");
		empleado1.setHorario("8am-4pm");
		
		System.out.println(empleado1);
		empleado1.respirar();//Desde clase hija
		System.out.println("Hoy estoy "+empleado1.comer());
		
		empleado1.correr();
		empleado1.correr(15);
		
		empleado1.trabajar();
		empleado1.trabajar(8);

	}

}
