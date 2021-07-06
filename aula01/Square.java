package aula01;

public class Square{
	private double l;
	private Point c;
	
	public Square(double l, Point c){
		this.l = l;
		this.c = c;
	}
	
	public Square(double l, double x, double y){
		this.l = l;
		Point p = new Point(x, y);
		this.c = p;
	}
	
	public double area () {
		return	Math.pow(this.l,2);
	}
	
	public double perimeter () {
		return this.l*4;
 	}
	
	public String toString(){
		return "Lado: " + this.l + "\n" +
			   "Centro: " + this.c.getCoords()[0] + "  " + this.c.getCoords()[0] + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimetro: " + this.perimeter();	   
	}
}
