package matrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int quantidade;
		int quantidade2;
		
		System.out.println("Informe a quantidade de linhas: ");
		quantidade = sc.nextInt();
		
		System.out.println("Informa a quantidade de colunas: ");
		quantidade2 = sc.nextInt();
		
		int valor[][] = new int[quantidade][quantidade2];

		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < quantidade2; j++) {
				System.out.println("Qual o valor da posição " + i + "," + j + "?");
				valor[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < quantidade2; j++) {
				System.out.print(valor[i][j] + "\t");

			}
			System.out.println(" ");
		}
	}
}


