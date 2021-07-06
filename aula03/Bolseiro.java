package aula03;
import aula01.Date;
import aula01.Person;

public class Bolseiro extends Person {
	
	private int numMec;
	private Date insc;
	private int bolsa;
	private final String type = "Bolseiro";
	
	public Bolseiro(String name, int cc, Date birth) {
		super(name, cc, birth);
	}
	
	public Bolseiro(String name, int cc, Date birth, int numMec, Date insc) {
		super(name, cc, birth);
		this.numMec = numMec;
		this.insc = insc;
		this.bolsa = 0;
	}
	
	public Bolseiro(String name, int cc, Date birth, int numMec) {
		super(name, cc, birth);
		int[] d = Date.getCurrentDate();
		this.numMec = numMec;
		this.insc = new Date(d[0], d[1], d[2]);
		this.bolsa = 0;
	}
	
	public Bolseiro(String name, int cc, Date birth, int numMec, Date insc, int bolsa) {
		super(name, cc, birth);
		this.numMec = numMec;
		this.insc = insc;
		this.bolsa = bolsa;
	}
	
	public Bolseiro(String name, int cc, Date birth, int numMec, int bolsa) {
		super(name, cc, birth);
		int[] d = Date.getCurrentDate();
		this.numMec = numMec;
		this.insc = new Date(d[0], d[1], d[2]);
		this.bolsa = bolsa;
	}
	
	public int nMec() {
		return this.numMec;
	}
	
	public Date insc() {
		return this.insc;
	}

	public int getBolsa() {
		return this.bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	public String getType() {
		return this.type;
	}

	


}