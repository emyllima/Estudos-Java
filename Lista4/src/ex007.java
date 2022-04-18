public class ex007 {

	public static void main(String[] args) {
		// (07) Escreva um algoritmo para receber um vetor A de tamanho 20 contendo
		// números inteiros e imprimir a soma dos seus elementos.
		
		int A[] = new int [20];
		int soma = 0;
		
		for (int i = 0; i < 20; i++) {
			A[i] = (int) (Math.random() * 50);
			soma += A[i];
		}
		System.out.println("A soma dos elementos do vetor A são: " + soma);
	}

}
