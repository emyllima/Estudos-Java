import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		// (04) Escreva um algoritmo para ler a hora de início de um jogo e a hora do
		// final do jogo (considerando apenas horas inteiras) e calcular a duração do
		// jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas
		// e que o jogo pode iniciar em um dia e terminar no dia seguinte.

		int HI, HF, D;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a hora inicial do jogo: ");
		HI = leitor.nextInt();
		System.out.println("Informe a hora final do jogo: ");
		HF = leitor.nextInt();

		leitor.close();

		if (HF <= HI)
			D = 24 - (HI + HF);
		else
			D = HF - HI;
		
		System.out.println("A duração total do jogo foi: " + D);
	}

}
