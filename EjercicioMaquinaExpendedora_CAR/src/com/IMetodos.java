package com;

public interface IMetodos {
	
	public Producto elegirProducto(String claveProducto);
	
	public  double identificarMonto(int moneda50c, int moneda1p, int moneda2p, int moneda5p, int moneda10p, int moneda20p);

	public OperacionDespacho despachar(String claveProducto, int moneda50c, int moneda1p, int moneda2p, int moneda5p, int moneda10p, int moneda20p);
	
	public void validacion(String claveProducto);

}
