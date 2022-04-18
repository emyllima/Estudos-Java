
public class ex012 {

	public static void main(String[] args) {
		// (12) Escreva um algoritmo para receber uma matriz A(5,5) contendo números
		// inteiros e imprimir a soma dos seus elementos.

		int A[][] = new int[5][5];
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = (int) ((Math.random() * 15));
				System.out.print(A[i][j] + " ");
				soma += A[i][j];
			}
			System.out.println();
		}

		System.out.println("\nA soma de todos os números da matriz é: " + soma);

	}

}
