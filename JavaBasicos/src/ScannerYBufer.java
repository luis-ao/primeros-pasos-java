import java.util.Scanner;

public class ScannerYBufer {
	public static void main(String[] args) {
		
/* Lo recomendado es usar un sólo Scanner y 
 * declarar distintas variables
		
  Scanner sc = new Scanner(System.in);
		
  System.out.println("Introduce un número");
  int numero1 = sc.nextInt(); 
		 
  System.out.println("Itroduce otro número");
  int numero2 = sc.nextInt();
		
  System.out.println("Número 1: " + numero1 + "Número 2: " + numero2);
*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		sc.nextLine();//para limpiar el buffer y no nos almacene el enter "/n"
		// debe limpiarse si después de un número vamos a solicitar un string
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		// Debemos de cerrar siempre después de solicitar los datos
		sc.close();//nombre del escaner.clouse();
		
		System.out.println("Tu nombre es: " + nombre + 
				". Tu número es: " + numero1);	
	}
}
