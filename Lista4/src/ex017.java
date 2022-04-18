
public class ex017 {

	public static void main(String[] args) {
		// (17) Escreva um algoritmo para receber duas matrizes A(4,4) e B(4,4) e
		// retornar a matriz C que seja a soma de A com B.

		int A[][] = new int[4][4];
		int B[][] = new int[4][4];
		int C[][] = new int[4][4];

		System.out.println("Matriz A: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				A[i][j] = (int) (Math.random() * 15);
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMatriz B: ");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				B[i][j] = (int) (Math.random() * 15);
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nA soma de A e B na matriz C é: ");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

	}

}
