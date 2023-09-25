package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item();
		item.setNombre("Anthony");
		item.setProductosActuales(20);
		item.imprimir();
		
		System.out.println("..................");
		item.vender(10);
		item.imprimir();
		
		System.out.println("..................");
		item.devolver(5);
		item.imprimir();
	}

}
