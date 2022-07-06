//---------------MATRIZES IRREGULARES---------- (Matrizes n�o quadradas)
//Exercicio: Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas. A pesquisa consiste em
//perguntar ao cidad�o a quantidade de filhos e o nome de cada filho. Guarde essas informa��es numa matriz de forma que cada
//pessoa entrevistada ocupe somente o espa�o necess�rio na mem�ria para guardar o nome de seus filhos. Imprima a quantidade de
//pessoas entrevistadas, a quantidade de filhos de cada entrevistado e os respectivos noems dos filhos.
package matrizes;

import java.util.Scanner;

public class Matrizes3 {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de pessoas que ser�o entrevistadas:");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i=0; i<nomesFilhos.length; i++){
			
			System.out.println("Entre com a quantidade de filhos");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j=0; j<nomesFilhos[i].length; j++){
				
				System.out.println("Digite o nome do filho " + (j+1));
				
				nomesFilhos[i][j] = scan.next();
			}
		}

		for (int i=0; i<nomesFilhos.length; i++){
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
			for (int j=0; j<nomesFilhos[i].length; j++){
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}
}
