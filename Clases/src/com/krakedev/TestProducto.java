package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto("Paracetamol", "jdslkfg", 2, 8);
		Producto productoB = new Producto("Declofina", "jdslkfg", 2, 8);
		Producto productoC = new Producto("Aspirina", "jdslkfg", 2, 8);
		
		productoA.setNombre("Paracetamol");
		productoA.setPrecio(2);
		productoA.setStockActual(8);
		productoA.setDescripcion("dslakf");
		System.out.println("nombre:" + productoA.getNombre());
		System.out.println("precio: " + productoA.getPrecio());
		System.out.println("stock: " + productoA.getStockActual());
		System.out.println("descripcion: " + productoA.getDescripcion());
		
		productoB.setNombre("Paracetamol");
		productoB.setPrecio(2);
		productoB.setStockActual(8);
		productoB.setDescripcion("dslakf");
		System.out.println("-------------------------");
		System.out.println("nombre:" + productoB.getNombre());
		System.out.println("precio: " + productoB.getPrecio());
		System.out.println("stock: " + productoB.getStockActual());
		System.out.println("descripcion: " + productoB.getDescripcion());

		productoC.setNombre("Paracetamol");
		productoC.setPrecio(2);
		productoC.setStockActual(8);
		productoC.setDescripcion("dslakf");
		System.out.println("-------------------------");
		System.out.println("nombre:" + productoC.getNombre());
		System.out.println("precio: " + productoC.getPrecio());
		System.out.println("stock: " + productoC.getStockActual());
		System.out.println("descripcion: " + productoC.getDescripcion());

	}

}
