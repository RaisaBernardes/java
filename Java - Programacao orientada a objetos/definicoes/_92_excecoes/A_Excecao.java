/*
N�o tratar erros fazem o programa terminar, e trat�-los permite que o programa execute uma determinada l�gica caso o erro 
ocorra. Permite que o programa continue a execu��o.*/

package _92_excecoes;

public class A_Excecao {

	public static void main(String[] args) {
		
		try{ //Tenta executar o c�digo
			int[] vetor = new int[4];

			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto n�o ser� impresso");
		} catch(ArrayIndexOutOfBoundsException exception){ //O "catch" captura a exce��o
			
			System.out.println("Exce��o ao acessar um �ndide do vetor que n�o existe");
		}
		
		System.out.println("Esse texto ser� impresso ap�s a exception");
	}

}