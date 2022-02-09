package com.generation;

public class Triangulo extends FiguraGeometrica {
	public Triangulo() {
		super("Triangulo");
	}
	
	@Override
	public float calcularArea() {
		return ( getAlto() * getLargo()) / 2;
	}
	
	@Override
	public float perimetro() {
		return 0;
	}

}
