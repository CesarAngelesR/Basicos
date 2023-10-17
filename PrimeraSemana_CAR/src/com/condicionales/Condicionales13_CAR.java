package com.condicionales;

import javax.swing.JOptionPane;

public class Condicionales13_CAR {

	public static void main(String[] args) {
		/*
		 * 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de
		 * Europa y lo reparte entre un centro de salud, un comedor de ni�os y una parte
		 * lo invierte en la bolsa de acuerdo a lo siguiente: Si el monto de la donaci�n
		 * es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de
		 * ni�os y el resto se invierte en la bolsa. Si el monto de la donaci�n es menor
		 * que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os y el
		 * resto se invierte en la bolsa. La instituci�n desea saber cu�nto de dinero
		 * destinar� a cada rubro anualmente.
		 */

		double donacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de la donacion: �"));
		if (donacion >= 10000) {
			double cs = donacion * 0.3;
			double cm = donacion * 0.5;
			double bl = donacion * 0.2;

			JOptionPane.showMessageDialog(null, "Las donacion se va a repartir asi; " + "Centro de salud: �" + cs
					+ ", Comedor de ni�os: �" + cm + ", Para invertir en la bolsa: �" + bl);
		} else if (donacion < 10000) {
			double cs = donacion * 0.25;
			double cm = donacion * 0.6;
			double bl = donacion * 0.15;
			JOptionPane.showMessageDialog(null, "Las donacion se va a repartir asi; " + "Centro de salud: �" + cs
					+ ", Comedor de ni�os: �" + cm + ", Para invertir en la bolsa: �" + bl);
		}

	}

}
