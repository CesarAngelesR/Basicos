package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales7_CAR {

	public static void main(String[] args) {
		/*
		 * 7. El director de una escuela está organizando un viaje de estudios y
		 * requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		 * compañía de viajes por el servicio. La forma de cobrar es la siguiente: Si
		 * son 100 alumnos o más, el costo por cada alumno es de 65 euros. De 50 a 99
		 * alumnos, el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95
		 * euros. Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		 * euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		 * determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno
		 * por el viaje
		 */

		int cantidadAlumnos = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Cual es la cantidad de alumnos que viajaran?"));

		if (cantidadAlumnos < 30) {
			double pagoAlumno = 4000 / cantidadAlumnos;
			JOptionPane.showMessageDialog(null, "La cantidad de debe de pagar cada alumno es de: €" + pagoAlumno
					+ ". La cantidad a pagarle a la empresa sera de €4000.00");
		} else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
			JOptionPane.showMessageDialog(null, "La cantidad de debe de pagar cada alumno es de: €95.00, "
					+ "La cantidad a pagarle a la empresa sera de €" + (cantidadAlumnos *= 95));
		} else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
			JOptionPane.showMessageDialog(null, "La cantidad de debe de pagar cada alumno es de: €70.00, "
					+ "La cantidad a pagarle a la empresa sera de €" + (cantidadAlumnos *= 70));
		} else if (cantidadAlumnos >= 100) {
			JOptionPane.showMessageDialog(null, "La cantidad de debe de pagar cada alumno es de: €65.00, "
					+ "La cantidad a pagarle a la empresa sera de €" + (cantidadAlumnos *= 65));
		}

	}

}
