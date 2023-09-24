package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 =new Auto("Toyota", 2023, 6000);
		Auto auto2 = new Auto("Ford", 2012, 8000);
		
		auto1.setMarca("Toyota");
		auto1.setAnio(2023);
		auto1.setPrecio(6000);
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		

		auto2.setMarca("Ford");
		auto2.setAnio(2015);
		auto2.setPrecio(8000);
		System.out.println(".........................");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());

	}

}
