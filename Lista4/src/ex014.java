
public class ex014 {

	public static void main(String[] args) {
		// (14) Escreva um algoritmo para receber uma matriz A(5,5) contendo números
		// inteiros e imprimir a soma dos elementos da linha 5 e da coluna 3.

		int A[][] = new int[5][5];
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				A[i][j] = (int) (Math.random() * 10);
				if (j == 2 || i == 4) {
					System.out.print(A[i][j] + " ");
					soma += A[i][j];
				} else {
					A[i][j] = 0;
					System.out.print(A[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.print("\nA soma dos elementos da linha 5 e da coluna 3 da matriz são: " + soma);
	}

}
