package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;

	public int calculadora() {
		int area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = base + altura;
		return perimetro;
	}
	
}
