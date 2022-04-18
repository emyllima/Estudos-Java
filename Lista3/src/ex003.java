import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		/*
		 * (03) Escreva um algoritmo para ler vários números inteiros e positivos e
		 * calcular o produtório dos números pares. O fim da leitura será indicado pelo
		 * número 0.
		 */

		Scanner leitor = new Scanner(System.in);

		long numero = 1, produto = 1;
		int cont = 0;
		
		while (numero > 0) {
			System.out.print("Digite o número: ");
			numero = leitor.nextInt();

			for (int i = 1; i <= numero; i++) {
				if (i % 2 == 0)
					produto *= i;
			}
			System.out.print("Produto: " + produto + "\n\n");
			cont++;
		}

		if (numero <= 0)
			System.out.println("Valor não permitido! Apenas números inteiros e positivos");

		leitor.close();

	}
}
