
public class ex010 {

	public static void main(String[] args) {
		// Escreva um algoritmo para gerar e escrever os 5 primeiros números perfeitos.
		// Um número perfeito é aquele que é igual a soma dos seus divisores (6 = 1+2+3
		// e 28= 1+2+4+7+14).

		// (10) Escreva um algoritmo para gerar e escrever os 5 primeiros números
		// perfeitos. Um número perfeito é aquele que é igual a soma dos seus
		// divisores (6 = 1+2+3 e 28= 1+2+4+7+14).

		byte quantidadePerfeitos = 0;
		int somaDivisores;
		int numero = 1;

		while (quantidadePerfeitos <= 5) {
			somaDivisores = 0;

			for (int i = 1; i < numero; i++) {
				if (numero % i == 0)
					somaDivisores += i;
			}

			if (somaDivisores == numero) {
				quantidadePerfeitos++;
				System.out.println(numero);
			}

			numero++;
		}

	}

}
