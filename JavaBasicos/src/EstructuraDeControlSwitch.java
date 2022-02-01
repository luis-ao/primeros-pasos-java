import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	/* switch (condicion_a_evaluar) {
	 * case "valor":
	 *      codigo a ejecutra
	 *      break
	 * ...
	 * case "n":
	 *      codigo a ejecutar
	 *      break
	 * default:
	 *      codigo a ejecutar
	 * }
	 */
	
	public static void main(String[] args) {
	
	// solicitar al usuario un día de la semana y mostrarle un mensaje
	System.out.println("Introduce un día de la semana");
	Scanner sc = new Scanner(System.in);
	String dia = sc.nextLine();// es para recuperar el valor en texto
	
	//toLowerCase convierte las letras en minusculas
	switch(dia.toLowerCase()) {
	case "lunes":
		System.out.println("Ya mero es vierns, toma un café");
		break;
	case "martes":
		System.out.println("Lunes chiquito. si se puede!!");
		break;
	case "miercoles":
	    System.out.println("ombliguito de semana");
	    break;
	case "jueves":
		System.out.println("Jueveves, toma una chela");
		break;
	case "viernes":
		System.out.println("Viernes pero a que costo");
		break;
	case "domingo":
	case "sabado":
		System.out.println("Basta de trabajación");
		break;
	default:
		System.out.println("Por favor ingresa un día de la semana");
	}

}
}
