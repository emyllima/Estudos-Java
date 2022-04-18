public class ex005 {

	public static void main(String[] args) {
		// (05) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
		// números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo
		// a intersecção de A e B.
		
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
		int cont = 0;

		for (int i = 0; i < 10; i++) {
			A[i] = (int) (Math.random() * 20);
			B[i] = (int) (Math.random() * 20);
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (A[i] == B[j]) {
					C[cont] = A[i];
					cont++;
				}
			}
		}
		
		for (int i = 0; i < 10; i++)
			System.out.println("A intersecção do vetor A e B é: " + C[i]);

	}

}
