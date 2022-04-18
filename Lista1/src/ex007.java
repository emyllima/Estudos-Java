import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		// (07) Escreva um algoritmo para ler o salário atual de um funcionário e o
		// percentual de reajuste e calcular o seu novo salário.

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o salario atual: ");
		int salarioAtual = leitor.nextInt();
		System.out.print("Informe o percentual de reajuste: ");
		int reajustePerc = leitor.nextInt();

		leitor.close();

		reajustePerc = reajustePerc + (reajustePerc / 100);
		int novoSalario = salarioAtual + reajustePerc;

		System.out.print("O salario atual é: " + novoSalario + ",00 R$");

	}

}
