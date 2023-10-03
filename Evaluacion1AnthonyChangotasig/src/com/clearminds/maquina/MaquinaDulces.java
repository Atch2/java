package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda codCelda) {
		celdas.add(codCelda);
	}

	public void mostrarConfiguracion() {
		Celda codCelda;
		for (int i = 0; i < celdas.size(); i++) {
			codCelda = celdas.get(i);
			System.out.println("Celda: " + codCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codCelda != null && codCelda.equals(elementoCelda.getCodigo())) {
				return celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);

		} else {
			System.out.println("Celda no encontrada...");
		}

	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				System.out.println("\nCelda: " + elementoCelda.getCodigo() + "\nStock: " + elementoCelda.getStock()
						+ "\nProducto: " + elementoCelda.getProducto().getNombre() + "\nPrecio: "
						+ elementoCelda.getProducto().getPrecio());
			} else {
				System.out.println("\nCelda: " + elementoCelda.getCodigo() + "\nStock: " + elementoCelda.getStock()
						+ "\n Sin Producto asignado");
				System.out.println();
			}
		}
		System.out.println("Saldo: " + getSaldo());

	}

	public Producto buscarProductoEnCelda(String codCelda) {
		Celda celEncontrada = buscarCelda(codCelda);
		if (celEncontrada != null && codCelda.equals(celEncontrada.getCodigo())) {
			return celEncontrada.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codCelda) {
		Celda celEncontrada = buscarCelda(codCelda);
		if (celEncontrada != null && codCelda.equals(celEncontrada.getCodigo())) {
			return celEncontrada.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codProduc) {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda != null && codProduc.equals(elementoCelda.getProducto().getCodigo())) {
				return elementoCelda;
			}
		}
		return elementoCelda;

	}

	public void incrementarProductos(String codProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
		int aggItems = cantidadItems + celdaEncontrada.getStock();
		celdaEncontrada.setStock(aggItems);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int menorarStock = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(menorarStock);
		double saldoMaquina = getSaldo() + celdaEncontrada.getProducto().getPrecio();
		setSaldo(saldoMaquina);
		mostrarProductos();
	}

	public double venderConCambio(String codCelda, double valorIngresado) {
		vender(codCelda);
		double vuelto = valorIngresado - consultarPrecio(codCelda);
		return vuelto;
	}
}
