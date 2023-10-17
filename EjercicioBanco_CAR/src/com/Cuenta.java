package com;

public class Cuenta {
	
	//Atributos de una cuenta de banco
	//Los objetos se vayamos a crear en esta plantilla los almacenaremos en un HasMap permitiendonos
	//que la clave para almacenar dichos objetos haga el papel de numeroCuenta (key)
	
	private String nombreUsuario;
	private double saldo;
	private String tipoCuenta;
	private double saldoMin;
	private double saldoMax;
	
	public Cuenta() {}
	
	public Cuenta(String nombreUsuario, double saldo, String tipoCuenta, double saldoMin, double saldoMax) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + nombreUsuario + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta
				+ ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax + "]";
	}
	

}
