package aula03;

public class Rectangulo extends Figura{
	private double l;
	private double c;
	
	public Rectangulo(double l, double c){
		super();
		this.l = l;
		this.c = c;
	}
	
	public Rectangulo(double l, double c, Ponto center){
		super(center);
		this.l = l;
		this.c = c;
	}
	
	public Rectangulo(double l, double c, double x, double y){
		super(new Ponto(x, y));
		this.l = l;
		this.c = c;
	}
	
	public double area () {
		return	this.c*this.l;
	}
	
	public double perimeter () {
		return this.l*2 + this.c*2;
 	}
	
	public String toString(){
		return "Largura: " + this.l + "\n" +
			   "Comprimento: " + this.c + "\n" +
			   "Centro: " + this.centro.getCoords()[0] + "  " + this.centro.getCoords()[0] + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimetro: " + this.perimeter();	   
	}
}
