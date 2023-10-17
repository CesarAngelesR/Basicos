package com.arrays;

import java.util.Scanner;

public class Arrays5_CAR {

	public static void main(String[] args) {
		/* 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		respectivos precios. Muestra en consola la lista de productos y sus precios. 
		Por lo menos 5 productos o artículos*/
		Scanner input = new Scanner(System.in);
		String [] articulos = {"Telefono Celular", "Laptop", "Impresora", "Cafetera", 
							"Bocinas", "Teclado y Mouse"};
		String [] precios = {"$5,000.00", "$10,000.00", "$4,000.00", "$500.00", "$400.00", "$200.00"};
		System.out.println("A continuacion le mostramos el catalogo de productos: ");
		for (int i = 0; i < articulos.length; i++) {
			System.out.println((i+1) + ".-" + articulos[i]);
		}
		System.out.print("Si desea saber el precio de algun articulo digite el numero que le antecede: ");
		int seleccion = input.nextInt();
		
		System.out.println("El precio del articulo " + articulos[seleccion-1] + " es: " + precios[seleccion-1]);
	}

}
