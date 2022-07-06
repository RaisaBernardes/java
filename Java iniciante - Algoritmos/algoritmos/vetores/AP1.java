package vetores;
//Questão 4 da primeira prova de algoritmos. 
//Fazer um sistema de notas de provas: Pedir imput do nome de todos os alunos e suas respectivas notas nas 3 provas da disciplina. 
//Output: maior média e menor média.
//Output: aluno com maior média e aluno com pior média.
//Output: quantidade de alunos aprovados e reprovados.
import java.util.Scanner;

public class AP1 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		int quantidadeDeAlunos;
		int quantidadeDeAlunosAprovados = 0;
		int quantidadeDeAlunosReprovados = 0;
			
		System.out.println("Informe a quantidade de alunos: ");
		quantidadeDeAlunos = sc.nextInt();

		double media[] = new double[quantidadeDeAlunos];
		String nome[] = new String[quantidadeDeAlunos];
		double nota1[] = new double[quantidadeDeAlunos];
		double nota2[] = new double[quantidadeDeAlunos];
		double nota3[] = new double[quantidadeDeAlunos];
		double menormedia = Integer.MAX_VALUE;
		double maiormedia = Integer.MIN_VALUE;
		String melhorAluno = "0";
		String piorAluno = "0";

		for (int i = 0; i < quantidadeDeAlunos; ++i) {

			System.out.println("Informe o nome do " + (i + 1) + "º aluno:");
			nome[i] = sc.next();

			System.out.println("Informe a primeira nota do aluno: ");
			nota1[i] = sc.nextDouble();

			System.out.println("Informe a segunda nota do aluno: ");
			nota2[i] = sc.nextDouble();

			System.out.println("Informe a terceira nota do aluno: ");
			nota3[i] = sc.nextDouble();

			media[i] = (nota1[i] + nota2[i] + nota3[i]) / 3;

			if (media[i] > maiormedia) {
				maiormedia = media[i];
				melhorAluno = nome[i];
			}
			
			if (media[i] < menormedia) {
				menormedia = media[i];
				piorAluno = nome[i];
			}
		}

		for (int i = 0; i < quantidadeDeAlunos; ++i) {

			System.out.println("\nO aluno " + nome[i] + " obteve as seguintes notas: ");
			System.out.println(nota1[i]);
			System.out.println(nota2[i]);
			System.out.println(nota3[i]);
			System.out.println("Média= " + media[i]);

			if (media[i] >= 7) {
				System.out.println("-------APROVADO------");
				++quantidadeDeAlunosAprovados;

			} else {
				System.out.println("---------REPROVADO--------");
				++quantidadeDeAlunosReprovados;
			}

		}
		
		System.out.println(quantidadeDeAlunosAprovados + " alunos foram aprovados.");
		System.out.println(quantidadeDeAlunosReprovados + " alunos foram reprovados. ");
		System.out.println("A maior média foi: " + maiormedia + " - " + melhorAluno);
		System.out.println("A menor média foi: " + menormedia + " - " + piorAluno);
	}
}
