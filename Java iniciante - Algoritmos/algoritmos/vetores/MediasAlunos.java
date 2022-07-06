//Treinando array e for
package vetores;

import java.util.Scanner;

public class MediasAlunos {


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		int quantidade = sc.nextInt();
		
		
		String nome[] = new String[quantidade];
		double nota1[] = new double[quantidade];
		double nota2[] = new double[quantidade];
		double media[] = new double[quantidade];
		
		for(int i= 0; i< quantidade; ++i){
		
			System.out.println("\nInforme nome do aluno: ");
			nome[i]= sc.next();
			
			System.out.println("\nInforme nota da primeira prova: ");
			nota1[i]= sc.nextDouble();
			
			System.out.println("\nInforme nota da segunda prova: ");
			nota2[i]= sc.nextDouble();
			
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		for(int i= 0; i< quantidade; ++i){
			System.out.println("\nALUNO: " + nome[i]);
			System.out.println("\nNOTAS: " + nota1[i] + " e " + nota2[i]);
			System.out.println("\nMÉDIA: " + media[i]);
		
			if(media[i] >= 7.0){
			System.out.println("\n------APROVADO-----");
		
			}else if (media[i] >= 3.0 && media[i] < 7.0){
				System.out.println("\n-------RECUPERAÇÃO-----");
			}else{
				System.out.println("\n----REPROVADO-----");
			}
		}
	}	
}
