package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public ArrayList<Estudiante> getEstudainte() {
		return estudiantes;
	}

	public void setEstudainte(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudientePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				System.out.println("El estudiante esta dentro del curso");
			}
		}
		return null;
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		String mensaje = buscarEstudientePorCedula(estudiante);

		if (mensaje == null) {
			estudiantes.add(estudiante);
			System.out.println("Estudiante matriculado con éxito.");
		} else {
			System.out.println(mensaje);
		}
	}

	public double calcularPromedioCurso() {
		Estudiante elementoEstudiante = null;
		double sumaPromedios = 0.0;

		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			sumaPromedios += elementoEstudiante.calcularPromedioNotasEstudiante();
		}
		return sumaPromedios;
	}

	public void mostrar() {
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			elementoEstudiante.mostrar();
		}
	}
}
