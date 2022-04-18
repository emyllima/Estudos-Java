import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		/*
		 * (10) Uma revendedora de carros usados paga a seus funcionários um salário
		 * fixo por mês, mais uma comissão em reais para cada carro vendido e mais 5% do
		 * valor das vendas por ele efetuadas. Escreva um algoritmo para ler o número de
		 * carros vendidos por um vendedor, o valor total de suas vendas, o salário fixo
		 * e o valor que ele recebe por carro vendido. Calcule e escreva o salário final
		 * do vendedor.
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o número de carros vendidos: ");
		float carrosVendidos = leitor.nextFloat();
		System.out.print("Informe o valor total de suas vendas: ");
		float valorTotal = leitor.nextFloat();
		System.out.print("Informe o sálario fixo: ");
		float salarioFixo = leitor.nextFloat();
		System.out.print("Informe o valor recebido por carro vendido: ");
		float comissao = leitor.nextFloat();

		leitor.close();

		float salarioFinal = salarioFixo + (comissao * carrosVendidos) + (valorTotal * 0.05f);

		System.out.print("Seu sálario final é: " + salarioFinal);

	}

}
