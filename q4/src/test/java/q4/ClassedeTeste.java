package q4;

import static org.junit.Assert.*;

import org.junit.Test;


public class ClassedeTeste {

	@Test
	public void test() {
		Conta c1 = new Conta();
		c1.titular = "Danilo";
	    c1.saldo = 100;

	    Conta c2 = new Conta();     
	    c2.titular = "Danilo";
	    c2.saldo = 100;

	    if (c1 == c2) {
	        System.out.println("iguais");
	    } else {
	        System.out.println("diferentes");       
	    }
	}

}
