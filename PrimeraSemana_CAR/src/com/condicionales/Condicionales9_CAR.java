package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales9_CAR {
	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		// día correspondiente. Si
		// introducimos otro número nos da un error.

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia de la semana del 1 al 7"));

		switch (dia) {
		case 1:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Lunes");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Martes");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Miercoles");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Jueves");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Viernes");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Sabado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "El dia de la semana es Domingo");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El dia de la semana es incorrecto");
			break;
		}
	}

}