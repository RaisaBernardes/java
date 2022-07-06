//Operações entre matrizes
package matrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------PRIMEIRA MATRIZ--------------");

		System.out.println("Informe o tamanho da matriz quadrada: ");
		int tamanho = sc.nextInt();

		int valor[][] = new int[tamanho][tamanho];

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.println("Qual o valor da posição " + i + "," + j + "?");
				valor[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("-----------------SEGUNDA MATRIZ--------------");

		int valor2[][] = new int[tamanho][tamanho];

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.println("Qual o valor da posição " + i + "," + j + "?");
				valor2[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("--------RESULTADOS-----------");
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.print(valor[i][j] + "\t");
			}
			System.out.println(" ");
		}
		

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				System.out.print(valor2[i][j] + "\t");
			}
			System.out.println(" ");
		}

		int[] operacoes = new int[4];

		System.out.println("-----SOMA----");

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				int[][] soma = new int[tamanho][tamanho];
				soma[i][j] = valor[i][j] + valor2[i][j];
				System.out.print(soma[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----SUBTRAÇÃO-----");

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				int[][] subtracao = new int[tamanho][tamanho];
				subtracao[i][j] = valor[i][j] - valor2[i][j];
				System.out.print(subtracao[i][j] + "\t");
			}
			System.out.println();
		}
		

		System.out.println("-----MULTIPLICAÇÃO-----");

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				int[][] multiplicacao = new int[tamanho][tamanho];
				multiplicacao[i][j] = valor[i][j] * valor2[i][j];
				System.out.print(multiplicacao[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----DIVISÃO-----");

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				double[][] divisao = new double[tamanho][tamanho];
				divisao[i][j] = valor[i][j] / valor2[i][j];
				System.out.print(divisao[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
