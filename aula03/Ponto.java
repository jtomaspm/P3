package aula03;

public class Ponto{
	private double x,y;
	
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double[] getCoords(){
		double[] c = new double[2];
		c[0] = this.x;
		c[1] = this.y;
		return c;
	}
	
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
