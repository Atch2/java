package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "098357421", 20, false);
		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(telf);
		System.out.println(
				telf.getOperadora() + " " + telf.getNumero() + " " + telf.getCodigo() + " " + telf.getTieneWhatsapp());

	}

}
