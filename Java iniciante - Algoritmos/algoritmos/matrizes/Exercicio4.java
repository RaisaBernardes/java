package matrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		int[][]AlunosNotas = new int[4][2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i<AlunosNotas.length; ++i){
			
			System.out.println("Informe as notas do " + (i+1) + "º aluno: ");
			
				for(int j= 0; j<AlunosNotas[i].length; ++j){
				
				AlunosNotas[i][j]= sc.nextInt();
			}
		} 
		
		for(int i= 0; i<AlunosNotas.length; ++i){
			for(int j= 0; j<AlunosNotas[i].length; ++j){
				for(int k= 0; k<AlunosNotas.length; ++k){
					for(int l=0; l<AlunosNotas[i].length; ++l)
					
						if(AlunosNotas[i][j] == AlunosNotas[k][l] && i != k){
						System.out.println("Notas repetidas: " + AlunosNotas[i][j]);
						
					}
				}
			}
		}
		
		
		for(int i= 0; i<AlunosNotas.length; ++i){
			
			System.out.println("O " + (i+1) + "º aluno tirou notas: ");
			
			for(int j= 0; j<AlunosNotas[i].length; ++j){
				
				System.out.println(AlunosNotas[i][j]);
			} 
			System.out.println("\n");
		} 

	}

}
