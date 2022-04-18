import java.util.Scanner;

public class ex009 {

	public static void main(String[] args) {
		/*
		 * 09) O cardápio de uma lanchonete é o seguinte:
		 * 
		 * Produto Código Preço
		 * 
		 * Cachorro-quente 100 1,20
		 * 
		 * Bauru simples 101 1,30
		 * 
		 * Bauru com ovo 102 1,50
		 * 
		 * Hambúrguer 103 1,20
		 * 
		 * Misto Quente 104 1,30
		 * 
		 * Refrigerante 105 1,00
		 * 
		 * Escreva um algoritmo para ler o código do item pedido, a quantidade e calcule
		 * o valor a ser pago por aquele lanche.
		 * 
		 */

		int codigo;
		float quant, valor;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o código: ");
		codigo = leitor.nextInt();
		System.out.println("Informe a quantidade: ");
		quant = leitor.nextInt();

		leitor.close();

		switch (codigo) {
		case 100: {
			valor = quant * 1.2f;
			System.out.println("O valor total do seu pedido é: " + valor + " R$");
			break;
		}
		case 101: {
			valor = quant * 1.3f;
			System.out.println("O valor total do seu pedido é: " + valor + " R$");
			break;
		}
		case 102: {
			valor = quant * 1.5f;
			System.out.println("O valor total do seu pedido é: " + valor + " R$");
			break;
		}
		case 103: {
			valor = quant * 1.2f;
			System.out.println("O valor total do seu pedido é: " + valor + " R$");
			break;
		}
		case 104: {
			valor = quant * 1.3f;
			System.out.println("O valor total do seu pedido é: " + valor + " R$");
			break;
		}
		case 105: {
			valor = quant * 1.0f;
			System.out.println("O valor total do seu pedido é: " + valor + " R$");
			break;
		}
		default:
			System.out.println("Código inválido!");
			break;
		}
	}
}
