package q7;

public class Conta {
	
	public String titular;
	public int numero;
	public String agencia;
	public double saldo;
	public Data dataDeAbertura;
	
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
		
		System.out.println("Agencia: " + this.agencia);
		System.out.println("\nTitular: " + this.titular);
		System.out.println("\nNumero da Conta"+ this.numero);
		System.out.println("\nSaldo: " + this.saldo );
		System.out.println("\nData de Abertura: " + this.dataDeAbertura.dia + "/" + this.dataDeAbertura.mes + "/" + this.dataDeAbertura.ano);
	
	}
	/*public String retornaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
        // imprimir aqui os outros atributos...

        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMês: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        return dados;
    }*/
	
	public Conta() {};
}
