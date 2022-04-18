import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		/*
		 * (04) Escreva um algoritmo para ler a idade de uma pessoa expressa em dias e
		 * mostre-a expressa em anos, meses e dias (considerar o ano com 365 dias e o
		 * mês com 30 dias).
		 */
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe os dias: ");
		int dias = leitor.nextInt();

		leitor.close();

		int idadeAnos = dias / 365;
		dias = dias % 365;

		int idadeMeses = dias / 30;

		dias = dias % 30;

		int idadeDias = dias;

		System.out.println("A idade em Anos é: " + idadeAnos);
		System.out.println("Meses: " + idadeMeses);
		System.out.println("Dias: " + idadeDias);

	}

}
