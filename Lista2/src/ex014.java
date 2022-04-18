import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler o número de identificação, as três notas
		 * obtidas por um aluno e a média dos exercícios que fazem parte da avaliação.
		 * Calcular a média de aproveitamento, usando a fórmula:
		 * 
		 * MA = (Nota1 + Nota2 x 2 + Nota3 x 3 + ME ) / 7
		 * 
		 * A atribuição de conceitos obedece a tabela abaixo:
		 * 
		 * MA Conceito
		 * 
		 * 9,0 A
		 * 
		 * 7,5 e < 9,0 B
		 * 
		 * 6,0 e < 7,5 C
		 * 
		 * 4,0 e < 6,0 D
		 * 
		 * < 4,0 E
		 * 
		 * O algoritmo deve escrever o número do aluno, suas notas, a média dos
		 * exercícios, a média de aproveitamento, o conceito correspondente e a
		 * mensagem: APROVADO se o conceito for A, B ou C e REPROVADO se o conceito for
		 * D ou E.
		 * 
		 */

		Scanner leitor = new Scanner(System.in);

		int id, n1, n2, n3, medEx, mediaAp;
		char conceito;

		System.out.print("Informe o código do aluno: ");
		id = leitor.nextInt();
		System.out.print("Informe a 1º nota do aluno: ");
		n1 = leitor.nextInt();
		System.out.print("Informe a 2º nota do aluno: ");
		n2 = leitor.nextInt();
		System.out.print("Informe a 3º nota do aluno: ");
		n3 = leitor.nextInt();

		leitor.close();

		medEx = (n1 + n2 + n3) / 3;
		mediaAp = (n1 + (n2 * 2) + (n3 * 3) + medEx) / 7;

		System.out.println();

		if (mediaAp >= 9) {
			conceito = 'A';
			System.out.println("O código do aluno é: " + id);
			System.out.println("A média de exercícios: " + medEx);
			System.out.println("As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3
					+ "\nA média de Aproveitamento é: " + conceito + " \n" + "O Aluno está aprovado!");
		} else if (mediaAp >= 7.5) {
			conceito = 'B';
			System.out.println("O código do aluno é: " + id);
			System.out.println("A média de exercícios: " + medEx);
			System.out.println("As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3
					+ "\nA média de Aproveitamento é: " + conceito + " \n" + "O Aluno está aprovado!");
		} else if (mediaAp >= 6) {
			conceito = 'C';
			System.out.println("O código do aluno é: " + id);
			System.out.println("A média de exercícios: " + medEx);
			System.out.println("As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3
					+ "\nA média de Aproveitamento é: " + conceito + " \n" + "O Aluno está aprovado!");
		} else if (mediaAp >= 4) {
			conceito = 'D';
			System.out.println("O código do aluno é: " + id);
			System.out.println("A média de exercícios: " + medEx);
			System.out.println("As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3
					+ "\nA média de Aproveitamento é: " + conceito + " \n" + "O Aluno está reprovado!");
		} else if (mediaAp < 4 || mediaAp >= 0) {
			conceito = 'E';
			System.out.println("O código do aluno é: " + id);
			System.out.println("A média de exercícios: " + medEx);
			System.out.println("As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3
					+ "\nA média de Aproveitamento é: " + conceito + " \n" + "O Aluno está reprovado!");
		}
	}
}
