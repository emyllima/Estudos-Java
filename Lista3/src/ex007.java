import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler dois números inteiros e positivos e informar se
		// o segundo corresponde ao fatorial do primeiro.

		Scanner leitor = new Scanner(System.in);

		int fat = 1;

		System.out.print("Informe o 1º número: ");
		int n1 = leitor.nextInt();
		System.out.print("Informe o 2º número: ");
		int n2 = leitor.nextInt();

		leitor.close();

		for (int i = 1; i <= n1; i++) {
			fat = fat * i;
		}

//		if (n2 == fat) {
//			System.out.println("O 2º número " + " corresponde ao fatorial do 1º número!: " + fat);
//		} else {
//			System.out.println("O 2º número " + n2 + " NÃO corresponde ao fatorial do 1º número!: " + fat);
//		}

		//Operador Ternário p/ if e else simples
		String resultado = (n2 == fat) ? "O 2º número corresponde ao fatorial do 1º número!: "
				: "O 2º número " + n2 + " NÃO corresponde ao fatorial do 1º número!: " + fat;
		System.out.println(resultado);

	}

}
