package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales3_CAR {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado de 
		//su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		while (numero2==0) {
			JOptionPane.showMessageDialog(null, "Error, este numero no puede ser cero, '0'", "error", JOptionPane.ERROR_MESSAGE);
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		}
		double resultado=numero1/numero2;
		JOptionPane.showMessageDialog(null, "El resultado de la divisi�n entre " + numero1 + " y " + numero2 + " es: " + resultado);

	}

}
