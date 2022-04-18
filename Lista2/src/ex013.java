import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		// (13) Escreva um algoritmo para ler um valor em reais e calcular qual o menor
		// número possível de notas de 100, 50, 10, 5 e 1 em que o valor lido pode ser
		// decomposto. Escrever o valor lido e a relação de notas necessárias.

		Scanner leitor = new Scanner(System.in);

		int v100, v50, v20, v10, v5, v2, v1, valor;

		System.out.print("Informe o valor em R$: ");
		valor = leitor.nextInt();
		
		leitor.close();

		v100 = valor / 100;
		valor = valor - v100 * 100;

		v50 = valor / 50;
		valor = valor - v50 * 50;

		v20 = valor / 20;
		valor = valor - v20 * 20;

		v10 = valor / 10;
		valor = valor - v10 * 10;

		v5 = valor / 5;
		valor = valor - v5 * 5;

		v2 = valor / 2;
		valor = valor - v2 * 2;

		v1 = valor;

		System.out.println();
		
		System.out.println("O número de notas de 100 é: " + v100);
		System.out.println("O número de notas de 50 é: " + v50);
		System.out.println("O número de notas de 20 é: " + v20);
		System.out.println("O número de notas de 10 é: " + v10);
		System.out.println("O número de notas de 5 é: " + v5);
		System.out.println("O número de notas de 2 é: " + v2);
		System.out.println("O número de notas de 1 é: " + v1);
	}

}
