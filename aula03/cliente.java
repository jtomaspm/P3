package aula03;

import java.util.LinkedList;

public class cliente {
	private int nrSocio;
	private data dataIns;
	private String nome; 
	private int nrCC;
	private data dataNas;
	private LinkedList<video> owenedV;
	private LinkedList<video> history;
	private int quota;
	
	
	
	public cliente(int nrSocio, data dataIns, String nome, int nrCC, data dataNas) {
		this.nrSocio = nrSocio;
		this.dataIns = dataIns;
		this.nome = nome;
		this.nrCC = nrCC;
		this.dataNas = dataNas;
		this.owenedV = new LinkedList<video>();
		this.history = new LinkedList<video>();
		this.quota = videoclube.getQuota();
	}
	public int getNrSocio() {
		return this.nrSocio;
	}
	public data getDataIns() {
		return this.dataIns;
	}
	public int[] getDataNas() {
		String[] date = this.dataNas.getDate().split("/");
		int[] r = new int[date.length];
		
		for (int i = 0; i < date.length; i++) {
			r[i] = Integer.parseInt(date[i]);
		}
		return r;
	}
	
	public int getAge() {
		int[] dA = data.getCurrentDate();
		int[] dN = this.getDataNas();
		
		if (dA[1] > dN[1]) {
			return dA[0]-dN[0];
		}else if(dA[1] < dN[1]) {
			return dA[0]-dN[0]-1;
		}else{
			if (dA[2] >= dN[2]) {
				return dA[0]-dN[0];
			}else {
				return dA[0]-dN[0]-1;
			}
		}
		
	}
	
	public LinkedList<video> getHistoy() {
		return this.history;
	}
	
	public void checkOut(video v) {
		if(this.quota > 0) {
			v.setAvalible(false);
			this.quota--;
			this.owenedV.add(v);
			this.history.add(v);
		}else {
			System.out.print("Can't rent more\n");
		}
	}
	public void checkIn(video v, double rating) {
		v.setAvalible(true);
		this.owenedV.remove(v);
		v.addRating(rating);
		this.quota++;
	}
}
