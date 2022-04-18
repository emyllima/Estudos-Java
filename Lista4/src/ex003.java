public class ex003 {

	public static void main(String[] args) {
		// (03) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
		// números inteiros. Ao final do algoritmo, o vetor B deve conter o fatorial de
		// cada elemento do vetor A.

		int A[] = new int[10];
		int B[] = new int[10];

		for (int i = 0; i < 10; i++)
			A[i] = (int) (Math.random() * 15);
		
		for (int i = 0; i < 10; i++) {
			B[i] = 1;
			for (int j = 1; j <= A[i]; j++)
				B[i] = B[i] * j;
		}
		for (int i = 0; i < B.length; i++)
			System.out.println("O fatorial do vetor A " + A[i] + " na posição: " + (i + 1) + "º do vetor B é: " + B[i]);

	}

}
