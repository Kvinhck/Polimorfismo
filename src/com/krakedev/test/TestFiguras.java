package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f = new Figura("Geometrica","Azul");
		
		Cuadrado c = new Cuadrado("Pepe","Purpura");
		
		Triangulo t = new Triangulo("Carlos","Vino");
		
		System.out.println(f);
		System.out.println(c);
		System.out.println(t);
	}

}
