package vetores;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int quantidade= 0;
		int valores[] = new int[quantidade];
		int somaDosValores=0;
		
		System.out.println("Informe " + quantidade + " valores inteiros: ");
		quantidade = sc.nextInt();
		
		for(int i= 0; i< quantidade; ++i){
			valores[i]= sc.nextInt();
		
			somaDosValores += valores[i];
		}
		
		System.out.println(somaDosValores);
		
	}

}
