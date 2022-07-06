//Treinando array simples
package vetores;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int quantidadeDeElementos;
	
	
		System.out.println("Digite a quantidade de elementos: ");
		quantidadeDeElementos = sc.nextInt();
	
		int[]elementos = new int [quantidadeDeElementos];
		
			for(int i = 0; i < elementos.length; ++i){
			
				System.out.println("Digite o valor equivalente a " + (i + 1) + "º posição: ");
				elementos[i] = sc.nextInt();
			}
		
			for(int i = 0; i < quantidadeDeElementos; ++i){
			
				System.out.println("\nO elemento " + (i + 1) + " é " + elementos[i]);
			}	
	}

}
