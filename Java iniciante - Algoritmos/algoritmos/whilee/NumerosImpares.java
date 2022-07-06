//Numeros ímpares entre 1 e 100

package whilee;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
	
		while(numero <= 100 && numero >= 0 ) {
	
			if (numero % 2 == 1){
				System.out.println(+ numero);
		
			} 
			numero++;
		}
	
	}

}
