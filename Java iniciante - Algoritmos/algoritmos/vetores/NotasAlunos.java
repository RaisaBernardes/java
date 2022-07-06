package vetores;
//Calcular a média de uma quantidade x de alunos e informar se está aprovado ou reprovado.
import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeAlunos = 3;
		String nome[] = new String [quantidadeAlunos];
		double nota1 [] = new double[quantidadeAlunos];
		double nota2 [] = new double[quantidadeAlunos];
		double media [] = new double[quantidadeAlunos];
		
		for(int i= 0; i< quantidadeAlunos; ++i){
			System.out.println("\nInforme o nome do " + (i+1) + "º aluno: ");
			nome[i] = sc.next();
			
			System.out.println("\nInforme as notas deste aluno: ");
			nota1 [i] = sc.nextDouble();
			nota2 [i] = sc.nextDouble();
			media[i] = ((nota1[i] + nota2[i])/ 2);
		}
		
		System.out.println("Aluno \t   Notas   \t Média  \t Situação");
		
		for(int i= 0; i< quantidadeAlunos; ++i){
			
			if(((nota1[i] + nota2[i])/ 2) > 7){
				System.out.println(nome[i] + "\t" + nota1[i] + " " + nota2[i] + "\t\t" + media[i] + "\tAPROVADO");
			
			}else{
				System.out.println(nome[i] + "\t" + nota1[i] + " " + nota2[i] + "\t\t" + media[i] + "\tREPROVADO");
				}
		}
	}
}
