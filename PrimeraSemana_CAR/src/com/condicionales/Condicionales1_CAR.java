package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales1_CAR {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e
		// indique cuál es mayor o si son iguales.

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

		if (numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es mayor que el numero " + numero2);
		} else if (numero1 < numero2) {
			JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es mayor que el numero " + numero1);
		} else {
			JOptionPane.showMessageDialog(null, numero1 + " y " + numero2 + " son numeros iguales");
		}
	}

}
