import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		
/* Lo recomendado es usar un s�lo Scanner y 
 * declarar distintas variables
		
  Scanner sc = new Scanner(System.in);
		
  System.out.println("Introduce un n�mero");
  int numero1 = sc.nextInt(); 
		 
  System.out.println("Itroduce otro n�mero");
  int numero2 = sc.nextInt();
		
  System.out.println("N�mero 1: " + numero1 + "N�mero 2: " + numero2);
*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int numero1 = sc.nextInt();
		sc.nextLine();//para limpiar el buffer y no nos almacene el enter "/n"
		// debe limpiarse si despu�s de un n�mero vamos a solicitar un string
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		// Debemos de cerrar siempre despu�s de solicitar los datos
		sc.close();//nombre del escaner.clouse();
		
		System.out.println("Tu nombre es: " + nombre + 
				". Tu n�mero es: " + numero1);	
	}
}
