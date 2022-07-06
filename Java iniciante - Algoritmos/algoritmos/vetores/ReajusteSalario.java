package vetores;
//Informar nome e salário do funcionário para calcular reajuste de salário.
import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 20;
		int salario [] = new int[quantidade];
		String nome [] = new String[quantidade];
		double novoSalario[] = new double[quantidade];
		
		for(int i= 0; i< quantidade; ++i){
			System.out.println("Nome do funcionário: ");
			nome[i] = sc.next();
			
			System.out.println("Salário: ");
			salario[i] = sc.nextInt();
		
			novoSalario[i] = salario[i] * 1.08;
		}
		
		for(int i= 0; i< quantidade; ++i){
			
			System.out.println((i+1) + "- " + nome[i] + " -> salário: " + salario [i] + " \tNovo salário: " + novoSalario[i]);
		}	
	}
}
