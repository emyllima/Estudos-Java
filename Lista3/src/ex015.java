import java.util.Scanner;

public class ex015 {

	public static void main(String[] args) {
		/*
		 * (15) Escreva um algoritmo para ler o código de um aluno e suas três notas.
		 * Calcule a média ponderada do aluno, considerando que o peso para a maior nota
		 * seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três
		 * notas, a média calculada e uma mensagem "APROVADO" se a média for maior ou
		 * igual a 5 e "REPROVADO" se a média for menor que 5. Repita a operação até que
		 * o código lido seja negativo.
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.print("Insira o código: ");
		float codigo = leitor.nextShort();
		System.out.print("Insira a 1º nota: ");
		float nota1 = leitor.nextShort();
		System.out.print("Insira a 2º nota: ");
		float nota2 = leitor.nextShort();
		System.out.print("Insira a 3º nota: ");
		float nota3 = leitor.nextShort();

		leitor.close();

		float maiorNota = 0, medianaNota = 0, menorNota = 0;

		if (nota1 > nota2 && nota1 > nota3 && nota2 > nota3) {
			maiorNota = nota1;
			medianaNota = nota2;
			menorNota = nota3;
		} else if (nota1 > nota2 && nota1 > nota3 && nota3 > nota2) {
			maiorNota = nota1;
			medianaNota = nota3;
			menorNota = nota2;
		} else if (nota2 > nota1 && nota2 > nota3 && nota1 > nota3) {
			maiorNota = nota2;
			medianaNota = nota1;
			menorNota = nota3;
		} else if (nota2 > nota1 && nota2 > nota3 && nota3 > nota1) {
			maiorNota = nota2;
			medianaNota = nota3;
			menorNota = nota1;
		} else if (nota3 > nota1 && nota3 > nota2 && nota1 > nota2) {
			maiorNota = nota3;
			medianaNota = nota1;
			menorNota = nota2;
		} else if (nota3 > nota1 && nota3 > nota2 && nota2 > nota1) {
			maiorNota = nota3;
			medianaNota = nota2;
			menorNota = nota1;
		} else {
			System.out.println("Inválido!");
		}

		float mediaPonderada = ((maiorNota * 4) + (medianaNota * 3) + (menorNota * 3)) / 10;

		if (mediaPonderada >= 5) {
			System.out.println("Código " + codigo);
			System.out.println("O aluno foi aprovado: " + mediaPonderada);
		} else {
			System.out.println("Código " + codigo);
			System.out.println("O aluno foi reprovado: " + mediaPonderada);
		}

	}

}
