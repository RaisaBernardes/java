//Mostrar a sequencia de uma PA de 25 termos de razão 3

package forr;

import java.util.Scanner;

public class PA1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		for (int cont = 1; cont <= 25; ++cont){
				
			int sequencia = 1 + (cont - 1)*3;
			
			System.out.println(sequencia);
			
		}
			
	}

}
