package comkrakedev.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSecendaria;
	private String numero;
	private double latitud;
	private double longitud;

	public Direccion() {
	}

	public Direccion(String callePrincipal, String calleSecendaria, String numero) {
		this.callePrincipal = callePrincipal;
		this.calleSecendaria = calleSecendaria;
		this.numero = numero;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecendaria() {
		return calleSecendaria;
	}

	public void setCalleSecendaria(String calleSecendaria) {
		this.calleSecendaria = calleSecendaria;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}
