package aula04;

import java.util.LinkedList;

import aula03.Figura;
import aula03.Ponto;

public class ColecaoFiguras {
	
	private double maxArea;
	private double currentArea;
	private LinkedList<Figura> colecao;
	
	public ColecaoFiguras(double maxArea)  {
		this.maxArea = maxArea;
		this.currentArea  = 0;
		this.colecao = new LinkedList<Figura>();
	}

	public double getMaxArea() {
		return this.maxArea;
	}

	public void setMaxArea(double maxArea) {
		this.maxArea = maxArea;
	}
	
	public boolean addFigura(Figura f) {
		if (f.area() < (maxArea-currentArea)) {
			currentArea += f.area();
			return this.colecao.add(f);
		}
		return false;
	}
	
	public boolean delFigura(Figura f) {
		return this.colecao.remove(f);
	}
	
	public double areaTotal() {
		return this.currentArea;
	}
	
	public boolean exists(Figura f) {
		return this.colecao.contains(f);
	}
	
	public String toString() {
		return this.maxArea + "\n" +
			   this.currentArea  + "\n" +
			   this.colecao;
	}
	
	public LinkedList<Figura> getFiguras() {
		return this.colecao;
	}
	
	public LinkedList<Ponto> getCentros() {
		LinkedList<Ponto> centros = new LinkedList<Ponto>();
		for (Figura f : colecao) {
			centros.add(f.getCentro());
		}
		return centros;
	}

}
