package ejercicios;
import java.util.Scanner;

public class EjercicioCalculadora {
	/*
	   * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) Divisi�n
	   * 4) Multiplicaci�n
	   * 
	   * y despues imprimir el resultado
	   */
	
	public static void main(String[] args) {
		
		System.out.println("Introduce  el primer numero entero");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("Introduce  el segundo numero entero");
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		
		System.out.println("�Qu� tipo de operaci�n quieres realizar suma, resta, divisi�n o multiplicaci�?");
		Scanner sc3 = new Scanner(System.in);
		String operacion = sc3.nextLine();
		
		switch(operacion.toLowerCase()) {
		case "suma":
			int suma2 = n1 + n2;
			System.out.println("El resultado es " + suma2);
			break;
		case "resta":
			int resta2 = n1 - n2;
			System.out.println("El resultado es " + resta2);
			break;
		case "divisi�n":
			int division2 = n1 / n2;
			System.out.println("El resultado es " + division2);
			break;
		case "multiplicaci�n":
			int multiplicacion2 = n1 * n2;
			System.out.println("El resultado es " + multiplicacion2);
			break;	
		default:
			System.out.println("Por favor ingresa una operaci�n valida");
		}
}
}
