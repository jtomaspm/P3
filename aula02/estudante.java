package aula02;

public class estudante extends cliente {
	
	 
	int nrMec; 
	String curso;
	
	public estudante(int nrSocio, data dataIns, String nome, int nrCC, data dataNas, int nrMec, String curso) {
		super(nrSocio, dataIns, nome, nrCC, dataNas);
		this.nrMec = nrMec;
		this.curso = curso;
		videoclube.setCliente(this);
	}
	

}
