package aula01;

public class Circle{
	private double r;
	private Point c;
	
	public Circle(double r, Point c){
		this.r = r;
		this.c = c;
	}
	
	public Circle(double x, double y, double r) {
		this.r = r;
		Point c = new Point(x, y);
		this.c = c;
	}
	
	public double area () {
		return	Math.PI*Math.pow(this.r,2);
	}
	
	public double perimeter () {
		return Math.PI*2*this.r;
 	}
	
	public String toString(){
		return "Raio: " + this.r + "\n" +
			   "Centro: " + this.c.getCoords()[0] + "  " + this.c.getCoords()[1] + "\n" +
			   "Area: " + this.area() + "\n" +
			   "Perimetro: " + this.perimeter();	   
	}
	
	public boolean compareTo (Circle c) {
		if (this.r == c.r) {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean interception (Circle c) {
		double dist = Math.sqrt(Math.pow(this.c.getCoords()[0] - c.c.getCoords()[0], 2)+Math.pow(this.c.getCoords()[1] - c.c.getCoords()[1], 2));
		double rT = this.r + c.r;
		if(dist > rT){
			return false;
		}else{
			return true;
		}
	}	
}

