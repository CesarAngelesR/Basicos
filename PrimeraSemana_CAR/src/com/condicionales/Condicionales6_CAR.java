package com.condicionales;

import java.util.Scanner;

public class Condicionales6_CAR {
	public static void main(String[] args) {
		/*
		 * 6. La asociación de vinicultores tiene como política fijar un precio inicial
		 * al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1
		 * y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y
		 * tamaño, se requiere determinar cuánto recibirá un productor por la uva que
		 * entrega en un embarque considerando lo siguiente: Si es de tipo A, se le
		 * cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		 * es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño
		 * 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde
		 * teclado
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese la clasificacion de la uva, 'A' o 'B': ");
		char clase = input.next().charAt(0);

		System.out.print("Ingrese el tamaño de la uva, '1' o '2': ");
		char tamano = input.next().charAt(0);

		System.out.print("Ingrese el precio inical: $");
		double precio = input.nextDouble();

		if (clase == 'a' || clase == 'A') {
			switch (tamano) {
			case '1':
				System.out.println(
						"El precio del kilo de uva clase " + clase + " tamaño " + tamano + " es: $" + (precio += .20));
				break;
			case '2':
				System.out.println(
						"El precio del kilo de uva clase " + clase + " tamaño " + tamano + " es: $" + (precio += .30));
				break;

			default:
				System.out.println("Ese tamaño no existe");
				break;
			}

		} else if (clase == 'b' || clase == 'B') {
			switch (tamano) {
			case '1':
				System.out.println(
						"El precio del kilo de uva clase " + clase + " tamaño " + tamano + " es: $" + (precio -= .30));
				break;
			case '2':
				System.out.println(
						"El precio del kilo de uva clase " + clase + " tamaño " + tamano + " es: $" + (precio -= .50));
				break;

			default:
				System.out.println("Ese tamaño no existe");
				break;
			}

		} else {
			System.out.println("Esa clasificacion no existe");
		}
	}
}
