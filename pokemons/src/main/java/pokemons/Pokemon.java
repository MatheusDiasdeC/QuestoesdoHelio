package pokemons;

public class Pokemon {

		Integer numero;
		String nome;
		Integer ataque;
		Integer defesa;
		Integer saude;
		Integer ataqueEspecial;
		Integer defesaEspecial;
		Integer velocidade;
		String genero;
		String golpe1;
		String golpe2;
		String golpe3;
		String golpe4;
		
		public void golpear(Integer golpe) {
			if (golpe == 1) System.out.println("Golpe: " + golpe1);
			if (golpe == 2) System.out.println("Golpe: " + golpe2);
			if (golpe == 3) System.out.println("Golpe: " + golpe3);
			if (golpe == 4) System.out.println("Golpe: " + golpe4);
		}
		
		public void restaurarVida() {
			System.out.println("Vida Restaurada");
		};
		public void defender() {
			System.out.println("Defendido");
		};
}
