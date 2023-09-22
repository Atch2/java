package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora calcu = new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;
		
		resultadoSuma= calcu.sumar(5, 7);
		System.out.println("Resultado: " + resultadoSuma);
		
		resultadoResta= calcu.restar(7, 11);
		System.out.println("Resultado: " + resultadoResta);
		
		resultadoMultiplicar= calcu.multiplicar(7, 11);
		System.out.println("Resultado: " + resultadoMultiplicar);
		
		resultadoDividir= calcu.dividir(7, 11);
		System.out.println("Resultado: " + resultadoDividir);
		
		resultadoPromedio= calcu.promediar(7, 11, 8);
		System.out.println("Resultado: " + resultadoMultiplicar);
		
		calcu.mostrarResultado();
		
	}

}
