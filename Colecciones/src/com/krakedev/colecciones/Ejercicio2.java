package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		Persona elementoPersona;
		personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Leo" , "Messi"));
		personas.add(new Persona("Mateo" , "Sanchez"));
		personas.add(new Persona("Pedro" , "Guayta"));
		
		
		for(int i=0; i<personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre() + " - "  + elementoPersona.getApellido());
		}
	}

}
