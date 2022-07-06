package forr;
//Imputar palavras dentro de um vetor, e informar quais as posições em que as palavras se repetem.
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe a quantidade de palavras: ");
		int quantidade= sc.nextInt();
		
		String[]palavras= new String[quantidade];
		
		System.out.println("Informe as palavras: ");
		
		for(int i=0; i<quantidade; ++i){
			palavras[i]= sc.next();
		}
		for(int i=0; i<quantidade; ++i){
			for(int j=0; j<quantidade; ++j){
				if(palavras[i].equals(palavras[j]) && i != j){
					System.out.println("A palavra " + palavras[i] + " é repetida na posição " + i + " e " + j);
				}
			}
		}
	}
}
