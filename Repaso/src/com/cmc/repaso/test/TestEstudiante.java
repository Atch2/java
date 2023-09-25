package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {

		Estudiante estudiante = new Estudiante("Anthony");
		Estudiante estudiante2 = new Estudiante("Pedro");
		
		System.out.println("Nombre: " + estudiante.getNombre());
		estudiante.calificar(8.5);
		System.out.println("Nombre: " + estudiante2.getNombre());
		estudiante2.calificar(4.2);
	}

}
