package paquete2;

public class ClasePrivada {
	//atributos
	String nombre;
	int edad;
	
	//m�todos
	public void setSaludar(String nombre){//fijar o modificar un valor
		this.nombre = nombre;
	}
	
	public String getSaludar() {
		return this.nombre;
	}

}
