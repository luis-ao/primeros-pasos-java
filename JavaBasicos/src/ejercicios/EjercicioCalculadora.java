package ejercicios;
import java.util.Scanner;

public class EjercicioCalculadora {
	/*
	   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
	   * 1) Suma
	   * 2) Resta
	   * 3) División
	   * 4) Multiplicación
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
		
		System.out.println("¿Qué tipo de operación quieres realizar suma, resta, división o multiplicació?");
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
		case "división":
			int division2 = n1 / n2;
			System.out.println("El resultado es " + division2);
			break;
		case "multiplicación":
			int multiplicacion2 = n1 * n2;
			System.out.println("El resultado es " + multiplicacion2);
			break;	
		default:
			System.out.println("Por favor ingresa una operación valida");
		}
}
}
