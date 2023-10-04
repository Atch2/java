package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String apellido;
	ArrayList<Nota> notas = new ArrayList<Nota>();

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void agregarNota(double nvNota) {
		Nota elementoNota = null;
		Nota notaEncontrada = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			notaEncontrada = elementoNota;
			if (nvNota >= 0 && nvNota <= 10) {
				if (elementoNota.getCalificacion() != nvNota) {
					notaEncontrada.setCalificacion(nvNota);
				} else {
					System.out.println("La nota ya esxiste");
				}

			} else {
				System.out.println("La nota esta fuera del rango 0-10");
			}
		}
	}

	public void modificarNota(String codigo, double nvNota) {
		Nota notaEncontrada = null;
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			notaEncontrada = elementoNota;
			if (codigo.equals(elementoNota.getMateria().getCodigo())) {
				if (nvNota >= 0 && nvNota <= 10) {
					notaEncontrada.setCalificacion(nvNota);
				} else {
					System.out.println("La nota esta fuera del rango 0-10");
				}

			} else {
				System.out.println("Codigo no encontrado");
			}
		}
	}

	public void calcularPromedioNotasEstudiante(String codigo, double nuevaNota) {
		Nota elementoNota = null;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			promedio = elementoNota.getCalificacion() + 
		}
	}
}
