
public class Arreglos {
	public static void main(String[] args) {
		// Un s�lo tipo de dato
		// Escpecificar el tama�o o cantidad de elementos que va contener
		// No podemos agregar datos a un arreglo ya creado
		
		//manera 1
		int numeros[];//creamos la variable
		numeros = new int[4];//creando el arreglo

		numeros[0]=10;
		numeros[1]=8;
		numeros[2]=100;
		numeros[3]=200;
		
		//manera 2
				String[] nombres= new String[4];//asado en 0. [0, 1, 2, 3]
				nombres[0] = "Felipe";
				nombres[1] = "Jose";
				nombres[2] = "Jesus";
				nombres[3] = "Juan";
		
		//manera 3, especifica los datos y el n�mero de datos en una s�la vez
		String []nombreFrutas = new String[]{"Manzana", "Platana", "Uva", "Pera"};
		
		// System.out.println(numeros[0]);
		
		for(int i=0; i < numeros.length; i++){// en los array no tenemos que usar par�ntesis
			System.out.println("Elemento de numeros " + numeros[i]);
			System.out.println("Elemento de nombres " + nombres[i]);
			System.out.println("Elemento de nombres " + nombreFrutas[i]);
			System.out.println("----------------------------------");
		}
		
		
		
		
				
	}

}
