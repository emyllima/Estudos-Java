
public class ex019 {

	public static void main(String[] args) {
		// (19) Escreva um algoritmo para receber uma matriz A(6,6) e um valor B. O
		// algoritmo deve multiplicar cada elemento de A por B e armazenar em um vetor
		// C.

		int A[][] = new int[6][6];
		int B[][] = new int[6][6];
		int C[][] = new int[6][6];

		System.out.println("Matriz A: ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				A[i][j] = (int) (Math.random() * 15);
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMatriz B: ");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				B[i][j] = (int) (Math.random() * 15);
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nA multiplicação de A e B na matriz C é: ");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				C[i][j] = A[i][j] * B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

	}

}
