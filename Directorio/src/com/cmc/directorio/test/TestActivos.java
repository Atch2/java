package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "0983578212", 123);
		Contacto c = new Contacto("Anthony", "Guata", telf, 1.90);
		AdminContactos ac = new AdminContactos();

		System.out.println("Nombre: " + c.getNombre() + "\nApellido: " + c.getApellido() + "\nOperadora: "
				+ c.getTelefono().getOperadora() + "\nNumero de Telefono:" + c.getTelefono().getNumero()
				+ "\nTiene Whatsapp : " + c.getTelefono().getTieneWhatsapp());

		telf.setTieneWhatsapp(true);
		ac.activarUsuario(c);
		System.out.println("\n***********************");
		System.out.println("Nombre: " + c.getNombre() + "\nApellido: " + c.getApellido() + "\nOperadora: "
				+ c.getTelefono().getOperadora() + "\nNumero de Telefono:" + c.getTelefono().getNumero()
				+ "\nTiene Whatsapp : " + c.getTelefono().getTieneWhatsapp() + "\nActivo: " + c.isActivo());

	}

}
