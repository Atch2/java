package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Productos Actuales: " + getProductosActuales());
		System.out.println("Productos Devueltos: " + getProductosDevueltos());
		System.out.println("Productos Vendidos: " + getProductosVendidos());

	}

	public void vender(int productosVendidos) {
		int productosActuales = getProductosActuales();
		int productoActualVendido = getProductosVendidos();
		int cantidadActual = productosActuales - productosVendidos;
		int cantidadVendido = productosVendidos + productoActualVendido;
		setProductosActuales(cantidadActual);
		setProductosVendidos(cantidadVendido);
	}

	public void devolver(int productosDevueltos) {
		int productosActuales = getProductosActuales();
		int productoActualDevuelto = getProductosDevueltos();
		int productosVendidos = getProductosVendidos();
		int cantidadActualPoductos = productosActuales + productosDevueltos;
		int cantidadActualVendido= productosVendidos - productosDevueltos;
		int cantidadActualDevueltos = productosDevueltos + productoActualDevuelto;
		setProductosDevueltos(cantidadActualDevueltos);
		setProductosActuales(cantidadActualPoductos);
		setProductosVendidos(cantidadActualVendido);
	}
}
