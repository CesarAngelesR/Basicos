package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales5_CAR {

	public static void main(String[] args) {
		/* 5. Realiza un programa que calcule la aceptación de una solicitud en base a los 
		siguientes parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA*/
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del solicitante"));
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del solicitante"));
		char sexo = JOptionPane.showInputDialog("Ingrese el sexo del solicitante, 'M' para masculino y "
				+ "'F' para femenino").charAt(0);
		
		
		if (nota >=5 && edad >= 18 && (sexo == 'M'||sexo == 'm')) {
			JOptionPane.showMessageDialog(null, "Esta solicitud es 'POSIBLE'","Posible", JOptionPane.INFORMATION_MESSAGE);
		}else if (nota >= 5 && edad >= 18 && (sexo == 'F'||sexo == 'f')) {
			JOptionPane.showMessageDialog(null, "Esta solicitud es 'ACEPTADA'","Aceptada", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Esta solicitud 'NO ES ACEPTADA'","No Aceptada", JOptionPane.ERROR_MESSAGE);
		}
	}

}
