import java.util.Scanner;

public class ex019 {

	public static void main(String[] args) {

		/*
		 * (19) Foi realizada uma pesquisa de algumas características físicas da
		 * população de uma certa região, a qual coletou os seguintes dados referentes a
		 * cada habitante para serem analisados:
		 * 
		 * - sexo (masculino e feminino) - cor dos olhos (azuis, verdes ou castanhos) -
		 * cor dos cabelos (loiros, castanhos ou pretos) - idade
		 * 
		 * Escreva um algoritmo para ler as informações supracitadas. Calcular e
		 * escrever:
		 * 
		 * - a maior idade dos habitantes - a quantidade de indivíduos do sexo feminino
		 * cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos
		 * loiros.
		 * 
		 * Encerre a entrada de dados quando for digitada uma idade negativa.
		 */

		Scanner leitor = new Scanner(System.in);

		char sexo;
		String corOlhos, corCabelos;
		short idade = 0, maiorIdade = 0, menorIdade = 999, aspectoMulheres = 0;
		int cont = 0;
		
		while (idade >= 0) {

			System.out.print("Informe o sexo (m - Masculino / f - Feminino) dos habitantes: ");
			sexo = leitor.next().charAt(0);
			System.out.print("Informe a cor dos olhos (azul, verde ou castanho): ");
			corOlhos = leitor.next();
			System.out.print("Informe a cor dos cabelos (loiros, castanhos ou pretos): ");
			corCabelos = leitor.next();
			System.out.print("Informe a idade: ");
			idade = leitor.nextShort();

			if (idade > maiorIdade) 
				maiorIdade = idade;
			
			if (idade < menorIdade) 
				menorIdade = idade;
			

			if ((sexo == 'f') && (idade >= 18 && idade <= 35)) {
				if (corOlhos.equals("verde") && corCabelos.equals("loiro"))
					aspectoMulheres++;
			}

			System.out.println();

			cont++;
		}

		leitor.close();

		System.out.println("Maior idade dos habitantes: " + maiorIdade);
		System.out.println(
				"Quantidade de mulheres com idade entre 18 e 35 anos e que tenham olhos verdes e cabelos loiros: "
						+ aspectoMulheres);

	}

}
