package metodos;

public class Metodos {
	//M�todos es una funci�n
	
	// Atributos de la clase
	int a, b;
	
	//M�todo void (vacio)
	public void sumar () {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
	}
	
	// M�todo con retorno de valores
	public int sumaConRetorno() {
		// int resultado = a + b;
		// return resultado;
		return a + b;
	}
	
	//argumntos
	//suma (argumentos)
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c =  arg1;
		double d = arg2;
		return c * d;
	}
	
	//M�todo est�tico
	//estatico, void(no regresa datos), usa argumentos
	public static void inprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
}
