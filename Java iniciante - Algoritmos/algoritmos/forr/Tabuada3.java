package forr;
import java.util.Scanner;

public class Tabuada3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;

		System.out.println("Digite um número de 0 a 10: ");
		numero = sc.nextInt();

		for (int cont = 0; cont <= 10; ++cont){
		
		System.out.println(numero +"X"+ cont + "="+ (cont * numero));
		
		}
	
	}

}
