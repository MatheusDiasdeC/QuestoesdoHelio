package conta;

public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataAbertura;
	
	public void saca(int valor) {
		this.saldo -= valor;
	}
	
	public void deposita(int valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento() {
		
		double valor = saldo * 0.1;
		return valor;
	}
}
