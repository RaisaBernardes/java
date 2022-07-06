package _3_recursividade;

public class Somatorio {

	//SOMATÓRIO DE:
	//5 = 5 + 4 + 3 + 2 + 1  >>>>>>  5 + somatorio(4)
	//4 = 4 + 3 + 2 + 1		 >>>>>>  4 + somatorio(3)	
	//3 = 3 + 2 + 1			 >>>>>>  3 + somatorio(2)
	//2 = 2 + 1				 >>>>>>  2 + somatorio(1)
	//1 = 1					 >>>>>>  1
	
	public static int somatorio(int numero) {
		
		if(numero == 1) {
			return 1;
		}
		 		
		return numero + somatorio(numero-1);
	}
	
}
