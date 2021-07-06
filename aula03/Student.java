package aula03;
import aula01.Date;
import aula01.Person;

public class Student extends Person {
	
	private int numMec;
	private Date insc;
	private final String type = "Student";
	
	public Student(String name, int cc, Date birth) {
		super(name, cc, birth);
	}
	
	public Student(String name, int cc, Date birth, int numMec, Date insc) {
		super(name, cc, birth);
		this.numMec = numMec;
		this.insc = insc;
	}
	
	public Student(String name, int cc, Date birth, int numMec) {
		super(name, cc, birth);
		int[] d = Date.getCurrentDate();
		this.numMec = numMec;
		this.insc = new Date(d[0], d[1], d[2]);
	}
	
	public int nMec() {
		return this.numMec;
	}
	
	public String nMecToString() {
		return this.numMec + "";
	}
	
	public Date insc() {
		return this.insc;
	}
	
	public String getType() {
		return this.type;
	}


}
