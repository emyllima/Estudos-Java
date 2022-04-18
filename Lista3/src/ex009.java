import java.util.Scanner;

public class ex009 {

	public static void main(String[] args) {
		// (09) Escreva um algoritmo para ler um um valor N inteiro e positivo e
		// calcular o valor de E:

		// E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o limite: ");
		int limite = leitor.nextInt();

		double e = 1;
		double fat = 1;

		for (int i = 1; i <= limite; i++) {
			fat = 1;

			for (int j = i; j > 1; j--)
				fat *= j;
			
			e = e + 1 / (double) fat;
		}

		System.out.println("O valor foi de: " + e);

		leitor.close();

	}

}
