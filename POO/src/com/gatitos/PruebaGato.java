package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato();
		
		//g.nombre = "Misifus";
		//g.patas = 3;
		
		System.out.println(g);
		
		g.setNombre("Misifus");
		g.setPatas(6);
		g.setAdoptado(true);
		
		System.out.println(g);
		System.out.println("Mi gato se llama " + g.getNombre());
		
		// excepciones
		/* int num1 = 5, num2 = 0;
		int resultado = num1/num2;
		System.out.println(resultado); */
	}
}
