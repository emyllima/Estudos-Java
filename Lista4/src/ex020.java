
public class ex020 {

	public static void main(String[] args) {
		// (20) Escreva um algoritmo para receber uma matriz A(12,12). O algoritmo deve
		// somar cada linha de A e armazenar em um vetor B.

		int A[][] = new int[12][12];
		int B[] = new int[12];
		int soma;

		System.out.println("Matriz A: ");
		for (int i = 0; i < 12; i++) {
			soma = 0;
			for (int j = 0; j < 12; j++) {
				A[i][j] = (int) (Math.random() * 12);
				System.out.print(A[i][j] + " ");
				soma += A[i][j];
			}
			switch (i) {
			case 0:
				B[0] = soma;

			case 1:
				B[1] = soma;

			case 2:
				B[2] = soma;

			case 3:
				B[3] = soma;

			case 4:
				B[4] = soma;

			case 5:
				B[5] = soma;

			case 6:
				B[6] = soma;

			case 7:
				B[7] = soma;

			case 8:
				B[8] = soma;

			case 9:
				B[9] = soma;

			case 10:
				B[10] = soma;

			case 11:
				B[11] = soma;

			}
			System.out.println();
		}
		System.out.println("\nVetor B com a soma dos elementos das linhas da matriz A\n");
		for (int i = 0; i < 12; i++)
			System.out.print(B[i] + " ");
	}

}
