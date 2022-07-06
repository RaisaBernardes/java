//Informar qual é o segundo maior valor e o segundo menos valor.

package matrizes;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int maior= Integer.MAX_VALUE;
		int menor= Integer.MIN_VALUE;
		int SegMaior= Integer.MAX_VALUE;
		int SegMenor= Integer.MIN_VALUE;
		
		int[][] numeros= new int[4][3];
		
		for(int i=0; i< numeros.length; ++i){
			
			System.out.println("Informe os numeros da " + (i+1) + "º parte ");
			
			for(int j=0; j< numeros[i].length; ++j){
				numeros[i][j]= sc.nextInt();
			
				if(numeros[i][j] < maior){
					maior = numeros[i][j];
				}
				
				if(numeros[i][j] > menor){
					menor = numeros[i][j];
				}
			}
		}
	
			for(int i=0; i< numeros.length; ++i){
				for(int j=0; j< numeros[i].length; ++j){
					
					if(numeros[i][j] > SegMenor && numeros[i][j] != menor){
						SegMenor = numeros[i][j];
					}
					
					if(numeros[i][j] < SegMaior && numeros[i][j] != maior){
						SegMaior = numeros[i][j];
					}
				}
			}		
					
			System.out.println("O segundo maior valor é " + SegMenor);
			System.out.println("O segundo menor valor é " + SegMaior);
	
	}
}
