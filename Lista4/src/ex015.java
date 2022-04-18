
public class ex015 {

	public static void main(String[] args) {
		// (15) Escreva um algoritmo para receber uma matriz A(5,5) contendo números
		// inteiros e imprimir o menor elemento da sua diagonal principal.

		int A[][] = new int[5][5];
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = (int) (Math.random() * 25);
				if (i == j) {
					if (A[i][j] < menor)
						menor = A[i][j];
					System.out.print(A[i][j] + " ");
				} else {
					A[i][j] = 0;
					System.out.print(A[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("\nO menor dos elementos da diagonal principal são: " + menor);

	}

}
