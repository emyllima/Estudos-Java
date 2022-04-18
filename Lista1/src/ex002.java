import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// (02) Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média
		// final (média aritmética).

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a 1º nota: ");
		int nota1 = leitor.nextByte();
		System.out.print("Informe a 2º nota: ");
		int nota2 = leitor.nextByte();
		System.out.print("Informe a 3º nota: ");
		int nota3 = leitor.nextByte();

		leitor.close();

		int mediaFinal = (nota1 + nota2 + nota3) / 3;

		System.out.println("\nA média final é: " + mediaFinal);

	}

}
