package ejercicios;

public class Contador {
	// Escribe un ciclo que haga que un contador 
	// vaya de 15 a 90, contando de 3 en 3.
	
	public static void main(String[] args) {
		int numero = 15;
		
		while (numero < 91) {
			System.out.println("Numero " + numero);
			numero = numero + 3;
		}
	}
}
