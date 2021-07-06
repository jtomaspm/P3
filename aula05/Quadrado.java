package aula05;

import aula03.Ponto;

public class Quadrado extends Figura{
	
	private Ponto centro;
	private double area;
	private double perimetro;
	private double lado;
	
	
	
	public Quadrado(Ponto c, double l) {
		this.centro = c;
		this.lado = l;
		this.area = l*l;
		this.perimetro = l*4;
	}
	
	public Quadrado(double l, double x, double y){
		this.centro = new Ponto(x, y);
		this.lado = l;
		this.area = l*l;
		this.perimetro = l*4;
	}
	
	public Quadrado(double l){
		this.centro = new Ponto(0, 0);
		this.lado = l;
		this.area = l*l;
		this.perimetro = l*4;
	}
	
	@Override
	public Ponto centro() {
		// TODO Auto-generated method stub
		return this.centro;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.area;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.perimetro;
	}

}