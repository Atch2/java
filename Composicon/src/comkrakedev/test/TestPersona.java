package comkrakedev.test;

import comkrakedev.composicion.Direccion;
import comkrakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Anthony");
		p1.setApellido("Roda");
		
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Av. Shiris");
		dir.setCalleSecendaria("La rosa");
		dir.setNumero("N321");
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Capac", "Abdon", "N12");
		p2.setNombre("Mateo");
		p2.setDireccion(d2);
		p2.imprimir();
		
		p1.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("jsfa", "dasfka", "5sfa"));
		p3.imprimir();
	}

}
