import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		// (05) Escreva um algoritmo para ler três valores A, B, C e verificar se eles
		// formam ou não um triângulo (se a > b + c não formam triângulo algum).

		int A, B, C;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o primeiro lado do triângulo: ");
		A = leitor.nextInt();
		System.out.print("Informe o segundo lado do triângulo: ");
		B = leitor.nextInt();
		System.out.print("Informe o terceiro lado do triângulo: ");
		C = leitor.nextInt();

		leitor.close();

		String resultado = (A + B > C && A + C > B && B + C > A) ? "\nÉ triângulo!" : "\nNão é triângulo!";
		System.out.println(resultado);
	}
}
