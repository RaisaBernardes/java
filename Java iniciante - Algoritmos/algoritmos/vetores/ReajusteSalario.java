package vetores;
//Informar nome e sal�rio do funcion�rio para calcular reajuste de sal�rio.
import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 20;
		int salario [] = new int[quantidade];
		String nome [] = new String[quantidade];
		double novoSalario[] = new double[quantidade];
		
		for(int i= 0; i< quantidade; ++i){
			System.out.println("Nome do funcion�rio: ");
			nome[i] = sc.next();
			
			System.out.println("Sal�rio: ");
			salario[i] = sc.nextInt();
		
			novoSalario[i] = salario[i] * 1.08;
		}
		
		for(int i= 0; i< quantidade; ++i){
			
			System.out.println((i+1) + "- " + nome[i] + " -> sal�rio: " + salario [i] + " \tNovo sal�rio: " + novoSalario[i]);
		}	
	}
}
