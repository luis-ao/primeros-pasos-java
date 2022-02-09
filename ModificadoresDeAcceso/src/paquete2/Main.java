package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

public class Main {

	public static void main(String[] args) {
		ClaseDefault prueba = new ClaseDefault();
		
		// prueba.mostrar();
		
		ClasePrivada privada = new ClasePrivada();
		
		// privada.edad = 30;
		// privada.nombre = "Juan";
		privada.setSaludar("juan");
		
		System.out.println(privada.getSaludar());
		//System.out.println(privada.nombre);
		
		//objeto de la clase protected
		ClaseProtected protegido = new ClaseProtected();
		
		protegido.setEdad(18);
		
		System.out.println();
		


	}

}
