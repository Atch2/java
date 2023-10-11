package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	
	public Naipe() {
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		
		Numero elementoNumero;
		for(int i =0; i < numerosPosibles.size(); i++) {
			elementoNumero = numerosPosibles.get(i);
			cartas.add(new Carta(elementoNumero, Palos.CORAZON_ROJO));
			cartas.add(new Carta(elementoNumero, Palos.CORAZON_NEGRO));
			cartas.add(new Carta(elementoNumero, Palos.DIAMANTE));
			cartas.add(new Carta(elementoNumero, Palos.TREBOL));
		}
	}


	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
