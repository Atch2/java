package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	public Juego(ArrayList<String> idsJugadores) {
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();

		for (int i = 0; i < idsJugadores.size(); i++) {
			ArrayList<Carta> cartasParaJugar = new ArrayList<Carta>();
			cartasJugadores.add(cartasParaJugar);
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int cartasEntregadas = 0;
		for (int i = cartasEntregadas; i <= cartasPorJugador; i++) {
			for (int j = 0; j < cartasJugadores.size(); j++) {
				if (cartasEntregadas < naipeBarajado.size()) {
					Carta carta = naipeBarajado.get(cartasEntregadas);
					cartasJugadores.get(j).add(carta);
					cartasEntregadas++;
				}
			}
		}

	}

	public int devolverTotal(int idJugador) {
		ArrayList<Carta> cartas = cartasJugadores.get(idJugador);
		int total = 0;
		Carta elmentoCarta;
		for (int i = 0; i < cartas.size(); i++) {
			elmentoCarta = cartas.get(i);
			total += elmentoCarta.getNumero().getValor();
		}
		return total;
	}

	public int determinarGanador() {
		int idGanador = 0;
		int sumaGanador = devolverTotal(0);
		for (int i = 1; i < cartasJugadores.size(); i++) {
			int sumaActual= devolverTotal(i);
			if(sumaActual >= sumaGanador) {
				sumaGanador = sumaActual;
				idGanador = i;
			}
		}
		
		return idGanador;
	}

}
