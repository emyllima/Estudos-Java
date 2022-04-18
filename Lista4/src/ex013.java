public class ex013 {

	public static void main(String[] args) {
		// (13) Escreva um algoritmo para receber uma matriz A(5,5) contendo números
		// inteiros e imprimir a soma do elementos da diagonal principal.

		int A[][] = new int[5][5];
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = (int) (Math.random() * 10);
				if (i == j) {
					System.out.print(A[i][j] + " ");
					soma += A[i][j];
				} else {
					A[i][j] = 0;
					System.out.print(A[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("\nA soma dos elementos da diagonal principal da matriz são: " + soma);

	}

}
