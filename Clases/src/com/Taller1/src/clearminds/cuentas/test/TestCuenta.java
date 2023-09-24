package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		Cuenta cuenta6 = new Cuenta("0666", "A", 0);

		cuenta1.setSaldo(675);
		cuenta3.setTipo("C");
		
		System.out.println("-------Valores Iniciales----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("-------Valores modificados----------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("-------Valores Cuenta 4----------");
		cuenta4.setSaldo(10);
		cuenta4.imprimir();
		
		System.out.println("-------Valores Cuenta 5----------");
		cuenta5.imprimir();
		
		System.out.println("-------Valores Cuenta 6----------");
		cuenta6.imprimir();
		
		System.out.println(".............Valores Cuenta 6............");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
