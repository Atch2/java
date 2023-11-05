package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemanas;

public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarmas ada = new AdminAlarmas();
		ada.agregarAlarma(new Alarma(DiasSemanas.LUNES, 7, 30));
		ada.agregarAlarma(new Alarma(DiasSemanas.MARTES, 8, 40));
		ada.agregarAlarma(new Alarma(DiasSemanas.MIERCOLES, 9, 50));
		ada.agregarAlarma(new Alarma(DiasSemanas.JUEVES, 10, 25));
		ada.agregarAlarma(new Alarma(DiasSemanas.VIERNES, 11, 35));
		ada.agregarAlarma(new Alarma(DiasSemanas.SABADO, 12, 49));
		ada.agregarAlarma(new Alarma(DiasSemanas.DOMINGO, 13, 18));
		
		ArrayList<Alarma> alarmasActuales = ada.getAlarmas();
		Alarma elementoAlarma;
		for (int i=0; i < alarmasActuales.size(); i++) {
			elementoAlarma = alarmasActuales.get(i);
			System.out.println(elementoAlarma);
		}
	}

}
