package aula01;

public class Person {
	
	private String name;
	private int cc;
	private Date date;
	
	public Person(String name, int cc, Date date) {
		//if(valid(name, cc)) {
			this.name = name;
			this.cc = cc;
			this.date = date;
		//}
	}
	
	private boolean valid(String name, int cc) {
			String ccS = String.valueOf(cc);
			boolean ccV = false;
			boolean nameV = true;
			if(ccS.length()==8) {
				ccV = true;
			}else {
				System.out.print("invalid cc \n");
			}
			for(char c : name.toCharArray()) {
				if(!(Character.isLetter(c) || Character.isWhitespace(c))) {
					nameV = false;
					System.out.print("invalid name > " + c +"\n" );
				}
			}
		if(ccV && nameV)
			return true;
		else
			return false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String nome() {
		return this.name;
	}
	
	public int getCC() {
		return this.cc;
	}


	@Override
	public String toString () {
		String name = this.name;
		int cc = this.cc;
		String date = this.date.getDate();
		return "Name: " + name + "\n CC: " + cc + "\n Nascimento: " + date + "\n";
	}

	public String getType() {
		return "not defined";
	}

	public String nMecToString() {
		return "not defined";
	}

}
