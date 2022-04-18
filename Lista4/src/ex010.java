public class ex010 {

	public static void main(String[] args) {
		// (10) Escreva um algoritmo para receber um vetor A de tamanho 10 contendo
		// números inteiros. O algoritmo deve gerar um vetor B e o popular com os
		// números primos do vetor A.
		
		int A[] = new int [10];
		int B[] = new int [10];
		boolean isPrimo;
		
		for (int i = 0; i < 10; i++) {
			A[i] = (int) (Math.random() * 50);
		}
		
		for (int i = 0; i < 10; i++) {
			isPrimo = true;
			for (int j = 2; j < A[i]; j++) {
				if (A[i] % j == 0) {
					isPrimo = false;
					break;
				}
			}
			if (isPrimo == true) {
					B[i] = A[i];
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(B[i]);
		}

	}

}
