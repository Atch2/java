package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098357421", 20);
		Telefono telf2 = new Telefono("claro", "098357422", 30);
		Telefono telf3 = new Telefono("movi", "098357423", 40);

		AdminTelefono at = new AdminTelefono();
		int contarMovi = at.contarMovi(telf1, telf2, telf3);
		System.out.println("Movistar: " + contarMovi);
	}

}
