import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler a idade de um nadador e classificá-lo em uma
		 * das seguintes categorias:
		 * 
		 * Infantil A = 5-7 anos
		 * Infantil B = 8-10 anos
		 * Juvenil A = 11-13 anos
		 * Juvenil B = 14-17 anos
		 * Adulto = maiores de 18 anos
		 */

		int idade;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a idade: ");
		idade = leitor.nextInt();

		leitor.close();

		if (idade >= 18) {
			System.out.println("Sua categoria é: ADULTO");
		} else if (idade >= 14) {
			System.out.println("Sua categoria é: JUVENIL B");
		} else if (idade >= 11) {
			System.out.println("Sua categoria é: JUVENIL A");
		} else if (idade >= 8) {
			System.out.println("Sua categoria é: INFANTIL B");
		} else if (idade <= 7 && idade >= 5) {
			System.out.println("Sua categoria é: INFANTIL A");
		} else {
			System.out.println("Você não possui categoria!");
		}

	}

}
