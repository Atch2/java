package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int hora) {
		String valor;
		if (hora >= 0 && hora < 10) {
			valor = "0" + hora;
			return valor;
		}else {
			return valor = String.valueOf(hora);
		}
		
	}
	
	public static String formatearDia(int dia) {
		String diaFotmat;
		switch (dia) {
		case 0:
			diaFotmat = "Lunes";
			break;
		case 1:
			diaFotmat = "Martes";
			break;
		case 2:
			diaFotmat = "Miercoles";
			break;
		case 3:
			diaFotmat = "Jueves";
			break;
		case 4:
			diaFotmat = "Viernes";
			break;
		case 5:
			diaFotmat = "Sabado";
			break;
		case 6:
			diaFotmat = "Domingo";
			break;
		default:
			diaFotmat = "El número no existe";
			break;
		}
		return diaFotmat;
	}
}
