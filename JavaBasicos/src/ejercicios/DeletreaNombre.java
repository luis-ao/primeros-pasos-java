package ejercicios;

import java.util.Scanner;

public class DeletreaNombre {
	/* Escribe un programa que pida al usuario ingresar su nombre 
	 * y que entonces imprima cada una de las letras de su nombre.

	Ejemplo: "Juan"
	"J"
	"u"
	"a"
	"n" */
	
	public static void main(String[] args) {
		System.out.println("Introduce tu nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		for (int i=0; i<nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
	}
	
	
	
	


}
