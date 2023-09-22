package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {

		Cuadrado c = new Cuadrado();
		Cuadrado p = new Cuadrado();
		
		double area;
		double perimetro;
		
		c.lado = 4;
		p.lado = 3;
		
		area = c.calcularAreaCuadrado();
		perimetro = p.calcularPerimetro();		
		System.out.println("Area del cuadro: " + area);
		System.out.println("Perimetro del cuadrado: " + perimetro);
		
	}

}
