package com.cmc.directorio.entidades;

public class AdminTelefono {
	Telefono telf = new Telefono();
	public void activarMensajeria(Telefono telefono) {
		String operadora = telefono.getOperadora();
		if (operadora == "movi") {
			telf.setTieneWhatsapp(true);
		}
		
	}
}
