package com.krakedev;

/* 
 * Comentario de varias lineas 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable p de tipo Persona
		p = new Persona();// 2. Instanciar un objeto Persona, referenciarlo con la variable p
		Persona p2 = new Persona();

		// 3. Accedo a los atributos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		System.out.println("---------------------");
		System.out.println("nombre: " + p2.getNombre());
		System.out.println("edad: " + p2.getEdad());
		System.out.println("estatura: " + p2.getEstatura());

		p.setNombre("Anthony");
		System.out.println("nombre:" + p.getNombre());

	}

}
