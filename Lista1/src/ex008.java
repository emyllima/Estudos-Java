import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		/*
		 * (08) Escreva um algoritmo para ler o número total de eleitores de um
		 * município, o número de votos brancos, nulos e válidos. Calcular e escrever o
		 * percentual que cada um representa em relação ao total de eleitores.
		 */

		Scanner leitor = new Scanner(System.in);

		int percVotosBranco = 0, percVotosNulo = 0, percVotosValido = 0;

		System.out.print("Informe o número total de eleitores: ");
		int eleitoresTotal = leitor.nextInt();
		System.out.print("Informe o número de votos em branco: ");
		int votosBrancos = leitor.nextInt();
		System.out.print("Informe o número de votos nulos: ");
		int votosNulos = leitor.nextInt();
		System.out.print("Informe o número de votos válidos: ");
		int votosValidos = leitor.nextInt();

		leitor.close();

		percVotosBranco = votosBrancos * 100 / eleitoresTotal;
		percVotosNulo = votosNulos * 100 / eleitoresTotal;
		percVotosValido = votosValidos * 100 / eleitoresTotal;

		System.out.print("A porcentagem de votos em branco é: " + percVotosBranco);
		System.out.print("\nA porcentagem de votos em nulo é: " + percVotosNulo);
		System.out.print("\nA porcentagem de votos válidos é: " + percVotosValido);

	}

}
