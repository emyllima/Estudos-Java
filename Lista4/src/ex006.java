
public class ex006 {

	public static void main(String[] args) {
		// (06) Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros e imprimir a quantidade de valores pares.

		int A[] = new int[15];
		int B[] = new int[15];
		int cont = 0;

		for (int i = 0; i < 15; i++) {
			A[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < 15; i++) {
			if (A[i] % 2 == 0) {
				B[cont] = A[i];
				cont++;
			}
		}
		
		System.out.println("A quantidade de números pares é: " + cont + "\n");
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Os números pares são: "+ B[i]);
		}

	}

}
