package aula01;

public class Rectangle{
	private double l;
	private double c;
	private Point center;
	
	public Rectangle(double l, double c, Point center){
		this.l = l;
		this.c = c;
		this.center = center;
	}
	
	public Rectangle(double l, double c, double x, double y){
		this.l = l;
		this.c = c;
		Point center = new Point(x, y);
		this.center = center;
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
			   "Centro: " + this.center.getCoords()[0] + "  " + this.center.getCoords()[0] + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimetro: " + this.perimeter();	   
	}
}

