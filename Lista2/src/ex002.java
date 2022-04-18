import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// (02) Escreva um algoritmo para ler 3 números inteiros e mostrar o maior deles.
		
		int n1, n2, n3;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o 1º número: ");
		n1 = leitor.nextInt();
		System.out.print("Informe o 2º número: ");
		n2 = leitor.nextInt();
		System.out.print("Informe o 3º número: ");
		n3 = leitor.nextInt();

		leitor.close();

		if (n1 > n2 && n1 > n3)
			System.out.print("O maior é 1º número inserido: " + n1);
		else if (n2 > n1 && n2 > n3)
			System.out.print("O maior é 2º número inserido: " + n2);
		else
			System.out.print("O maior é 3º número inserido: " + n3);
	}

}
