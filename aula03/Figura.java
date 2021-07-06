package aula03;


public class Figura {
	
	Ponto centro;
	
	public Figura(Ponto centro) {
		this.centro = centro;
	}
	
	public Figura() {
		this.centro = new Ponto(0, 0);
	}
	
	public Ponto getCentro(){
		return this.centro;
	}
	
	public double area () {
		return 0;
	}

}
