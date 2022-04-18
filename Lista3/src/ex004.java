import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		/*
		 * (04) Escreva um algoritmo para ler 10 valores inteiros e positivos e: a)
		 * encontrar o maior valor; b) encontrar o menor valor; c) calcular a média dos
		 * números lidos.
		 */

		Scanner leitor = new Scanner(System.in);

		float numero, maiorValor = 0, menorValor = 999, somaNumeros = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.print("Informe um valor: ");
			numero = leitor.nextInt();

			if (numero > maiorValor)
				maiorValor = numero;

			if (numero < menorValor)
				menorValor = numero;

			somaNumeros += i;

		}

		leitor.close();

		float mediaNumeros = somaNumeros / 10;

		System.out.println("\nMaior valor: " + Math.round(maiorValor));
		System.out.println("Menor valor: " + Math.round(menorValor));
		System.out.println("Média dos números lidos: " + mediaNumeros);
	}

}
