package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales11_CAR {

	public static void main(String[] args) {
		/*
		 * 11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses
		 * de Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El
		 * costo por servicio de transporte se basa en el peso del paquete y la zona a
		 * la que va dirigida. Lo anterior se muestra en la siguiente tabla: ZONA
		 * UBICACI�N COSTO/KILOGRAMO 1 Am�rica del Norte 24,00 euros 2 Am�rica Central
		 * 20, 00 euros 3 Am�rica del Sur 21,00 euros 4 Europa 10,00 euros 5 Asia 18,00
		 * euros Parte de su pol�tica implica que los paquetes con un peso superior a
		 * 5kg no son transportados, por cuestiones de log�stica y seguridad. Realiza un
		 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
		 * caso, el rechazo de la entrega.
		 */

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Cuanto pesa el paquete? "));
		if (peso >= 5) {
			JOptionPane.showMessageDialog(null, "El peso supera el peso maximo", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			String zona = JOptionPane.showInputDialog("Escriba la zona a donde realiza el envio: ");
			if (zona.equalsIgnoreCase("America del norte")) {
				JOptionPane.showMessageDialog(null, "El precio que debe de pagar por su envio es: �" + (peso *= 24));
			} else if (zona.equalsIgnoreCase("America central")) {
				JOptionPane.showMessageDialog(null, "El precio que debe de pagar por su envio es: �" + (peso *= 20));
			} else if (zona.equalsIgnoreCase("America del sur")) {
				JOptionPane.showMessageDialog(null, "El precio que debe de pagar por su envio es: �" + (peso *= 21));
			} else if (zona.equalsIgnoreCase("europa")) {
				JOptionPane.showMessageDialog(null, "El precio que debe de pagar por su envio es: �" + (peso *= 10));
			} else if (zona.equalsIgnoreCase("Asia")) {
				JOptionPane.showMessageDialog(null, "El precio que debe de pagar por su envio es: �" + (peso *= 18));
			} else {
				JOptionPane.showMessageDialog(null, "Lugar no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

}
