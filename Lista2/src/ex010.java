import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		/*
		 * Um banco concederá crédito especial aos seus clientes, variável dependente do
		 * saldo médio no último ano. Escreva um algoritmo para ler o saldo médio de um
		 * cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre
		 * uma mensagem informando o saldo médio e o valor do crédito.
		 * 
		 * Saldo | Médio | Percentual
		 * 
		 * de 0 a 200 nenhum crédito 
		 * de 201 a 400 20% do valor do saldo médio 
		 * de 401 a 600 30% do valor do saldo médio 
		 * acima de 601 40% do valor do saldo médio
		 */

		Scanner leitor = new Scanner(System.in);

		float saldoMedio, valorCredito;

		System.out.println("Informe o saldo médio: ");
		saldoMedio = leitor.nextInt();

		leitor.close();

		if (saldoMedio <= 200) {
			valorCredito = saldoMedio * 0.0f;
			System.out.println("\"Crédito total oferecido para o saldo é de: " + valorCredito);
		} else if (saldoMedio <= 400) {
			valorCredito = saldoMedio * 0.2f;
			System.out.println("\"Crédito total oferecido para o saldo é de: " + valorCredito);
		} else if (saldoMedio <= 400) {
			valorCredito = saldoMedio * 0.2f;
			System.out.println("\"Crédito total oferecido para o saldo é de: " + valorCredito);
		} else if (saldoMedio <= 600) {
			valorCredito = saldoMedio * 0.3f;
			System.out.println("\"Crédito total oferecido para o saldo é de: " + valorCredito);
		} else if (saldoMedio >= 601) {
			valorCredito = saldoMedio * 0.4f;
			System.out.println("\"Crédito total oferecido para o saldo é de: " + valorCredito);
		} else
			System.out.println("Inválido!");
	}
}
