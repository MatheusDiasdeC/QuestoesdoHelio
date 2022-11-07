package q3;

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

	public void retornaDadosParaImpressao() {
		System.out.println("Agencia: " + agencia + "\nTitular: " + titular + "\nNumero da Conta" + numero + "\nSaldo: " + saldo );
	}
	
	public Conta() {};
}