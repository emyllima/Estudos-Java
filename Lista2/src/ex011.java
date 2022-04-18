import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo para ler o salário e o cargo de um funcionário e calcule
		 * o novo salário usando a tabela abaixo. Se o cargo do funcionário não estiver
		 * na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário
		 * antigo, o novo salário e a diferença.
		 * 
		 * Código | Cargo | Percentual
		 * 
		 * 101 | Gerente | 10% 
		 * 102 | Engenheiro | 20% 
		 * 103 | Técnico | 30%
		 */

		float salario;
		int codigo;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o sálario: ");
		salario = leitor.nextInt();
		System.out.println("Informe o código do cargo: ");
		codigo = leitor.nextInt();

		leitor.close();

		switch (codigo) {
		case 101: {
			System.out.println("Sálario antigo: " + salario + ", novo sálario: " + ((salario * 0.1) + salario)
					+ ", e diferença: " + ((salario * 0.1) - salario));
			break;
		}
		case 102: {
			System.out.println("Sálario antigo: " + salario + ", novo sálario: " + ((salario * 0.1) + salario)
					+ ", e diferença: " + ((salario * 0.2) - salario));
			break;
		}
		case 103: {
			System.out.println("Sálario antigo: " + salario + ", novo sálario: " + ((salario * 0.1) + salario)
					+ ", e diferença: " + ((salario * 0.3) - salario));
			break;
		}
		default:
			System.out.println("Sálario antigo: " + salario + ", novo sálario: " + ((salario * 0.1)) + salario
					+ ", e diferença: " + ((salario * 0.4) - salario));
			break;
		}

	}

}
