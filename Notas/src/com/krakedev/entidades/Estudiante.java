package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		notas = new ArrayList<Nota>();
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
		if (notas != null) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				notaEncontrada = elementoNota;
				if (nvNota >= 0 && nvNota <= 10) {
					if (elementoNota.getCalificacion() != nvNota) {
						notaEncontrada.setCalificacion(nvNota);
						System.out.println("Nota agregada éxitosamente");
					} else {
						System.out.println("La nota ya esxiste");
					}

				} else {
					System.out.println("La nota esta fuera del rango 0-10");
				}
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
					System.out.println("Nota modificada éxitosamente");
				} else {
					System.out.println("La nota esta fuera del rango 0-10");
				}

			} else {
				System.out.println("Codigo no encontrado");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		Nota elementoNota = null;
		double promedio;
		double sumaNotas = 0.0;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			sumaNotas += elementoNota.getCalificacion();
		}
		return promedio = sumaNotas / notas.size();
	}

	public void mostrar() {
		String infoEstudiante = "Estudiante [cedula=" + cedula + ",nombre=" + nombre + ",apellido=" + apellido + "]";
		System.out.println(infoEstudiante + " ");
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			elementoNota.mostrar();
		}
	}
}
