import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		/*
		 * (06) Escreva um algoritmo para ler as medidas dos lados de um triângulo e
		 * escrever se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
		 * 
		 * −Triângulo Equilátero: possui os 3 lados iguais; −Triângulo Isósceles: possui
		 * 2 lados iguais; −Triângulo Escaleno: possui 3 lados diferentes.
		 * 
		 */
		
		int A, B, C;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o primeiro lado do triângulo: ");
		A = leitor.nextInt();
		System.out.println("Informe o segundo lado do triângulo: ");
		B = leitor.nextInt();
		System.out.println("Informe o terceiro lado do triângulo: ");
		C = leitor.nextInt();

		System.out.println();
		leitor.close();

		if (A == B && B == C && C == A) {
			System.out.println("Triângulo equilátero");
		} else if (A == B || B == C || C == A) {
			System.out.println("Triângulo isósceles");
		} else if (A != B && B != C && C != A) {
			System.out.println("Triângulo escaleno");
		} else
			System.out.println("Não é triângulo!");
	}

}
