package com.krakedev.herencia;

import com.krakedev.herencia.Animal;

public class Perro extends Animal {
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro durmiendo");
	}
}
