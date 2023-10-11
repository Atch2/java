package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		telefonos = new ArrayList<Telefono>();
	}

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void imprimir() {
		if (getDireccion() != null) {
			System.out.println("Cédula: " + getCedula() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido()
					+ "\nDirección: " + "\n    Calle Principal: " + getDireccion().getCallePrincipal()
					+ "\n    Calle Secundaria: " + getDireccion().getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		Telefono elementoTelefono;
		for(int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if(elementoTelefono.getEstado().equals("C")) {
				System.out.println("Numero: " + elementoTelefono.getNumero() + ", " + "Tipo: " + elementoTelefono.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonoIncorrecto = new ArrayList<Telefono>();
		Telefono elementoTelefono;
		for(int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if(elementoTelefono.getEstado().equals("E")) {
				telefonoIncorrecto.add(elementoTelefono);
			}
		}
		return telefonoIncorrecto;
	}

}
