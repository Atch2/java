package com.krakedev.herencia;

import com.krakedev.herencia.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("1754426098", "Anthony");
		Cuenta c = new Cuenta("123456789", 25.30);
		System.out.println("Hola");
		System.out.println(p);//toString
		System.out.println(c);
	}

}
