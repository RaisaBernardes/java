package vetores;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 10;
		String nome[] = new String [quantidade];
		
		for(int i= 0; i< nome.length; ++i){
			System.out.println("Informe o " + (i+1) + "º nome: ");
			nome[i] = sc.next();
		}
		
		for(int i= 0; i< nome.length; ++i){
			System.out.println("Na " + (i+1) + "º posição se encontra o nome " + nome[i]);
		}
	}
}
