import java.util.Scanner;

public class ex015 {

	public static void main(String[] args) {
		/*
		 * O departamento que controla o índice de poluição do meio ambiente mantém três
		 * grupos de indústrias que são altamente poluentes. O índice de poluição
		 * aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do
		 * primeiro grupo são intimadas a suspenderem suas atividades. Caso o índice
		 * cresce para 0,4 as empresas do primeiro e segundo grupo são intimadas a
		 * suspenderem suas atividades. Por fim, se o índice atingir 0,5 todos os três
		 * grupos devem ser notificados a paralisarem suas atividades. Escreva um
		 * algoritmo para ler o índice de poluição medido e emitir a notificação
		 * adequada aos diferentes grupos de empresas.
		 */

		Scanner leitor = new Scanner(System.in);
		float numero;

		System.out.print("Digite o índice de poluição: ");
		numero = leitor.nextFloat();
		
		leitor.close();

		System.out.println();
		
		if (numero >= 0) {
			if (numero >= 0 && numero <= 0.25)
				System.out.println("Índice de poluição aceitável.");
			if (numero >= 0.3)
				System.out.println("Suspender atividades das indústrias do 1° Grupo!");
			if (numero >= 0.4)
				System.out.println("Suspender atividades das indústrias do 2° Grupo!");
			if (numero >= 0.5)
				System.out.println("Suspender atividades das indústrias do 3° grupo!");
		} else
			System.out.print("Número inválido digite um número positivo.");
	}

}
