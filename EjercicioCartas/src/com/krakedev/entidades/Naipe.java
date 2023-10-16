package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		cartas = new ArrayList<Carta>();
		numerosPosibles = new ArrayList<Numero>();
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
		for (int i = 0; i < numerosPosibles.size(); i++) {
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

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		Carta elementoCarta;
		for (int i = 1; i <= 100; i++) {
			int posicion = Random.obtenerPosicion();
			for (int j = 0; j < cartas.size(); j++) {
				elementoCarta = cartas.get(posicion);
				if (elementoCarta.getEstado().equals("N")) {
					elementoCarta.setEstado("C");
					auxiliar.add(elementoCarta);
					break;
				}
			}
		}

		for (int f = 0; f < cartas.size(); f++) {
			elementoCarta = cartas.get(f);
			if (elementoCarta.getEstado().equals("N")) {
				auxiliar.add(elementoCarta);
			}
		}

		return auxiliar;

	}

}
