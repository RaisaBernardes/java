package forr;
//Aparecer numeros multiplos de 4 entre 1050 e 2400
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		for(int numero = 1050; numero <= 2400; ++numero){
			if (numero % 4 == 0){
				System.out.println(numero);
				
			}
		}
	}
}
