package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura{
	private double catetoA;
	private double catetoB;
	private double hipotenusa;
	
	public TrianguloRectangulo(double catetoA, double catetoB, String nombre, String color) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
	}
	
	@Override
	public int calcularPerimetro() {
		return (int) (catetoA + catetoB + hipotenusa);
	}
	
	@Override
	public int calcularArea() {
		return (int) (catetoA * catetoB / 2);
	}
}
