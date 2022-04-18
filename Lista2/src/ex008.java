import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o código de um aluno e suas três notas. Calcule
		// a média ponderada do aluno, considerando que o peso para a maior nota seja 4
		// e para as duas restantes, 3. Mostre o código do aluno, suas três notas, a
		// média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 7 e
		// "REPROVADO" se a média for menor que 7

		float n1, n2, n3, media;
		int peso1 = 4, peso2 = 3, peso3 = 3;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a 1º nota: ");
		n1 = leitor.nextInt();
		System.out.print("Informe a 2º nota: ");
		n2 = leitor.nextInt();
		System.out.print("Informe a 3º nota: ");
		n3 = leitor.nextInt();

		leitor.close();

		if (n1 > n2 || n1 > n3)
			media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / 10;
		else {
			if (n2 > n1 || n2 > n3)
				media = ((n2 * peso1) + (n1 * peso2) + (n3 * peso3)) / 10;
			else
				media = ((n3 * peso1) + (n2 * peso2) + (n1 * peso3)) / 10;
		}
		
		String resultado = (media >= 7) ? "\nO aluno foi APROVADO! " + media : "\nO aluno foi REPROVADO! " + media;
		System.out.println(resultado);
	}

}
