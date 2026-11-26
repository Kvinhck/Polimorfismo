package com.krakedev.figuras;

public class Triangulo extends Figura {

	private int base;
	private int altura;

	public Triangulo(int base, int altura, String nombre, String color) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public int calcularArea() {
		return base * altura / 2;
	}

	@Override
	public int calcularPerimetro() {
		return 0;
	}
}