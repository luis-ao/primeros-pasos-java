import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		/*
		Set<String> frutas= new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa"); */
		
		// foreach puede recorrer una colección, en cada
		// recorrido recuperar el valor y lo podemos almacenar
		// en una variable
	    //Sintaxis
		// for(TipoDeDatoElemento variable : elementoARecorrer)
		/* for (String fruta : frutas) {
			System.out.println(fruta);
		} */
		
	    // TreeSet
		// ordena los valores por lo que su implementación es lenta
		/*
		Set<String> frutas= new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
		} */
		
		// LinkedHashSet
		// Ordena los elementos en orden de insersión
		// es más costoso que HashSet pero menos que TreeSet
		/*
		Set<String> frutas= new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		// List
		// se permiten elementos duplicados
		// acceder  elementos spcificos
		// Buscar elementos
		
		// ArrayList
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chicorita");
		pokemones.add("Eevee");
		pokemones.add("Charizard");
		pokemones.add("Flygon");
		pokemones.add("Gengar");
		pokemones.add("Dragonite");
		pokemones.add("Psyduck");
		//pokemones.add("Gengar");
		
		//add
		pokemones.add(2, "Pikachu");
		//remove
		pokemones.remove(6);
		//set-reemplaza
		pokemones.set(0, "Caguamon");
		
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		// Podemos llamar al elemento en especifico a comparación de las colecciones
		System.out.println("----------------");
		System.out.println(pokemones.get(2));
		
		// indexOf, nos va a devolver la posición del elemento
		// y si el elemento no se encuentra nos devuelve -1
		System.out.println(pokemones.indexOf("Gengar"));
		//System.out.println(pokemones.lastIndexOf("Gengar"));
		
		System.out.println("----------------");
		
		// LinkedList
		// Es una lista doblemente enlazada
		// Es más rápido para insertar y remover elementos
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Adromon");
		digimones.add("Greymon");
		
		System.out.println(digimones.get(2));
		
		
		// Map
		// Asocia claves a valores
		// No puede contener claves duplicadas
		// Sólo puede tener un valor asociado
		
		// HashMap
		// Tiene mejor rendimiento pero no garantiza un orden
		// a la hora de hacer iteraciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1123, "Luis Roberto");
		usuarios.put(3242, "Carlos");
		usuarios.put(3453, "Ro");
		usuarios.put(12341, "Raul");
		
		System.out.println("----------------");
		System.out.println(usuarios.get(3242));
		
		//KeySet
		//Nos permite recuperar el nombre de la clave 
		System.out.println(usuarios.keySet());
		
		// Values
		// Nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		
		// TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("Torta", "Mole Verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println("----------------");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento -> { // Funcion lambda
			// System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		//LinkedHashMap
		Map<Integer, String> carros= new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(1123, "Pointer");
		carros.put(134, "Mustang");
	}
}
