import java.util.Scanner;

public class ex012 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler um conjunto de quatro valores I, A, B, C, onde
		 * I é um valor inteiro e positivo e A, B, C, são quaisquer valores reais. A
		 * seguir:
		 * 
		 * a) Se I = 1 escrever os três valores A, B, C em ordem crescente. b) Se I = 2
		 * escrever os três valores A, B, C em ordem decrescente.
		 */

		int I, A, B, C;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o I: ");
		I = leitor.nextInt();
		System.out.print("Informe o A: ");
		A = leitor.nextInt();
		System.out.print("Informe o B: ");
		B = leitor.nextInt();
		System.out.print("Informe o C: ");
		C = leitor.nextInt();
		
		leitor.close();

		switch (I) {
		case 1: {
			System.out.print("\nOrdem Crescente: ");
			if (A > B && A > C && B > C) {
				System.out.println(C + " " + B + " " + A);
				break;
			} else if (A > B && A > C && C > B) {
				System.out.println(B + " " + C + " " + A);
				break;
			} else if (B > A && B > C && A > C) {
				System.out.println(C + " " + A + " " + B);
				break;
			} else if (B > A && B > C && C > A) {
				System.out.println(A + " " + C + " " + B);
				break;
			} else if (C > A && C > B && B > A) {
				System.out.println(A + " " + B + " " + C);
				break;
			} else if (C > A && C > B && A > B) {
				System.out.println(B + " " + A + " " + C);
				break;
			}
		}
		case 2: {
			System.out.print("\nOrdem Decrescente: ");
			if (A < B && A < C && B < C) {
				System.out.println(C + " " + B + " " + A);
				break;
			} else if (A < B && A < C && C < B) {
				System.out.println(B + " " + C + " " + A);
				break;
			} else if (B < A && B < C && A < C) {
				System.out.println(C + " " + A + " " + B);
				break;
			} else if (B < A && B < C && C < A) {
				System.out.println(A + " " + C + " " + B);
				break;
			} else if (C < A && C < B && B < A) {
				System.out.println(A + " " + B + " " + C);
				break;
			} else if (C < A && C < B && A < B) {
				System.out.println(B + " " + A + " " + C);
				break;
			}
		}

		}
	}
}
