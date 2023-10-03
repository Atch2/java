package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		String valorRecuperado;
		String cadena;
		cadenas = new ArrayList();
		
		System.out.println(cadenas.size());
		
		cadenas.add("uno");//0
		cadenas.add("dos");//1
		System.out.println("Cuenatos elementos hay en mi arreglo: " + cadenas.size());
		
		valorRecuperado = cadenas.get(1);
		System.out.println(valorRecuperado);
		
		
		for(int i=0; i<cadenas.size(); i++) {
			cadena = cadenas.get(i);
			System.out.println("Cadena: " + cadena);
		}
		
	}

}
