//Treinando array. (Solicitar imput de n�meros inteiros dentro de um array e informar se cada elemento � par ou �mpar)

package vetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		int[]vetor;
		int media;
		
		
		System.out.println("Digite a quantidade de elementos: ");
		quantidade = sc.nextInt();
		vetor = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++){
			System.out.println("Informe o n�mero inteiro referente ao " + (i+1) + "� elemento");
			vetor[i] = sc.nextInt();
		}	
		
		for(int i = 0; i < vetor.length; ++i)	{
			
			if(vetor[i] % 2 == 0){
				System.out.println("O elemento " + (i+1) + " � par" );
			}else {
				System.out.println("O elemento " + (i+1) + " � �mpar");
			}
		}	
	}
}
