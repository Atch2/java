package com.krakedev.herencia;

import com.krakedev.herencia.Animal;
import com.krakedev.herencia.Perro;

public class TestHerencia {

	public static void main(String[] args) {
		Perro p = new Perro();
		p.dormir();
		Animal a = new Animal();
		p.ladrar();
	}

}
