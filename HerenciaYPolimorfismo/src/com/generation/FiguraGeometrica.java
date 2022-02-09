package com.generation;

public class FiguraGeometrica {
	protected String nombre;
	protected float alto;
	protected float largo;

	public FiguraGeometrica() {
		super();
	}

	public FiguraGeometrica(String nombre, float alto, float largo) {
		super();
		this.nombre = nombre;
		this.alto = alto;
		this.largo = largo;
	}

	public FiguraGeometrica(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float calcularArea() {
		return alto * largo;
	}

	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// public abstract float calcularArea();
}
