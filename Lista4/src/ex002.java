public class ex002 {

	public static void main(String[] args) {
		// (02) Escreva um algoritmo para criar e popular um vetor com os 10 primeiros
		// números primos.

		int primos[] = new int[10];
		boolean isPrimo;
		int cont = 0;
		
		while (cont < 10) {
			for (int i = 2; i < 30; i++) {
				isPrimo = true;
				// loop para descartar os numeros nao primos, testando dividivindo por todos os numeros exceto ele mesmo e 1;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrimo = false;
						break;
					}
				}
				if (isPrimo) {
					primos[cont] = i;
					cont++;
				}
			}
		}
		
		for (int i = 0; i < 10; i++)
			System.out.println(primos[i]);
	}

}
