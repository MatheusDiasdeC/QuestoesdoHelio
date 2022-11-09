package pokemons;

public class Main {
	public static void main(String[] args) {
		Pokemon bulbasauro = new Pokemon();
		bulbasauro.numero = 1;
		bulbasauro.nome = "Bulbasauro";
		bulbasauro.defesa = 10;
		bulbasauro.ataque = 10;
		bulbasauro.ataqueEspecial = 15;
		bulbasauro.defesaEspecial = 15;
		bulbasauro.genero = "F";
		bulbasauro.saude = 10;
		bulbasauro.velocidade = 10 ;
		bulbasauro.setGolpe1("Tacle");
		bulbasauro.setGolpe2("Growl");
		bulbasauro.setGolpe3("Leech Seed");
		bulbasauro.setGolpe4("Vine Whip");
		
		bulbasauro.getGolpe1();
		bulbasauro.getGolpe2();
		bulbasauro.getGolpe3();
		bulbasauro.getGolpe4();
	}
}
