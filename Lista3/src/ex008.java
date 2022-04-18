public class ex008 {

	public static void main(String[] args) {
		// (08) Escreva um algoritmo para calcular e escrever o produto dos números primos entre 92 e 147.

		long produto = 1;
		boolean isPrimo;

		for (int i = 92; i <= 147; i++) {
			isPrimo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimo = false;
					break;
				}
			}
			if (isPrimo) {
				produto *= i;
			}
		}
		System.out.println("O produto foi de: " + produto);

	}
}
