package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuentas {
	private String numeroCuenta;
	private Persona persona;
	private Date fechaCreacion;
	private BigDecimal saldo;

	public Cuentas() {
		super();
	}

	public Cuentas(String numeroCuenta, Persona persona, Date fechaCreacion, BigDecimal saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.persona = persona;
		this.fechaCreacion = fechaCreacion;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuentas [numeroCuenta=" + numeroCuenta + ", persona=" + persona + ", fechaCreacion=" + fechaCreacion
				+ ", saldo=" + saldo + "]";
	}

}
