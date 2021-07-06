package aula03;

public class Veiculo {
	
	private int cilindrada;
	private int potencia;
	private int lotacao;
	private int pesoBruto;
	
	public Veiculo(int cilindrada, int potencia, int lotacao, int pesoBruto) {
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.lotacao = lotacao;
		this.pesoBruto = pesoBruto;
	}

	public int getCilindrada() {
		return this.cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getLotacao() {
		return this.lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

	public int getPesoBruto() {
		return this.pesoBruto;
	}

	public void setPesoBruto(int pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

}
