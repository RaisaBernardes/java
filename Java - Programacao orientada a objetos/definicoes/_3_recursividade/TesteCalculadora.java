package _3_recursividade;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        int num;
	        
	        do {
	            
	            System.out.println("Entre com um n�mero positivo");
	            num = scan.nextInt();
	            
	            if (num < 0){
	                System.out.println("N�mero inv�lido, entre novamente");
	            }
	            
	        } while (num < 0);
	        
	        System.out.println("N�o recursivo: " + Calculadora.fatorialNaoRecursivo(num));
	        
	        System.out.println("Recursivo: " + Calculadora.fatorialRecursivo(num));
	    }
	
	
			
	
}
