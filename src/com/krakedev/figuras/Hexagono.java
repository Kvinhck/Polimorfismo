package com.krakedev.figuras;

public class Hexagono extends Figura {

	private int lado;

	public Hexagono(int lado, String nombre, String color) {
		super(nombre, color);
		this.lado = lado;
	}

	@Override
	public int calcularPerimetro() {
		return 6 * lado;
	}

	@Override
	
	public int calcularArea() {
		return (int) ((3 * Math.sqrt(3) * lado * lado) / 2);
	}
}