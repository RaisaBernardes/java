package whilee;
import java.util.Scanner;

public class MultiplicacaoSucessiva2 {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int pot=1;
		
		System.out.println("Digite um valor inteiro qualquer: ");
		int numero= sc.nextInt();
		
		while(numero< 1 || numero>50){
			System.out.println("Numero inválido, digite novamente!");
			numero= sc.nextInt();
			}
		
		if (numero>= 1 && numero<= 50){
		
			while(numero* (Math.pow(2, pot)) < 250){
		
			System.out.println(numero* (Math.pow(2, pot)));
			++pot;
			
			}
		}
	}
}