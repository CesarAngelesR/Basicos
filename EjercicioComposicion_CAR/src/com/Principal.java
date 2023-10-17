package com;

public class Principal {

	public static void main(String[] args) {
		Llanta n1= new Llanta("24.5", "Goodyear", "25/10/2022", 12);
		Luz s1 = new Luz("Hella", "Grande", "Blanco", 2);
		Suspencion b1= new Suspencion("Goodyear", "R12", 4,"Bolsa de aire");
		
		Remolque plana = new Remolque(n1, s1, b1, 44.5, 3);
		
		System.out.println(plana);

	}

}
