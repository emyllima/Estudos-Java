public class ex011 {

	public static void main(String[] args) {
		// (11) Escreva um algoritmo para receber um vetor A de tamanho 15 contendo
		// números inteiros e imprimir o maior valor do vetor.

		int A[] = new int[15];
		//int A[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 560, 10, 11, 12, 13, 14, 340};
		int maior = 0;

		for (int i = 0; i < 15; i++) {
			A[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < 15; i++) {
			if (maior < A[i]) {
				maior = A[i];
			}
		}

		System.out.println("O maior valor do vetor A é: " + maior);

	}

}
