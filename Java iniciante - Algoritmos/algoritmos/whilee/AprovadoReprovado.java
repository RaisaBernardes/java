//Fazer a m�dia do aluno e informar se ele est� aprovado, reprovado ou em recupera��o. Fazer para "for" para 30 alunos [n�o identificados]

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
				System.out.println("Essa nota n�o � v�lida. Favor, digitar novamente.");
				nota1 = sc.nextDouble();
			}
			
			System.out.println("Digite a segunda nota do aluno: ");
			nota2 = sc.nextDouble();
			
			while(nota2 >10 || nota2 < 0) {
				System.out.println("Essa nota n�o � v�lida. Favor, digitar novamente.");
				nota2 = sc.nextDouble();
			}
					
					double media = (nota1 + nota2)/2;
				
					if(media >= 7){
						System.out.println("O aluno obteve m�dia " + media + " e est� APROVADO.");
					}else if (media < 7 && media > 3){
						System.out.println("O aluno obteve m�dia " + media + " e est� EM RECUPERA��O.");
					}else{
						System.out.println("O aluno obteve m�dia " + media + " e est� REPROVADO.");
				}
			
			}
	
		}

	}
