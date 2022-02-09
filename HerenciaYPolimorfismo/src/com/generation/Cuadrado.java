package com.generation;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado() {
		super("Cuadrado");
	}
	
	@Override
	public float calcularArea() {
		return getAlto() * getLargo();
	}
	
	@Override
	public float perimetro() {
		return (getAlto() + getLargo()) * 2;
	}

}
