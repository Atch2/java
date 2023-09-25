package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {

		Producto pr = new Producto("Computadora", 500);
		Producto pr2 = new Producto();

		pr.setPrecio(-900);
		pr2.setPrecio(-200);

		System.out.println("Precio con descuento: " + pr2.calcularPrecioPromo(30));
		System.out.println(pr.getPrecio()); 
	}

}
