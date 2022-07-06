package forr;
import java.util.Scanner;

public class NomesOrdemInversa {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		int quantidade = 5;
		int numero[] = new int[quantidade];
		
		for(int i= 0; i< quantidade; ++i){
			System.out.println("Informe " + (i+1) + "º numero: ");
			numero[i] = sc.nextInt();
			
		}
		for(int i= quantidade-1; i>= 0; --i ){
			System.out.println(numero[i]);
		}
	
	}

}
