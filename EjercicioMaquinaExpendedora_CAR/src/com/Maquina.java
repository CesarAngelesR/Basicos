package com;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Maquina implements IMetodos {

	private Map<String, Producto> productosDisp;

	public Maquina() {
	}

	public Maquina(Map<String, Producto> productosDisp) {
		this.productosDisp = productosDisp;
	}

	@Override
	public Producto elegirProducto(String claveProducto) {
		Producto producto;
		producto = productosDisp.get(claveProducto);
		return producto;
	}

	@Override
	public double identificarMonto(int moneda50c, int moneda1p, int moneda2p, int moneda5p, int moneda10p,
			int moneda20p) {
		double monto = (.5 * moneda50c) + (1 * moneda1p) + (2 * moneda2p) + (5 * moneda5p) + (10 * moneda10p)
				+ (20 * moneda20p);
		return monto;
	}

	@Override
	public OperacionDespacho despachar(String claveProducto, int moneda50c, int moneda1p, int moneda2p, int moneda5p,
			int moneda10p, int moneda20p) {
		OperacionDespacho mensaje = null;
		Producto producto = elegirProducto(claveProducto);

		double monto = identificarMonto(moneda50c, moneda1p, moneda2p, moneda5p, moneda10p, moneda20p);

		if (producto.getPrecio() > monto) {
			JOptionPane.showMessageDialog(null,
					"El monto ingresado nos es suficiente para comprar el producto, ya que el producto cuesta $"
							+ producto.getPrecio() + " y la cantidad ingresada es $" + monto);
			return mensaje;
		} else {
			double cambio = monto - producto.getPrecio();
			mensaje = new OperacionDespacho(producto, cambio);
			productosDisp.remove(claveProducto);

			System.out.println("\nComprobando que el producto se descontó de la lista;");
			for (HashMap.Entry<String, Producto> entry : productosDisp.entrySet()) {
				System.out.println("Clave: " + entry.getKey() + ", Producto: " + entry.getValue());
			}
			return mensaje;

		}
	}

	public void validacion(String claveProducto) {
		if (productosDisp.containsKey(claveProducto)) {
			JOptionPane.showMessageDialog(null, "Ingrese la cantidad indicada: ");
			int moneda50c = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas monedas de 50 centavos: "));
			int moneda1p = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas monedas de 1 peso: "));
			int moneda2p = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas monedas de 2 pesos: "));
			int moneda5p = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas monedas de 5 pesos: "));
			int moneda10p = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas monedas de 10 pesos: "));
			int moneda20p = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas monedas de 20 pesos: "));
			JOptionPane.showMessageDialog(null, "El producto depachado es: \n"
					+ despachar(claveProducto, moneda50c, moneda1p, moneda2p, moneda5p, moneda10p, moneda20p));
		} else {
			JOptionPane.showMessageDialog(null, "La clave no corresponde a algun producto");
		}
	}
}
