
public class ConversionDatos {
	public static void main(String[] args) {
		
		byte numeroByte = 10;
		
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort;
		
		long numeroLong = numeroInt;
		
		// Casteo o parceo, importante: podemos perder información en esta conversión
		int otroInt = (int) numeroLong;
		
		short otroShort = (short) otroInt;
		
		
		// cuando hace opraciones aritmeticas por lo regular convierte los datos a tipo int a mnos que le digamos lo contrario 
		short numero1 = 123;
		short numero2 = 7343;
		byte numero3 = 12;
		byte numero4 = 33;

		// int suma = numero1 + numero2;
		
		short suma = (short) (numero1 + numero2);
		byte suma2 = (byte) (numero3 + numero4);
		int suma3 = numero3 + numero4;
		// estamos sumando distintos tipos de datos, debemos convertirlos
		short suma4 = (short) (numero1 + numero3);
		
		
	}
}
