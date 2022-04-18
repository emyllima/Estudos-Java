
public class ex005 {

	public static void main(String[] args) {
		/*
		 * (05) Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem
		 * 1,10 metro e cresce 3 centímetros por ano. Escreva um algoritmo para calcular
		 * e imprimir quantos anos serão necessários para que Zé seja maior que Chico.
		 */

		float altChico = 1.50f, altZe = 1.10f, crescAnualChico = 0.2f, crescAnualZe = 0.3f, idade = 0;

		while (altChico >= altZe) {
			altChico = altChico + crescAnualChico;
			altZe = altZe + crescAnualZe;
			idade = idade + 1;
		}

		System.out.println("Idade: " + idade);
		System.out.println("Altura Chico: " + String.format("%.1f", altChico));
		System.out.println("Altura Zé: " + String.format("%.1f", altZe));

	}

}
