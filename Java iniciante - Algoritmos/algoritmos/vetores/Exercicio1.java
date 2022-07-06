//Descobrir qual é o maior e menor valor dentro de um vetor

package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe a quantidade de elementos: ");
		int quantidade= sc.nextInt();
		
		int[]valores= new int[quantidade];
		int minimo= Integer.MAX_VALUE;
		int maximo= Integer.MIN_VALUE;
		
		System.out.println("Informe os valores de cada elemento: ");
		
		for(int i=0; i<quantidade; ++i){
			valores[i]= sc.nextInt();
			
			if(valores[i] > maximo){
				maximo= valores[i];
			}
			
			if(valores[i] < minimo){
				minimo= valores[i];
			}
			
		}
		System.out.println("Maior valor = " + maximo);
		System.out.println("Menor valor = " + minimo);
	}
}
