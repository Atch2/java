package comkrakedev.test;

import comkrakedev.composicion.AdminProducto;
import comkrakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;

		AdminProducto admin = new AdminProducto();
		Producto prA = new Producto("Doritos", 0.50);
		Producto prB = new Producto("Papas", 0.50);

		mc = admin.buscarMasCaro(prA, prB);

		if (mc == null) {
			System.out.println("Son iguales");
		} else {
			System.out.println("El producto más caro es: " + mc.getNombre());
		}

	}

}
