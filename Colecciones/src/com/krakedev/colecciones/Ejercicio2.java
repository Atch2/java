package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Leo", "Messi"));
		personas.add(new Persona("Cristian", "Pacho"));
		personas.add(new Persona("Leo", "Guayta"));
		
		Persona elementoPersona;
		for(int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println("Persona: " + elementoPersona.getNombre() + " - " + elementoPersona.getApellido());
		}
	}

}
