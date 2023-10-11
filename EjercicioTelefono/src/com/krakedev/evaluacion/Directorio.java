package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private SimpleDateFormat dateFormat;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		fechaModificacion = new Date();
		// SimpleDateFormat = nos ayuda a convertir las fechas al formato de texto que
		// queramos
		dateFormat = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(SimpleDateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto = null;
		Contacto contactoEncontrado = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			contactoEncontrado = elementoContacto;
		}
		if (contactoEncontrado != null && cedula.equals(contactoEncontrado.getCedula())) {
			return elementoContacto;
		} else {
			return null;
		}

	}

	public String consultarUltimaModificacion() {
		return dateFormat.format(getFechaModificacion());
	}

	public int contarPerdidos() {
		ArrayList<Contacto> contarSinDireccion = new ArrayList<Contacto>();
		Contacto elementoContacto;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				contarSinDireccion.add(elementoContacto);
			}
		}

		return contarSinDireccion.size();
	}

	public int contarFijos() {
		ArrayList<Contacto> contarTelefono = new ArrayList<Contacto>();
		Contacto elementoContacto;
		ArrayList<Telefono> telefonos;
		Telefono elementoTelefono;
		int count = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			telefonos = elementoContacto.getTelefonos();
			for (int j = 0; j < telefonos.size(); j++) {
				elementoTelefono = telefonos.get(j);
				if (elementoTelefono.getTipo().equals("Convencional") && elementoTelefono.getEstado().equals("C")) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	public void depurar() {
		Contacto elementoContacto = null;
		Contacto contactoEncontrado = null;
		for(int i= 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			contactoEncontrado = elementoContacto;
			if(elementoContacto.getDireccion() !=null) {
				correctos.add(elementoContacto);
			}else if(contactoEncontrado.getDireccion() == null) {
				incorrectos.add(elementoContacto);
			}
		}
		contactos.removeAll(contactos);
		
	}

}
