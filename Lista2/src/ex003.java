import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// (03) Escreva um algoritmo para ler um número inteiro e mostre uma mensagem
		// indicando se este número é par ou ímpar, e se é positivo ou negativo.

		int num;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o número: ");
		num = leitor.nextInt();
		
		leitor.close();
		
		String parOuImpar = (num % 2 == 0) ? "\nO número é par" : "\nO número é ímpar";
		System.out.println(parOuImpar);
		
		String positivoOuNegativo = (num > 0) ? "O número é positivo" : "O número é negativo";
		System.out.println(positivoOuNegativo);
	}

}
