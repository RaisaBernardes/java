package vetores;
import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 4;
		int num [] = new int[quantidade];
		
		for(int i= 0; i< num.length; ++i ){
			System.out.println("Digite o " + (i+1) + "º valor inteiro: ");
			num[i] = sc.nextInt();
		}
		
		for(int i= 0; i< num.length; ++i){
			System.out.println("\nO " + (i+1) + "º valor digitado foi " + num[i]);
			
			if (num[i] % 2 == 0){
				System.out.println(" - PAR");
			}else{
				System.out.println(" - ÍMPAR");
			}
		}
		
		
		
		
		
		
		
		

	}

}
