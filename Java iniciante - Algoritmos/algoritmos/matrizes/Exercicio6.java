//Imprimir valores da matriz ao inverso (De trás para frente)
package matrizes;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int[][]matriz={{3,4,5}, {6,7,8}, {9,10,11}};
		
		
		for(int i= (matriz.length -1); i>=0; i--){
			for(int j= matriz[i].length -1; j>=0; j--){
				System.out.println(matriz[i][j]);
			
			}
			
		}

	}

}
