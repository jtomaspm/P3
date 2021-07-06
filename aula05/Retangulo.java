package aula05;

import aula03.Ponto;

public class Retangulo extends Figura{
	
	private Ponto centro;
	private double area;
	private double perimetro;
	private double largura, comprimento;
	
	
	
	public Retangulo(Ponto centro, double c, double l) {
		this.centro = centro;
		this.largura = l;
		this.comprimento = c;
		this.area = l*c;
		this.perimetro = ((l*2)+(c*2));
	}
	
	public Retangulo(double l, double c){
		this.centro = new Ponto(0, 0);
		this.largura = l;
		this.comprimento = c;
		this.area = l*c;
		this.perimetro = ((l*2)+(c*2));
	}
	
	public Retangulo(double l, double c, double x, double y){
		this.centro = new Ponto(x, y);
		this.largura = l;
		this.comprimento = c;
		this.area = l*c;
		this.perimetro = ((l*2)+(c*2));
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