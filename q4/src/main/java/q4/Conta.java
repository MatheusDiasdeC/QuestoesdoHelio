package q4;

public class Conta {
	
	public String titular;
	public int numero;
	public String agencia;
	public double saldo;
	public String dataAbertura;
	
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
