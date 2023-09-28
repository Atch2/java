package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "0983578212", 123);
		Contacto c = new Contacto("Anthony", "Guata", telf, 1.90);
		Telefono telf2 = new Telefono("movi", "0983472125", 321);
		Contacto c2 = new Contacto("Paola", "Alban", telf2, 1.70);
		AdminContactos ac = new AdminContactos();

		System.out.println("Nombre: " + c.getNombre() + "\nApellido: " + c.getApellido() + "\nOperadora: "
				+ c.getTelefono().getOperadora() + "\nNumero de Telefono:" + c.getTelefono().getNumero());

		System.out.println("Nombre: " + c2.getNombre() + "\nApellido: " + c2.getApellido() + "\nOperadora: "
				+ c2.getTelefono().getOperadora() + "\nNumero de Telefono:" + c2.getTelefono().getNumero());

		Contacto peso = ac.buscarMasPesado(c, c2);
		System.out.println("Mayor peso:" + peso.getNombre());
		System.out.println("Igual Operadora: " + ac.comprarOperadoras(c, c2));

	}

}
