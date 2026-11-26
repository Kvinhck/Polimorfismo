package com.krakedev.figuras;

public class Cuadrado extends Figura{
	
	private int lado;

	public Cuadrado(int lado, String nombre, String color) {
		super(nombre, color);
		this.lado = lado;
	}
	
	public int calcularPerimetro(){
		return 4 * lado;
	}
	
}
