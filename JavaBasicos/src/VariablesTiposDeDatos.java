
public class VariablesTiposDeDatos {
	public static void main(String[] args) {
		
		// String permite almacernar cadenas de texto
		String nombre = "Luis Roberto";
		
		// Char nos permite almacenar un caracter, pero sólo 1
		char inicial = 'C';
		
		// bolean almacena un valor booleano, puede ser true o false
		boolean tienesCrush = true;
		
		// Tipos de Datos Enteros
		// podemos usar un dato mejor en cada tipo pero estaríamos desperdiciando memoría
		
		//byte
		byte edad = 26;
		
		//short
		short suma = 24 + 104;
		
		//int
		int numero = 1021321312;
		
		//long (podemos usar "_" en lugar de "," para que sea legible)
		long numeroLargo = 100_000_000;
		
		System.out.println(numeroLargo);
		
		// float (ser explicitos y agregar una f, ya que java siempre trata los decimales como double)
		float promedio = 1232.23232f;
		
		// double
		double numeroPi = 3.1415934324234;
	}
}
