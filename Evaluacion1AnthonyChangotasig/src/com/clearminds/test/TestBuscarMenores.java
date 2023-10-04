package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		Producto elementoProducto;

		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto1 = new Producto("KE34", "Papitas", 0.85);
		Producto producto2 = new Producto("D456", "Jugo1L", 1.90);
		Producto producto3 = new Producto("D456", "Doritos", 0.50);
		Producto producto4 = new Producto("D456", "Ricks", 1.35);
		Producto producto5 = new Producto("D456", "Jet", 0.25);
		Producto producto6 = new Producto("D456", "DeTodito", 0.60);
		maquina.cargarProducto(producto1, "A1", 4);
		maquina.cargarProducto(producto2, "A2", 6);
		maquina.cargarProducto(producto4, "B1", 6);
		maquina.cargarProducto(producto3, "B2", 4);
		maquina.cargarProducto(producto5, "C1", 4);
		maquina.cargarProducto(producto6, "C2", 6);

		ArrayList<Producto> productosMenores = maquina.buscarMenores(1);
		// Opcion 1
		System.out.println("Productos Menores: " + productosMenores.size());

		// Opcion 2
		for (int i = 0; i < productosMenores.size(); i++) {
			elementoProducto = productosMenores.get(i);
			System.out.println("Nombre: " + elementoProducto.getNombre() + "Precio: " + elementoProducto.getPrecio());
		}
	}

}
