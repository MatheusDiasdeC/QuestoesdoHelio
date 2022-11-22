package q9;

public class Data {

		int dia;
		int mes;
		int ano;
		
		
		
public void definirData() {
	if (dia > 31) {
		System.out.println("Data inválida");
	}
	if (mes > 12) {
		System.out.println("Data inválida");
	}

};

public Data (int dia, int mes, int ano) {
	if (dia > 31) {
		System.out.println("Data inválida");
	}
	if (mes > 12) {
		System.out.println("Data inválida");
	}

}; 

public void definirData(int dia, int mes, int ano) {
	 
	 this.dia = dia;
	 this.mes = mes;
	 this.ano = ano;
 }
 
}