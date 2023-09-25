package com.cmc.repaso.entidades;

public class Validacion {

	private double monto;

	public Validacion(double monto) {
		this.monto = monto;
	}

	public boolean validarMonto(double monto) {

		if (monto > 0) {
			return true;
		} else {
			return false;
		}
	}
}
