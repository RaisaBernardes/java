/*-----VARARGS-----
- O QUE �: O varargs � um recurso do java (a partir do java5) que permite que vc passe infinitos par�metros pro m�todo sem ter 
		   que declarar todos os par�metros.

- QUANDO UTILIZAR: Quando voc� n�o sabe quantos par�metros ser�o passados. (A pr�pria API do java tamb�m o utiliza no printf.)
 */


package _1J_varargs;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println(soma(1, 2));
		System.out.println(soma(1, 2, 3));

		int[] vetor = {1, 2, 3, 4, 5};
		System.out.println(soma(vetor));
		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

	static int soma(int a, int b){
		return a + b;
	}

	static int soma(int a, int b, int c){
		return a + b + c;
	}

	static int soma(int[] vetor){

		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;
	}

	static int soma(int a, int b, Integer... vetor){ //Varargs -> Integer...
													 //O "Integer..." tem que ser o �ltimo dentro dos par�ntesis
		int total = 0;

		for (int i=0; i<vetor.length; i++){
			total += vetor[i];
		}

		return total;
	}
}