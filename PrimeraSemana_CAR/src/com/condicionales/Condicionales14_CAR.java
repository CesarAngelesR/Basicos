package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales14_CAR {

	public static void main(String[] args) {
		/*
		 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
		 * trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas
		 * y $20 por cada hora extra
		 */

		int horasTrabajadas;
		float salarioTotal;

		horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas trabajadas"));

		if (horasTrabajadas <= 40) {
			salarioTotal = horasTrabajadas * 16;

		} else {
			salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
		}
		JOptionPane.showMessageDialog(null, "El salario total es: $" + salarioTotal);

	}

}
