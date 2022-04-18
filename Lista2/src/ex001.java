import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		// (01) Escreva um algoritmo para ler 2 valores A e B e escrever seus valores
		// seguidos da mensagem: "são múltiplos" ou "não são múltiplos".

		int A, B;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o valor A: ");
		A = leitor.nextInt();
		System.out.println("Informe o valor B: ");
		B = leitor.nextInt();

		leitor.close();

		if (A > B && A % B == 0)
			System.out.println("Os números " + A + " e " + B + " são múltiplos");
		else
			System.out.println(A + " e " + B + " não são múltiplos");
	}

}
