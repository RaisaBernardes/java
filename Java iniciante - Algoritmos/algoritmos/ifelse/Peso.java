//Informar o peso ideal para homem ou mulher

package ifelse;

import java.util.Scanner;

public class Peso {

	private static Scanner scanner;
	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		
		double peso;
		String mulher = "mulher";
		String homem = "homem";
		
		System.out.println("Você é homem ou mulher?: ");
	    String sexo = s.nextLine();
	    
	    System.out.println("\nDigite sua altura: ");
	    double h = s.nextDouble();
		
		if (sexo.equals(homem)){
			
			peso = (72.7 *h) - 58;
			
			System.out.println("Seu peso ideal é " + peso);
			
		} if (sexo.equals(mulher)) {
			
			peso = (62.1 *h) - 44.7;
			
			System.out.println("Seu peso ideal é " + peso);
			
	    }
	}
}
