package aula03;

public class Circulo extends Figura{
	private double r;
	
	public Circulo(double r){
		super();
		this.r = r;
	}
	
	public Circulo(Ponto centro, double r){
		super(centro);
		this.r = r;
	}
	
	public Circulo(double r, double x, double y){
		super(new Ponto(x, y));
		this.r = r;
	}
	
	public double area () {
		return	Math.PI*Math.pow(this.r,2);
	}
	
	public double perimeter () {
		return Math.PI*2*this.r;
 	}
	
	public String toString(){
		return "Raio: " + this.r + "\n" +
			   "Centro: " + this.centro.getCoords()[0] + "  " + this.centro.getCoords()[1] + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimetro: " + this.perimeter();	   
	}
	
	public boolean compareTo (Circulo c) {
		if (this.r == c.r) {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean interception (Circulo c) {
		double dist = Math.sqrt(Math.pow(this.centro.getCoords()[0] - c.centro.getCoords()[0], 2)+Math.pow(this.centro.getCoords()[1] - c.centro.getCoords()[1], 2));
		double rT = this.r + c.r;
		if(dist > rT){
			return false;
		}else{
			return true;
		}
	}	
}


