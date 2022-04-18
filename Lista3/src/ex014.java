import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		/*
		 * (14) Foi feita uma pesquisa entre os habitantes de uma região. Escreva um
		 * algoritmo para ler idade, sexo (m/f) e salário dos habitantes. Calcular e
		 * escrever:
		 * 
		 * a) a média de salário da população;
		 * 
		 * b) maior e menor idade da população;
		 * 
		 * c) quantidade de mulheres com salário até R$ 100,00.
		 * 
		 * Encerre a entrada de dados quando for digitada uma idade negativa.
		 */

		Scanner leitor = new Scanner(System.in);

		int quantSalarioMulheres = 0;
		byte idade = 0;
		char sexo;
		float salario, somaSalario = 0;
		byte maiorIdade = 0, menorIdade = 115;

		int i = 0;

		while (idade >= 0) {

			System.out.print("Informe a idade dos habitantes: ");
			idade = leitor.nextByte();
			System.out.print("Informe o sexo (m - Masculino / f - Feminino) dos habitantes: ");
			sexo = leitor.next().charAt(0);
			System.out.print("Informe o salário dos habitantes: \n");
			salario = leitor.nextFloat();

			if (idade > 0) {
				if (idade > maiorIdade)
					maiorIdade = idade;

				if (idade < menorIdade)
					menorIdade = idade;

				somaSalario += salario;

				if (salario <= 100 && sexo == 'f') //Se a variável fosse String o método equals(); poderia ser usado
					quantSalarioMulheres = quantSalarioMulheres + 1;
			} else {
				System.out.println("Idade negativa não permitida!\n");
				i--;
			}

			i++;
		}

		float mediaSalario = somaSalario / i;

		System.out.println("A média do sálario da população é: " + mediaSalario);
		System.out.println("A maior idade dentre a população é: " + maiorIdade
				+ "\nA menor idade dentre a população é: " + menorIdade);
		System.out.println("A quantidade de mulheres com salário até R$ 100,00: " + quantSalarioMulheres);
		
		leitor.close();

	}

}
