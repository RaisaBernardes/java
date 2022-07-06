package _3_recursividade;

public class Fibonacci {

	
	//Fibonacci não recursivo
	public static void fibonacciNaoRecursivo(int qntNumeros) {
		
		int num1=0;
		int num2=1;
		int contador= 0;
		
		while(contador<qntNumeros) {
			
			System.out.println(num1 + " ");
			
			int soma= num1 + num2;
			
			num1 = num2;
			num2 = soma;
			contador += 1;
		}	
	}
	
	
	//Fibonacci recursivo
	public static int fibonacciRecursivo(int n) {
		
		if (n<2) {
			return 1;
		}
		
		return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
	}
}
