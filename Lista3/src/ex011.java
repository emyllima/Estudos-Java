import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {

		// (11) Escreva um algoritmo para ler um número inteiro e positivo e informar
		// qual o próximo número perfeito a partir dele.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = leitor.nextInt();
		
		if (numero > 0) {
			
			if (numero < 6) {
				System.out.println("O próximo número perfeito é 6");
				
			} else if (numero < 28) {
				System.out.println("O próximo número perfeito é 28");
				
			} else if (numero < 486) {
				System.out.println("O próximo número perfeito é 486");
				
			} else if (numero < 8128) {
				System.out.println("O próximo número perfeito é 8.128");
				
			} else if (numero < 33550336) {
				System.out.println("O próximo número perfeito é 33.550.336");
				
			} else if (numero >= 33550336) {
				System.out.println("O próximo número perfeito é 8.859.869.046");
				
			}
		} else {
			System.out.println("Por favor insira um número inteiro e positivo para continuar!");
		}
		
		leitor.close();
		
		
		
	}

}
