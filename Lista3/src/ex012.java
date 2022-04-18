import java.util.Scanner;

public class ex012 {

	public static void main(String[] args) {
		/*
		 * (12) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes.
		 * Escreva um algoritmo para ler o salário e número de filhos dos habitantes e
		 * escrever:
		 * 
		 * a) média do salário da população;
		 * 
		 * b) média do número de filhos;
		 * 
		 * c) maior salário;
		 * 
		 * d) percentual de pessoas com salário até R$ 100,00.
		 * 
		 * O final da leitura de dados dar-se-á com a entrada de um salário negativo.
		 */

		Scanner leitor = new Scanner(System.in);

		float totSalario = 0, maiorSalario = 0, percSalario = 0, x = 0, salario;
		int totHabFilhos = 0, filhos;

		System.out.print("Informe a quantidade da população da cidade: ");
		int quantPopulacao = leitor.nextInt();

		System.out.println();

		for (int i = 1; i <= quantPopulacao; i++) {

			System.out.print("Informe o salário dos habitantes: ");
			salario = leitor.nextFloat();

			System.out.print("Informe a quantidade de filhos dos habitantes: ");
			filhos = leitor.nextInt();

			System.out.println();

			totSalario += salario;
			totHabFilhos += filhos;

			if (maiorSalario < salario) {
				maiorSalario = salario;
			}

			if (salario <= 100) {
				x++;
				percSalario = (x * 100) / quantPopulacao;
			}

		}

		float mediaSalario = totSalario / quantPopulacao;

		int mediaQuantFilhos = totHabFilhos / quantPopulacao;

		System.out.println("Média do salário da população: " + mediaSalario + " R$");
		System.out.println("Média do número de filhos: " + mediaQuantFilhos);
		System.out.println("Maior salário: " + maiorSalario + " R$");
		System.out.println("Percentual de pessoas com salário até R$ 100,00: " + percSalario + " %");

		leitor.close();

	}

}
