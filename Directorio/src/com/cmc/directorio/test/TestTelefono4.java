package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098357421", 20);
		Telefono telf2 = new Telefono("claro", "098357422", 30);
		Telefono telf3 = new Telefono("movi", "098357423", 40);
		Telefono telf4 = new Telefono("claro", "098357421", 20);

		AdminTelefono at = new AdminTelefono();
		System.out.println("Claro: " + at.contarClaro(telf1, telf2, telf3, telf4));
		
	}

}
