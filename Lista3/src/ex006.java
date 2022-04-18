import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// (06) Escreva um algoritmo para ler um número inteiro e positivo e calcular o seu fatorial.

		Scanner leitor = new Scanner(System.in);

		int fatorial = 1, numero, i;

		System.out.print("Informe um valor: ");
		numero = leitor.nextInt();

		leitor.close();

		if (numero > 0) {
			for (i = 1; i <= numero; i++)
				fatorial *= i;
			System.out.println("O fatorial é: " + fatorial);
		}

	}

}
