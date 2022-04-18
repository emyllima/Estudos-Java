import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		/*
		 * (17) Escreva um algoritmo para ler um valor para uma variável n e calcular a
		 * tabuada de 1 até n. Escreva a tabuada na forma:
		 * 
		 * 1 x n = n
		 * 
		 * 2 x n = 2n
		 * 
		 * 3 x n = 3n
		 * 
		 * ...
		 * 
		 * n x n = n2
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o número: ");
		int numero = leitor.nextInt();

		int i = 1;
		
		while (i <= numero) {
			System.out.println(i + " x " + numero + " = " + (numero * i));
			i++;
		}

		leitor.close();

	}

}
