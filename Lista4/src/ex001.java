public class ex001 {

	public static void main(String[] args) {
		// (01) Escreva um algoritmo para criar e popular um vetor com os 100 primeiros
		// números pares.

		int vetorPares[] = new int[100];
		int j = 2;
		
		for (int i = 0; i < 100; i++) {
			vetorPares[i] += j;
			j += 2;
			System.out.println(vetorPares[i]);
		}

	}
}
