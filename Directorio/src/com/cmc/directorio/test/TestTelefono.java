package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0983578212", 10, false);
		System.out.println(telf.getOperadora());
		System.out.println(telf.getNumero());
		System.out.println(telf.getCodigo());
	}

}
