public class ex008 {

	public static void main(String[] args) {
		// (08) Escreva um algoritmo para receber um vetor A de tamanho 20 contendo
		// números inteiros e ordená-lo em ordem crescente.

		int vet[] = new int[20];
		int aux;

		for (int i = 0; i < 20; i++)
			vet[i] = (int) (Math.random() * 50);
		
		for (int i = 0; i < 19; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (vet[i] > vet[j]) {
					aux = vet[j];
					vet[j] = vet[i];
					vet[i] = aux;
				}
			}
		}
		
		for (int i = 0; i < 20; i++)
			System.out.println(vet[i]);

	}

}
