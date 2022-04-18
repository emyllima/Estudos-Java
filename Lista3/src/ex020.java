import java.util.Scanner;

public class ex020 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler um valor n inteiro e positivo e calcular a
		 * seguinte soma:
		 * 
		 * S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
		 * 
		 * O algoritmo deve escrever cada termo gerado e o valor final de S.
		 */

		Scanner leitor = new Scanner(System.in);
		float soma = 0;

		System.out.println("Digite um numero inteiro: ");
		int n = leitor.nextInt();

		for (int i = 1; i < n; i++) {
			soma = (soma + 1) / n;
			i = i + 1;
		}
		
		System.out.println(soma);

		leitor.close();

	}

}
