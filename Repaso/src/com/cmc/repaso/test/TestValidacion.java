package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {

		Validacion v =  new Validacion(500.25);
		System.out.println("Monto: " + v.validarMonto(00.00));
		
	}

}
