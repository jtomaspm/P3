package aula04;
import aula01.Date;
import aula01.Person;
public class Professor extends Person {
	
	private int nfunc;
	private Date dataAdmissao;
	private final String type = "Professor";
	
	public Professor(String name, int cc, Date birth, int nfunc, Date dataAdmissao) {
		super(name, cc, birth);
		this.nfunc = nfunc;
		this.dataAdmissao = dataAdmissao;
	}
	
	public Professor(String name, int cc, Date birth) {
		super(name, cc, birth);
	}

	public int getNfunc() {
		return this.nfunc;
	}

	public void setNfunc(int nfunc) {
		this.nfunc = nfunc;
	}

	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getType() {
		return this.type;
	}

}
