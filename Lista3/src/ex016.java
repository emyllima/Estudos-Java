import java.util.Scanner;

public class ex016 {

	public static void main(String[] args) {
		/*
		 * (16) Escreva um algoritmo para ler um número n (número de termos de uma
		 * progressão aritmética), a1 (o primeiro termo da progressão) e r (a razão da
		 * progressão) e escrever os n termos desta progressão, bem como a soma dos
		 * elementos.
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o número de termos: ");
		int n = leitor.nextInt();
		System.out.print("Informe o primeiro termo da progressão: ");
		int a1 = leitor.nextInt();
		System.out.print("Informe a razão da progressão: ");
		int r = leitor.nextInt();

		leitor.close();

		n = a1 + (n - 1) * r;

		int s = ((a1 + n) * n) / 2;

		System.out.println("Os termo da progressão é: " + n);
		System.out.println("A soma da progressão aritmetica é: " + s);

	}

}
