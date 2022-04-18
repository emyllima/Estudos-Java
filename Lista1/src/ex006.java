import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// (06) Escreva um algoritmo para ler a temperatura em Fahrenheit e calcular a
		// temperatura correspondente em Celsius.

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe a temperatura em Fahrenheit: ");
		float f = leitor.nextInt();

		leitor.close();

		float c = (f - 32) / 1.8f;

		System.out.println("A temperatura em Celsius é: " + c);

	}

}
