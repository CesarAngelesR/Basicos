package com.ciclos;

public class Ciclos7_CAR {

	public static void main(String[] args) {
		/* 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		dinero?*/
		
		double inversion = 700.00;
		int i;
		for ( i = 0; inversion < 1500; i++) {
			inversion = inversion + (inversion*.02);
		}
		System.out.println("Se necesitan " + i + " meses para "
				+ "llegar a para tener $1500.00 ($" + String.format("%.2f", inversion) + ")");
	}
}
