import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {
		/*
		13) Em uma eleição presidencial existem quatro candidatos. Os votos são
		informados através de códigos. Os dados utilizados para a contagem dos votos
		obedecem à seguinte codificação:  

		- 1,2,3,4 = voto para os respectivos candidatos;
		- 5 = voto nulo;
		- 6 = voto em branco;

	Escreva um algoritmo para ler o código do candidato em um voto. Calcular e escrever:

	    - total de votos para cada candidato;
	    - total de votos nulos;
	    - total de votos em branco;

	Como finalizador do conjunto de votos, tem-se o valor 0.
		*/

		Scanner leitor = new Scanner(System.in);
		
		
		int voto = 7, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, votoNulo = 0, votoBranco = 0;
		
		while (voto != 0) {
			System.out.println("ELEIÇÃO PRESIDENCIAL\n");
			System.out.println("1 - Candidato 1 \n2 - Candidato 2 \n3 - Candidato 3 \n4 - Candidato 4 \n5 - Voto nulo \n6 - Voto em branco\n0 - Finalizar a votação\n");
			System.out.print("Insira o número do respectivo candidato: ");
			voto = leitor.nextInt();
			
			switch (voto) {
			case 0: 
				System.out.println("Votação encerrada!");
				break;
			
			case 1:
				cand1 += 1;
				System.out.println("Você votou em Candidato 1!\n");
				break;
			
			case 2:
				cand2 += 1;
				System.out.println("Você votou em Candidato 2!\n");
				break;
			
			case 3:
				cand3 += 1;
				System.out.println("Você votou em Candidato 3!\n");
				break;
				
			case 4:
				cand4 += 1;
				System.out.println("Você votou em Candidato 4!\n");
				break;
			
			case 5:
				votoNulo += 1;
				System.out.println("Você votou nulo!\n");
				break;
			
			case 6:
				votoBranco += 1;
				System.out.println("Você votou em branco!\n");
				break;
			
			default:
				System.out.println("Opção inválida!\n");
			}
			
		}
		
		System.out.println("\nRESULTADO TOTAL DE VOTOS:");
		System.out.println("Candidato 1: " + cand1 + " voto(s)");
		System.out.println("Candidato 2: " + cand2 + " voto(s)");
		System.out.println("Candidato 3: " + cand3 + " voto(s)");
		System.out.println("Candidato 4: " + cand4 + " voto(s)");
		System.out.println("Votos nulos: " + votoNulo + " voto(s)");
		System.out.println("Votos em branco: " + votoBranco + " voto(s)");
		
		leitor.close();
		
	}

}
