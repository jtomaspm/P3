package aula03;

public class Ligeiro extends Veiculo {
	
	private final int maxPeso = 3500;
	private final int maxLot = 9;
	private final String carta = "B";
	
	public Ligeiro(int cilindrada, int potencia, int lotacao, int pesoBruto) {
		super(cilindrada, potencia, lotacao, pesoBruto);
		if(checkPeso(pesoBruto) || checkLot(lotacao)) {
			System.out.println("Error:\nmax peso bruto= 3500kg & max lotacao = 9 pessoas");
		}
	}
	
	public boolean checkPeso(int p) {
		return p <= maxPeso;
	}
	
	public boolean checkLot(int p) {
		return p <= maxLot;
	}
}
