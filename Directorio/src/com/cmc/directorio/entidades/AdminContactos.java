package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1;
		} else if(c1.getPeso() < c2.getPeso()){
			return c2;
		}else {
			return null;
		}

	}

	public boolean comprarOperadoras(Contacto c1, Contacto c2) {
		if (c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}

	public void activarUsuario(Contacto c) {
		if (c.getTelefono().getTieneWhatsapp() == true) {
			c.setActivo(true);
		}
	}
}
