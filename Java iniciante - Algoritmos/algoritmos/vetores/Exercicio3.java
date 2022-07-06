//Treinando array. (Solicitar imput de números inteiros dentro de um array e informar se cada elemento é par ou ímpar)

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
			System.out.println("Informe o número inteiro referente ao " + (i+1) + "º elemento");
			vetor[i] = sc.nextInt();
		}	
		
		for(int i = 0; i < vetor.length; ++i)	{
			
			if(vetor[i] % 2 == 0){
				System.out.println("O elemento " + (i+1) + " é par" );
			}else {
				System.out.println("O elemento " + (i+1) + " é ímpar");
			}
		}	
	}
}
