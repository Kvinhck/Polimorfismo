package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c = new Cuadrado(10,"Cuadrado","Verde");
		
		int perimetro = c.calcularPerimetro();
		
		System.out.println("Perimetro Cuadrado: " + perimetro);
		
		Rectangulo r = new Rectangulo(10,5,"Rectangulo","Azul");
		
		int peri = r.calcularPerimetro();
		
		System.out.println("Perimetro Rectangulo: " + peri);
		}

}
