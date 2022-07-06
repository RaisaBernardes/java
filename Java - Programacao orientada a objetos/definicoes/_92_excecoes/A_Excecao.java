/*
Não tratar erros fazem o programa terminar, e tratá-los permite que o programa execute uma determinada lógica caso o erro 
ocorra. Permite que o programa continue a execução.*/

package _92_excecoes;

public class A_Excecao {

	public static void main(String[] args) {
		
		try{ //Tenta executar o código
			int[] vetor = new int[4];

			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		} catch(ArrayIndexOutOfBoundsException exception){ //O "catch" captura a exceção
			
			System.out.println("Exceção ao acessar um índide do vetor que não existe");
		}
		
		System.out.println("Esse texto será impresso após a exception");
	}

}