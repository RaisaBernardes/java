//Transformar nota avaliativa brasileira em nota americana
package ifelse;

import java.util.Scanner;

public class NotasAvaliativas {

	public static void main(String[] args) {
		
		double nota;
		
		System.out.println("Digite nota do aluno: ");
		Scanner input = new Scanner (System.in);
		
		nota = input.nextDouble();
		
		if(nota <= 1.9 && nota >= 0.0){
			System.out.println("Nota correspondente a 'F' ");
					
		}else if(nota <= 3.9 && nota >= 2.0)	{
			System.out.println("Nota correspondente a 'E' ");
				
		}else if (nota <= 5.9 && nota >= 4.0)	{
			System.out.println("Nota correspondente a 'D' ");
			
		}else if (nota <= 7.9 && nota >= 6.0) {
			System.out.println("Nota correspondente a 'C' ");
		
		}else if (nota <= 9.0 && nota >= 8.0)	{
			System.out.println("Nota correspondente a 'B' ");
				
		}else if (nota >= 9.1 && nota <= 10.0) {
			System.out.println("Nota correspondente a 'A' ");
			
		}else {
			System.out.println(" ERRO ");
		}		

	}

}
