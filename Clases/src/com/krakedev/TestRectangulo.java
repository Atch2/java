package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {		
		Rectangulo r1 = new Rectangulo(10, 5);
		Rectangulo r2 = new Rectangulo(4, 2);
		Rectangulo p1 = new Rectangulo(8,3);
		
		int areaR1;
		int areaR2;
		double perimetro1;
		
		r1.setBase(10);
		r1.setAltura(5);

		r2.setBase(8);
		r2.setAltura(3);
		
		p1.setBase(4);
		p1.setAltura(2);
		areaR1 = r1.calculadora();
		areaR2 = r2.calculadora();
		perimetro1 = p1.calcularPerimetro();
		
		System.out.println("Area de r1: " + areaR1);
		System.out.println("Area de r2: " + areaR2);
		System.out.println("Perimetro: " + perimetro1);
	
	}
	

}
