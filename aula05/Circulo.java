package aula05;

import aula03.Ponto;

public class Circulo extends Figura{
	
	private Ponto centro;
	private double area;
	private double perimetro;
	private double raio;
	
	
	
	public Circulo(Ponto c, double r) {
		this.centro = c;
		this.raio = r;
		this.area = Math.PI*Math.pow(r,2);
		this.perimetro = Math.PI*2*r;
	}
	
	public Circulo(double r){
		this.centro = new Ponto(0, 0);
		this.raio = r;
		this.area = Math.PI*Math.pow(r,2);
		this.perimetro = Math.PI*2*r;
	}
	
	public Circulo(double r, double x, double y){
		this.centro = new Ponto(x, y);
		this.raio = r;
		this.area = Math.PI*Math.pow(r,2);
		this.perimetro = Math.PI*2*r;
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
