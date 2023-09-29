package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1 = new Celda(cod1);
		celda2 = new Celda(cod2);
		celda3 = new Celda(cod3);
		celda4 = new Celda(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("\nCelda1: " + celda1.getCodigo() + "\nCelda2: " + celda2.getCodigo() + "\nCelda3: "
				+ celda3.getCodigo() + "\nCelda4: " + celda4.getCodigo() + "\nSaldo: " + getSaldo());
	}

	public Celda buscarCelda(String codigoCelda) {
		if (codigoCelda != null && codigoCelda == celda1.getCodigo()) {
			return celda1;
		} else if (codigoCelda != null && codigoCelda == celda2.getCodigo()) {
			return celda2;
		} else if (codigoCelda != null && codigoCelda == celda3.getCodigo()) {
			return celda3;
		} else if (codigoCelda != null && codigoCelda == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
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
		System.out.println("***********CELDA " + celda1.getCodigo());
		if (celda1.getProducto() != null) {
			System.out.println("\nCodigo: " + celda1.getProducto().getCodigo() + "\nStock Actual: " + celda1.getStock()
					+ "\nNombre Producto: " + celda1.getProducto().getNombre() + "\nPrecio: "
					+ celda1.getProducto().getPrecio());
		} else {
			System.out.println("\nStock: " + celda1.getStock());
			System.out.println("La celda no tiene productos ");
		}
		System.out.println("***********CELDA " + celda2.getCodigo());
		if (celda2.getProducto() != null) {
			System.out.println("\nCodigo: " + celda2.getProducto().getCodigo() + "\nStock Actual: " + celda2.getStock()
					+ "\nNombre Producto: " + celda2.getProducto().getNombre() + "\nPrecio: "
					+ celda2.getProducto().getPrecio());
		} else {
			System.out.println("\nStock: " + celda2.getStock());
			System.out.println("La celda no tiene productos ");
		}
		System.out.println("***********CELDA " + celda3.getCodigo());
		if (celda3.getProducto() != null) {
			System.out.println("\nCodigo: " + celda3.getProducto().getCodigo() + "\nStock Actual: " + celda3.getStock()
					+ "\nNombre Producto: " + celda3.getProducto().getNombre() + "\nPrecio: "
					+ celda3.getProducto().getPrecio());
		} else {
			System.out.println("\nStock: " + celda3.getStock());
			System.out.println("La celda no tiene productos ");
		}
		System.out.println("***********CELDA " + celda4.getCodigo());
		if (celda4.getProducto() != null) {
			System.out.println("\nCodigo: " + celda4.getProducto().getCodigo() + "\nStock Actual: " + celda4.getStock()
					+ "\nNombre Producto: " + celda4.getProducto().getNombre() + "\nPrecio: "
					+ celda4.getProducto().getPrecio());
		} else {
			System.out.println("\nStock: " + celda4.getStock());
			System.out.println("La celda no tiene productos ");
		}
		System.out.println("Saldo: " + getSaldo());

	}

	public Producto buscarProductoCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codProduc) {
		if (celda1.getProducto() != null && codProduc == celda1.getProducto().getCodigo()) {
			return celda1;
		} else if (celda2.getProducto() != null && codProduc == celda2.getProducto().getCodigo()) {
			return celda2;
		} else if (celda3.getProducto() != null && codProduc == celda3.getProducto().getCodigo()) {
			return celda3;
		} else if (celda4.getProducto() != null && codProduc == celda4.getProducto().getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
			int aggItems = cantidadItems + celdaEncontrada.getStock();
			celdaEncontrada.setStock(aggItems);
	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		int menorarStock = celdaEncontrada.getStock() -1;
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
