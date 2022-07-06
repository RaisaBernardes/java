//Fazer a média do aluno e informar se ele está aprovado, reprovado ou em recuperação. Fazer para "for" para 30 alunos [não identificados]

package whilee;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		double nota1;
		double nota2;

			for(int cont = 1; cont <= 30; ++cont){
			
			System.out.println("Digite a primeira nota do aluno: ");
			nota1 = sc.nextDouble();
			
			while(nota1 >10 || nota1 < 0) {
				System.out.println("Essa nota não é válida. Favor, digitar novamente.");
				nota1 = sc.nextDouble();
			}
			
			System.out.println("Digite a segunda nota do aluno: ");
			nota2 = sc.nextDouble();
			
			while(nota2 >10 || nota2 < 0) {
				System.out.println("Essa nota não é válida. Favor, digitar novamente.");
				nota2 = sc.nextDouble();
			}
					
					double media = (nota1 + nota2)/2;
				
					if(media >= 7){
						System.out.println("O aluno obteve média " + media + " e está APROVADO.");
					}else if (media < 7 && media > 3){
						System.out.println("O aluno obteve média " + media + " e está EM RECUPERAÇÃO.");
					}else{
						System.out.println("O aluno obteve média " + media + " e está REPROVADO.");
				}
			
			}
	
		}

	}
