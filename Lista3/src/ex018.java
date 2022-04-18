import java.util.Scanner;

public class ex018 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler um número não determinado de valores para m,
		// todos inteiros e positivos. Se m for par, verificar quantos divisores possui
		// e escrever esta informação. Se m for ímpar e menor do que 10 calcular e
		// escrever o fatorial de m. Se m for ímpar e maior ou igual a 10 calcular e
		// escrever a soma dos inteiros de 1 até m.

		int m, divisores, soma, fatorial;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o número: ");
		m = leitor.nextInt();

		// divisão par
		if (m > 0 && m % 2 == 0) {
			divisores = 0;

			for (int i = 1; i <= m; i++) {

				if (m % i == 0) {
					divisores = divisores + 1;
					System.out.println("os diviores são :  " + i);
				}
			}
			System.out.println("é par");
			System.out.println("o numero de divisores é: " + divisores);
			leitor.close();
		}

		// fatorial impar

		if (m % 2 != 0 && m < 10) {
			fatorial = m;

			for (int i = m - 1; i > 1; i--) {
				fatorial *= i;
			}
			System.out.println("o numero de fatoriais é " + fatorial);
		}

		// soma dos antecessores
		if (m % 2 != 0 && m >= 10) {
			soma = 0;

			for (int i = m - 1; i >= 1; i--) {
				soma += i;
			}
			System.out.println("a soma é " + soma);
		}
	}

}
