package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admi = new AdminPersonas();
		admi.agregar(new Persona("Mario", "Benedeti", 25));
		admi.agregar(new Persona("Clarck", "Ken", 30));
		admi.agregar(new Persona("Pablo", "Buen", 50));

		admi.imprimir();
		Persona p1 = admi.buscarPorNombre("Antha");
		if(p1 != null) {
			System.out.println("ENCONTRADO: " + p1.getNombre() + " " + p1.getApellido());	
		}else {
			System.out.println("No existe la persona con ese nombre ");
		}
		
		ArrayList<Persona> personasMayores = admi.buscarMayores(25);
		System.out.println("Mayores: " + personasMayores.size());
	}

}
