package com;

public interface IMetodos {
	
	//Métodos a implementar
	//Esto es como un repositorio de metodos
	//para que sean utilizados por diversas clases
	
	//Trabajamos con un metodo que devuelva el valor de un objeto Cuenta
	//y procedemos a buscar ese objeto mediante un valor integer, que sera
	//la clave (key) en nuestro HashMap
	public Cuenta buscarCuenta (int numeroCuenta);
	//Creamos un método para realizar un deposito
	//Una
	public Ticket depositar(int numeroCuenta, double monto);
	//Metodo para retirar
	public Ticket retirar(int numeroCuenta, double monto);
	//Metodo para transferir
	public Ticket transferir(int numCuentaOrigen,int numCuentaDestino, double monto);
}
