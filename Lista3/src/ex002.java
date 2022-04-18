
public class ex002 {

	public static void main(String[] args) {
		 /*
		  * (02) Escreva um algoritmo para gerar o números de 1000 a 1999 e escrever 
		  * aqueles que dividido por 11 dão resto igual a 5.
		  */

		for (int i = 1000; i <= 1999; i++) {
			if ((i % 11) == 5)
				System.out.println(i);
		}
	}
}
