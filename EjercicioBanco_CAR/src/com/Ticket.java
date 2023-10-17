package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
	
	//Un objeto auxiliar para brindarnos respuesta
	//Cuando las operaciones se realicen con exito
	
	private int folio;
	private Date fechaHora;//Variable de tipo fecha.
	private String nombreUsuario;
	private double saldo;
	private String sucursal;
	private double monto;
	private int idCajero;
	
	public Ticket() {}
	
	public Ticket(int folio, Date fechaHora, String nombreUsuario, double saldo, String sucursal, double monto,
			int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombreUsuario = nombreUsuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.monto = monto;
		this.idCajero = idCajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String usuarioCuenta) {
		this.nombreUsuario = usuarioCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", usuarioCuenta=" + nombreUsuario + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", monto=" + monto + ", idCajero=" + idCajero + "]";
	}

}
