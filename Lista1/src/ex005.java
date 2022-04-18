import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		/*
		 * (05) Escreva um algoritmo para ler a idade de uma pessoa expressa em anos,
		 * meses e dias e mostre-a expressa apenas em dias (considerar o ano com 365
		 * dias e o mês com 30 dias).
		 */

		Scanner leitor = new Scanner(System.in);

		int diasTotal = 0;

		System.out.print("Informe os anos: ");
		int idadeAnos = leitor.nextInt();
		System.out.print("Informe os meses: ");
		int idadeMeses = leitor.nextInt();
		System.out.print("Informe os dias: ");
		int idadeDias = leitor.nextInt();

		leitor.close();

		diasTotal = diasTotal + idadeAnos * 365;
		diasTotal = diasTotal + (idadeMeses * 30);
		diasTotal = diasTotal + idadeDias;

		System.out.println("Informe os anos: " + diasTotal);

	}

}
