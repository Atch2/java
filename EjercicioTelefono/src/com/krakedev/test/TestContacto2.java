package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto2 {

	public static void main(String[] args) {
	    // Crear una instancia de Direccion
        Direccion direccion = new Direccion("Av. siempre Viva", "Calle 4");

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Rosa", "Chavez", direccion);

        // Mostrar información usando el método imprimir
        System.out.println("***" + contacto.getNombre() + " " + contacto.getApellido()+ "***");
        contacto.imprimir();

        // Crear una instancia de Contacto
        Contacto contacto2 = new Contacto("1234567890", "Ernesto", "Montoya");

        // Mostrar información usando el método imprimir
        System.out.println("***" + contacto2.getNombre() + " " + contacto2.getApellido()+ "***");
        contacto2.imprimir();
        
    }
	}

