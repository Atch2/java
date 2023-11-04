package com.krakedev.sobrecarga;

public class Bienvenida {
	public void saludaar(String nombre) {
		System.out.println("Hola "  + nombre);
	}
	
	public void saludaar(String nombre, String apellido) {
		System.out.println("Hola "  + nombre + apellido);
	}
}
