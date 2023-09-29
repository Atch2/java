package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Producto prod = maquina.buscarProductoCelda("A1");
		System.out.println("Producto encontrado:" + prod.getNombre());//En esta linea esta el problema porque estamos agregadon un null a un metodo
		/***
		 * Solucion al NullPointerException
		if(prod != null) {
			System.out.println("Producto encontrado:" + prod.getNombre());	
		}else {
			System.out.println("Producto no encontrado");
		}
		*****/
	}
}
