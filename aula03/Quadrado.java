package aula03;

public class Quadrado extends Figura{
	private double l;
	
	public Quadrado(double l, Ponto c){
		super(c);
		this.l = l;
		
	}
	
	public Quadrado(double l, double x, double y){
		super(new Ponto(x, y));
		this.l = l;
	}
	
	public Quadrado(double l){
		super();
		this.l = l;
		
	}
	
	public double area () {
		return	Math.pow(this.l,2);
	}
	
	public double perimeter () {
		return this.l*4;
 	}
	
	public String toString(){
		return "Lado: " + this.l + "\n" +
			   "Centro: " + this.centro.getCoords()[0] + "  " + this.centro.getCoords()[0] + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimetro: " + this.perimeter();	   
	}
}
