package vetores;
//Fazer a média dos valores de um vetor.
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Informe a quantidade de elementos: ");
		int quantidade= sc.nextInt();
		
		int[] valores= new int[quantidade];
		int media=0;
		
		System.out.println("Informe os valores dos elementos: ");
	
		for(int i= 0; i< valores.length; ++i){
			valores[i] = sc.nextInt();
			
			media += valores[i];
		}
	
		media /= quantidade;
		
		System.out.println("A média dos valores é: " + media);
		
	}
}
