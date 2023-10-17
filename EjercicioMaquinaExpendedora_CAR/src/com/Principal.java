package com;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Map<String, Producto> productosDisp = new HashMap<String, Producto>();

		productosDisp.put("A1", new Producto("Canelitas", "Galletas", "Marinela", 15.50));
		productosDisp.put("A2", new Producto("Coca-cola", "Bebida", "Coca-Cola", 20.00));
		productosDisp.put("A3", new Producto("Chetos", "Botana", "Sabritas", 16.50));
		productosDisp.put("A4", new Producto("Emperador", "Galletas", "Marinela", 21.50));
		productosDisp.put("B1", new Producto("Sprite", "Bebida", "Coca-Cola", 19.00));
		productosDisp.put("B2", new Producto("Cacahuates Japoneses", "Botana", "Nipon", 14.00));

		Maquina maquina1 = new Maquina(productosDisp);
		// Probando Metodo elegirProducto
		// System.out.println("El producto elegido es: " +
		// maquina1.elegirProducto("A2"));

		// Probando Metodo identificarMonto
		// System.out.println("\nEl monto ingresado es: $" +
		// maquina1.identificarMonto(1,2,0, 1, 1, 1));

		JOptionPane.showMessageDialog(null, "Bienvenido a nuestra maquina expendedora");

		String claveProducto = JOptionPane.showInputDialog(null, "Ingrese la clave del producto que desee: ");
		
		maquina1.validacion(claveProducto);

	}

}
