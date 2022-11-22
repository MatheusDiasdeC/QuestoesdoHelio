package q9;

public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	public int identificador = 0 ;
	
	public Conta() {
		identificador += 1;
	};
	public Conta(String titular) {
		identificador += 1;
	}
	
	
	public void saca(double valor) {
		//this.saldo -= valor;
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor idevido");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void deposita(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor idevido");
		}else {
			this.saldo += valor;
		}
	}
	
	public double getRendimento() {
		
		double valor = saldo * 0.1;
		return valor;
	}

	public void retornaDadosParaImpressao() {
		
		System.out.println("Agencia: " + this.agencia);
		System.out.println("\nTitular: " + this.titular);
		System.out.println("\nNumero da Conta"+ this.numero);
		System.out.println("\nSaldo: " + this.saldo );
		System.out.println("\nData de Abertura: " + this.dataDeAbertura.dia + "/" + this.dataDeAbertura.mes + "/" + this.dataDeAbertura.ano);
		//Aqui
	}

	
	public String getTitular() {
		return titular;
		}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		 return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		}
	
	public Data getDataDeAbertura() {
		return dataDeAbertura;
	};
	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	};

	public int getIdentificador() {
		return identificador;
	}
	}
