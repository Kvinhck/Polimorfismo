package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();

		//Figura figura = new Figura("Figura","Negro");

		Cuadrado cuadrado = new Cuadrado(10,"Cuadrado","Rojo");

		Rectangulo rectangulo = new Rectangulo(10,8,"Rectangulo","Azul");
		
		TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4, "Triangulo Rectangulo", "Verde");
		
		Hexagono hexagono = new Hexagono(4, "Hexagono", "Morado");
		
		
		graficador.graficar(hexagono);
		graficador.graficar(triangulo);
		//graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
	}
}