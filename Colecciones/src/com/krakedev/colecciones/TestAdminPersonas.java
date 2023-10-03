package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Fabian", "Chan", 18));
		admin.agregar(new Persona("Paola", "HOyo", 25));
		admin.agregar(new Persona("Pablo", "Troa", 30));
		admin.agregar(new Persona("Hernan", "Pedeo", 40));
		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("Paola");
		if (p1 != null) {
			System.out.println("Encontrado: " + p1.getNombre() + " " + p1.getApellido());

		} else {
			System.out.println("No existe la persona con ese nombre");
		}

		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println("Mayores: " + personasMayores.size());
	}

}
