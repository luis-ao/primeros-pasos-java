import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// Pedirle 3 �ngulos a un usuario y 
		// decirle si es un triangulo v�lido
		
		System.out.println("Introduce  el primer �ngulo");
		Scanner scn = new Scanner(System.in);
		int a1 = scn.nextInt();
		
		System.out.println("Introduce  el segundo �ngulo");
		Scanner scn2 = new Scanner(System.in);
		int a2 = scn2.nextInt();
		
		System.out.println("Introduce  el tercer �ngulo");
		Scanner scn3 = new Scanner(System.in);
		int a3 = scn3.nextInt();
		
		int usuario = a1 + a2 + a3;
		
		if(usuario == 180) {
			System.out.println("Es un triangulo");
		} else {
			System.out.println("NO es un triangulo");
		}
	}

}
