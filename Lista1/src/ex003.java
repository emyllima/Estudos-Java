import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// (03) Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média
		// final (média ponderada; o peso das notas é: 2, 3 e 5, respectivamente).

		Scanner leitor = new Scanner(System.in);

		int peso1 = 2, peso2 = 3, peso3 = 5;

		System.out.print("Informe a 1º nota: ");
		int nota1 = leitor.nextInt();
		System.out.print("Informe a 2º nota: ");
		int nota2 = leitor.nextInt();
		System.out.print("Informe a 3º nota: ");
		int nota3 = leitor.nextInt();

		leitor.close();

		int mediaFinal = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 10;

		System.out.println("\nA média final é: " + mediaFinal);

	}

}
