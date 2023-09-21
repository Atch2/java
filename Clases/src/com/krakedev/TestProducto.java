package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Paracetamol";
		productoA.precio = 2;
		productoA.stockActual = 8;
		productoA.descripcion = "dslakf";
		System.out.println("nombre:" + productoA.nombre);
		System.out.println("precio: " + productoA.precio);
		System.out.println("stock: " + productoA.stockActual);
		System.out.println("descripcion: " + productoA.descripcion);
		
		productoB.nombre = "Paracetamol";
		productoB.precio = 2;
		productoB.stockActual = 8;
		productoB.descripcion = "dslakf";
		System.out.println("-------------------------");
		System.out.println("nombre:" + productoB.nombre);
		System.out.println("precio: " + productoB.precio);
		System.out.println("stock: " + productoB.stockActual);
		System.out.println("descripcion: " + productoB.descripcion);

		productoC.nombre = "Paracetamol";
		productoC.precio = 2;
		productoC.stockActual = 8;
		productoC.descripcion = "dslakf";
		System.out.println("-------------------------");
		System.out.println("nombre:" + productoC.nombre);
		System.out.println("precio: " + productoC.precio);
		System.out.println("stock: " + productoC.stockActual);
		System.out.println("descripcion: " + productoC.descripcion);

	}

}
