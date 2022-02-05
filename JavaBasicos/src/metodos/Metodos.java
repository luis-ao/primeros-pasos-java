package metodos;

public class Metodos {
	//Métodos es una función
	
	// Atributos de la clase
	int a, b;
	
	//Método void (vacio)
	public void sumar () {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
	}
	
	// Método con retorno de valores
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
	
	//Método estático
	//estatico, void(no regresa datos), usa argumentos
	public static void inprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
}
