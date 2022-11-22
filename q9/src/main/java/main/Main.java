package main;

import q9.Conta;
import q9.Data;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setTitular("Nome");
		c.setDataDeAbertura(new Data(3, 4, 5));		
		Conta c2 = new Conta("Mariano");
		//c.getMessage();
		c2.saca(-3);
	};

}

/*Questão 1 - Colocando o atributo como
private se certifica que ele não seja
acessado por outras classes. */

/*Questão 2 - Não é possível modificar atributos
privados edita-los em sua classe. */

/* Questão 7 - ao criar o contrutor com um parâmetro
 "CPF", dento dele devesse criar um if cuja condição
 de existencia seja um Cpf válido. */

/* Desafio 1 - O método main apenas recebe valores estáticos
 * e x nesse contexto é uma variável dinâmica. */
 
/*Desafio 2 - usando um singleton é possível criar uma variável
 * estática e uma intância única. */

/*Desafio 1 - A sua aplicação fica sem recursos para continuar
sua execução interrompendo, abruptamente, sua execução. */