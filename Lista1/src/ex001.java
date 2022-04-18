import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		// (01) Escreva um algoritmo para ler as dimensões de um retângulo (base e
		// altura) e calcular a sua área.

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a base: ");
		byte base = leitor.nextByte();
		System.out.print("Informe a altura: ");
		byte altura = leitor.nextByte();

		leitor.close();

		int area = base * altura;

		System.out.print("A área é: " + area);
	}

}
