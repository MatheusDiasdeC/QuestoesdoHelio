package q4;

import static org.junit.Assert.*;

import org.junit.Test;

import q8.Conta;


public class ClassedeTeste {

	@Test
	public void test() {
		Conta c1 = new Conta();
		    c1.titular = "Hugo";
		    c1.saldo = 100;
		Conta c2 = new Conta();
		    c2 = c1;

	    if (c1 == c2) {
	        System.out.println("iguais");
	    } else {
	        System.out.println("diferentes");       
	    }
//Ao declarar que c2=c1, cria-se dois ponteiros que apontam para o mesmo endereço de memória, portanto, o "if" os acusa de ser iguais
	}

}
