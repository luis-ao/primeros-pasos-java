import java.util.HashSet;
import java.util.Set;

public class Colecciones {
	// Nos sirve para almacenar un conjunto de objetos
	// La diferencia de las colecciones y los objetos es que
	// las colecciones son dinámicas, pueden cambiar el numero
	// de objetos agregados 
	public static void main(String[] args) {
		
		//Set tiene 3 implemntaciones
		//No puede contener elmentos repetidos
		
		//HashSet
		//Los elementos no mantienen un orden
		
		Set<String> frutas= new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		// foreach puede recorrer una colección y en cada
		// recorrido recuperar el valor y lo podemos almacenar
		// en una variable
	    //Sintaxis
		// for(TipoDeDatoElemento variable : elementoARecorrer)
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		
	    // TreeSet
		// LinkedHashSet
	}
}
