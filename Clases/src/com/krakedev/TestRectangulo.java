package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p1 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetro1;
		
		r1.base = 10;
		r1.altura = 5;

		r2.base = 8;
		r2.altura = 3;
		
		p1.base = 4;
		p1.altura = 2;
		areaR1 = r1.calculadora();
		areaR2 = r2.calculadora();
		perimetro1 = p1.calcularPerimetro();
		
		System.out.println("Area de r1: " + areaR1);
		System.out.println("Area de r2: " + areaR2);
		System.out.println("Perimetro: " + perimetro1);
	
	}
	

}
