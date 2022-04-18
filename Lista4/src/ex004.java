public class ex004 {

	public static void main(String[] args) {
		// (04) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
		// números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo
		// a união de A e B.

		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[20];

		for (int i = 0; i < 10; i++) {
			A[i] = (int) (Math.random() * 20);
			B[i] = (int) (Math.random() * 20);
		}

		for (int i = 0; i < 20; i++)
			if (i < 10)
				C[i] = A[i];
			else
				C[i] = B[i - 10];
		
		for (int i = 0; i < 20; i++)
			System.out.println("A união do vetor A e B é: " + C[i]);
	}

}
