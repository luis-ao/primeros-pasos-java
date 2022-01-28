import java.util.Scanner;

public class EstructudaDeControlIf {

	public static void main(String[] args) {
		/*Estructuras de control de flujo
		* Nos sirve para la toma de decisiones 
		* para cambiar el flujo de nuestro programa
		* evaluando una condición y a partir de la evaluación 
		* se realiza una acción u otra. */
		
		/* if(condicion) {
		 * codigo
		 * } else {
		 * codigo
		 * }*/
		
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();// tenemos que especificar como vamos a recuperar el dato
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
}
