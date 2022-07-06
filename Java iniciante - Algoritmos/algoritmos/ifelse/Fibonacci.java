package ifelse;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int primeiro = 0;
		int segundo = 1;
		int soma;
		soma = primeiro + segundo;
	
		System.out.println( primeiro + "\n" + segundo + "\n" + soma);
		
		for (int quantidade = 0; quantidade <= 27; ++quantidade){
		
		primeiro = segundo;
		segundo = soma;
		soma = primeiro + segundo;
		
		System.out.println(soma);
		
		}
	}
}
