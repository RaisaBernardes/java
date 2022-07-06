package _3_recursividade;

public class TesteFibonacci {

	public static void main(String [] args) {
		
		Fibonacci.fibonacciNaoRecursivo(10);
		
		System.out.println("-----");
		
		
		//Testando Fibonacci recursivo
		for(int i=0; i<10; ++i) {
			
			System.out.println(Fibonacci.fibonacciRecursivo(i) + " ");
		}
	
	}
}
