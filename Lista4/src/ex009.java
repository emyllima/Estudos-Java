public class ex009 {

	public static void main(String[] args) {
		// (09) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
		// números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo
		// a união de A e B em ordem decrescente.
		
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[20];
		int aux;

		for (int i = 0; i < 10; i++) {
			A[i] = (int) (Math.random() * 50);
			B[i] = (int) (Math.random() * 50);
		}
		
		for (int i = 0; i < 20; i++) {
			if (i < 10)
				C[i] = A[i];
			else 
				C[i] = B[i - 10];
		}
		
		for (int i = 0; i < 19; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (C[i] < C[j]) {
					aux = C[j];
					C[j] = C[i];
					C[i] = aux;
				}
			}
		}
		
		for (int i = 0; i < 20; i++)
			System.out.println(C[i]);

	}

}
