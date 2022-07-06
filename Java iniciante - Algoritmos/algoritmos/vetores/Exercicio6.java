package vetores;
//Treinando Array
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int quantidade;
		int[]a;
		
		System.out.println("Digite a quantidade de elementos: ");
		quantidade = sc.nextInt();
		a = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++){
			System.out.println("Informe o elemento " + i);
			a[i] = sc.nextInt();
		}
		
		for(int i = quantidade - 1; i >= 0 ; i--){
			System.out.println("\nO elemento " + i + " é " + a[i] + "\n");
		}	
	}
}
