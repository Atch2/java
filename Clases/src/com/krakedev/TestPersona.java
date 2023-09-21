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
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);

		System.out.println("---------------------");
		System.out.println("nombre: " + p2.nombre);
		System.out.println("edad: " + p2.edad);
		System.out.println("estatura: " + p2.estatura);

		p.nombre = "Anthony";
		System.out.println("nombre:" + p.nombre);

	}

}
