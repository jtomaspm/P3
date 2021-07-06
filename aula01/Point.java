package aula01;

class Point{
	private double x,y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double[] getCoords(){
		double[] c = new double[2];
		c[0] = this.x;
		c[1] = this.y;
		return c;
	}
}

