package com.cmc.repaso.entidades;

public class Estudiante {

	private String nombre;
	private double nota;
	private String resultado;

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void calificar(double nota) {
		setNota(nota);
		double notaActual = getNota();
		if (notaActual < 8) {
			setResultado("F");
			System.out.println("Resultado: " + getResultado());
		}else {
			setResultado("A");
			System.out.println("Resultado: " + getResultado());
		}
	}

}
