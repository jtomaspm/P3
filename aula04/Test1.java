package aula04;

import aula03.Circulo;
import aula03.Figura;
import aula03.Ponto;
import aula03.Quadrado;
import aula03.Rectangulo;

public class Test1 {
	 public static void main(String[] args) {
	Circulo c1 = new Circulo(2);
	 Circulo c2 = new Circulo(1, 3, 2);
	 Quadrado q1 = new Quadrado(2);
	 Quadrado q2 = new Quadrado(3, 4, 2);
	 Rectangulo r1 = new Rectangulo(2, 3);
	 Rectangulo r2 = new Rectangulo(3, 4, 2, 3);
	 ColecaoFiguras col = new ColecaoFiguras(42.0); // MaxArea
	 System.out.println(col.addFigura(c2)); // true
	 System.out.println(col.addFigura(r1)); // true
	 System.out.println(col.addFigura(r1)); // false
	 System.out.println(col.addFigura(r2)); // true
	 System.out.println(col.addFigura(c1)); // true
	 System.out.println(col.addFigura(q2)); // true
	 System.out.println(col.addFigura(q1)); // false
	System.out.println(col.delFigura(r1)); // true
	 System.out.println(col.addFigura(q1)); // true

	 System.out.println("\n�rea Total da Lista de Figuras: " + col.areaTotal());

	 System.out.println("\nLista de Figuras:");
	 for (Figura f: col.getFiguras())
	 System.out.println(f);

	 System.out.println("\n\nCirculos na Lista de Figuras:");
	 for (Figura f: col.getFiguras())
	 if (f instanceof Circulo)
	 System.out.println(f);

	 System.out.println("\n\nCentro das Figuras:");
	 for (Ponto p: col.getCentros())
	 System.out.println(p);
	 }
	}