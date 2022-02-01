
public class Ciclos {
	public static void main(String[] args) {
		
//While
	
		int control = 0;
		
		while(control < 10) {
			System.out.println("control = " + control);
			control++;
		}
		
//do while
		
		// Variable de control
		int control2 = 0;
		
		do {
			// código a ejecutar
			System.out.println("control2 = " + control2);
			
			// modificador de la variable de control
			control2++;
			
		} while(control2 < 3);//condición a evaluar
		
// for
		/* for (int i = 0; i < 3; i++) {
			System.out.println("control = " + i);
			} */ // La variable i sólo vive dentro del ciclo for
		
		// break & continue
		/*for (int i = 0; i < 10; i++) {
			// sólo se ejecuta cuando el valor sea par 
			if( i % 2 == 0) {
				System.out.println("control = " + i);
				break;
			}*/
		
		for (int i = 0; i < 10; i++) {
			
			if( i % 2 == 0) {
				
				continue;// Permite saltarnos una ejecución del ciclo
				// deja que continue el ciclo
			}
			System.out.println("control = " + i);
		}
	}
}
