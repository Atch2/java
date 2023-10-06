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

	public void agregarNota(Nota nvNota) {
		Nota elementoNota = null;
		if (nvNota.getCalificacion() >= 0 && nvNota.getCalificacion() <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (nvNota.getMateria().getCodigo().equals(elementoNota.getMateria().getCodigo())) {
					System.out.println(
							"La nota ya existe la nota con el codigo" + elementoNota.getMateria().getCodigo() + ".");
					return;// Es como un Break, donde aqui finaliza la ejecucion y no vuelva al la linea 57
							// para agregar una nota;
				}
			}

			// Si no exite, añadir la nueva nota
			notas.add(nvNota);
			System.out.println("Se agrego la nota éxitosamente");
		} else {
			System.out.println("la Nota no esta en este rango 0-10");
		}
	}

	public void modificarNota(String codigo, double nvNota) {
		Nota notaEncontrada = null;
		Nota elementoNota = null;
		if (nvNota >= 0 && nvNota <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				notaEncontrada = elementoNota;
				if (codigo.equals(elementoNota.getMateria().getCodigo())) {
					notaEncontrada.setCalificacion(nvNota);
					System.out.println(
							"Nota modificada éxitosamente con el codigo: " + notaEncontrada.getMateria().getCodigo());
				} else {
					System.out.println("Codigo no encontrado");
				}
			}
		} else {
			System.out.println("La nota esta fuera del rango 0-10");
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
