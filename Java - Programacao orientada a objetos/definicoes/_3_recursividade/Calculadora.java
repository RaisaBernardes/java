/*------RECURSIVIDADE-------

O processo no qual uma função chama a si mesma direta ou indiretamente é chamado de recursão e a função correspondente
é chamada de função recursiva. Usando algoritmo recursivo, certos problemas podem ser resolvidos com bastante facilidade.

A alocação de memória funciona como uma pilha.

Desvantagens: 
O programa recursivo tem maiores requisitos de espaço do que o programa iterativo, pois todas as funções permanecerão 
na pilha até que o caso base seja alcançado. Ele também tem maiores requisitos de tempo devido a chamadas de função e 
sobrecarga de retorno.

Vantagens:
A recursão fornece uma maneira limpa e simples de escrever código. Alguns problemas são inerentemente recursivos como 
travessias de árvores, Torre de Hanói, etc. Para tais problemas, é preferível escrever código recursivo. Podemos escrever 
esses códigos também iterativamente com a ajuda de uma estrutura de dados de pilha.

*/


package _3_recursividade;

public class Calculadora {

	    public static int somar (int num1, int num2){
	        return num1 + num2;
	    }
	    
	    public static int subtrair (int num1, int num2){
	        return num1 - num2;
	    }
	    
	    public static int multiplicar (int num1, int num2){
	        return num1 * num2;
	    }
	    
	    public static int dividir (int num1, int num2){
	        return num1 / num2;
	    }
	    
	    
	    //xˆn
	    // x * x * x * x (n vezes)
	    public static int potencia (int num1, int num2){
	        
	        int total = 1;
	        for (int i=1; i<=num2; i++){
	            total *= num1;
	        }
	        
	        return total;
	    }
	    
	    
	    //5! = 5 * 4 * 3 * 2 * 1 = 120
	    //0! = 1
	    public static int fatorialNaoRecursivo(int num){
	      
	        if (num == 0){
	            return 1;
	        }
	        
	        int total = 1;
	        for (int i=num; i>1; i--){
	            total *= i;
	        }
	        
	        return total;
	    }
	    
	    
	    //fatorial(5) = 5 * fatorial(4)
	    //fatorial(4) = 4 * fatorial(3)
	    //fatorial(3) = 3 * fatorial(2)
	    //fatorial(2) = 2 * fatorial(1)
	    //fatorial(1) = 1 * fatorial(0)
	    //fatorial(0) = 1;
	    public static int fatorialRecursivo(int num){
	    		
	    		if (num == 0){
	    			return 1;
	    		}
	    	
	    		return num * fatorialNaoRecursivo(num-1);
	    }
	}