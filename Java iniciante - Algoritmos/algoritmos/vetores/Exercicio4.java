package vetores;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int quant = 3;
		int num[] = new int [quant];
		int cont = 0;
		
		for(int i= 0; i< num.length; ++i){
			
			System.out.println("Digite o " + (i+1) + "� numero inteiro: ");
			num[i] = sc.nextInt();
			if (num[i] % 6 ==0){
				++cont;
			}
		}
		
		System.out.println("\nOs n�meros digitados foram: ");
		
		for(int i= 0; i< num.length; ++i){
			System.out.println("\n" + num[i]);
		}
		
		System.out.println("\nDentre esses n�meros, existem " + cont + " numeros m�ltiplos de 6.");
		
		for(int i= 0; i< num.length; ++i){
				
			if(num[i] % 6 == 0){
			System.out.println("\n" + num[i]);
			}
		}
	}
}
