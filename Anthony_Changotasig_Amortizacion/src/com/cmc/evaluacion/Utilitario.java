package com.cmc.evaluacion;

import java.math.RoundingMode;

public class Utilitario {
	public static double redondear(double valor) {
		double numeroRound = Math.round(valor * 100.0) / 100.0;
		return numeroRound;
	}
}
