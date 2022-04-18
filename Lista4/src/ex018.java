
public class ex018 {

	public static void main(String[] args) {
		// (18) Escreva um algoritmo para receber uma matriz A(9,9) de reais e imprimir
		// a soma dos elementos das linhas pares de A.
		
		int A[][] = new int [9][9];
		int soma = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				A[i][j] = (int) (Math.random() * 15);
				System.out.print(A[i][j] + " ");
				if (i % 2 == 0) {
					soma += A[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println(soma);
		
	}

}
