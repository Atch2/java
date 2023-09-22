package com.krakedev;

public class Calculadora {

	public int sumar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public double restar(int valor1, int valor2) {
		double resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	public double multiplicar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;
		return resultado;
	}
	public double dividir(double valor1, double valor2) {
		double resultado;
		resultado= valor1 / valor2;
		return resultado;
	}
	public double promediar(int valor1, int valor2, int valor3) {
		double totalPromedio;
		double suma;
		suma = valor1 + valor2 + valor3;
		totalPromedio= suma / 3;
		return totalPromedio;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahotira no joven, Sali al almuerzo.regreso en 15 minitos.");
	}

}
