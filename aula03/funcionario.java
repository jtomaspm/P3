package aula03;


public class funcionario extends cliente {
	
	int nrFun; 
	int nrFis;
	
	public funcionario(int nrSocio, data dataIns, String nome, int nrCC, data dataNas, int nrFun, int nrFis) {
		super(nrSocio, dataIns, nome, nrCC, dataNas);
		this.nrFun = nrFun;
		this.nrFis = nrFis;
		videoclube.setCliente(this);
	}
	
}
