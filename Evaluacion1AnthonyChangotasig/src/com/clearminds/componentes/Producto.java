package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;

	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentaje) {
		double precioFinal = precio + (precio * porcentaje / 100);
		setPrecio(precioFinal);
	}

	public void disminuirPrecio(double descuento) {
		double precioFinal = precio - descuento;
		setPrecio(precioFinal);
	}

}
