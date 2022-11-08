package main;

import q9.Conta;
import q9.Data;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.titular = "Nome";
		
		c.dataDeAbertura = new Data();
		c.dataDeAbertura.definirData(4,5,6);
		c.retornaDadosParaImpressao();
		
	}

}
