import java.util.Scanner;

public class ex009 {

	public static void main(String[] args) {
		/*
		 * (09) O custo ao consumidor de um carro novo é a soma do custo de fábrica com
		 * o percentual do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * O percentual do distribuidor é de 28% e os impostos de 45%. Escreva um
		 * algoritmo para ler o custo de fábrica de um carro e escreva o custo ao
		 * consumidor.
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o custo de fábrica: ");
		float custoFabrica = leitor.nextFloat();
		
		leitor.close();
		
		float percDistribuidor = custoFabrica * 0.28f;
		float impostos = custoFabrica * 0.45f;

		float custoFinal = custoFabrica + percDistribuidor + impostos;

		System.out.print("O custo final é: " + custoFinal);
	}

}
