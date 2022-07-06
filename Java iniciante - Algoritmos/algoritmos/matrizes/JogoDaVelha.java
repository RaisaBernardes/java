package matrizes;
import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		char[][] jogoDaVelha = new char[3][3];
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
				
		System.out.println("Jogador 1 = X");	
		System.out.println("Jogador 2 = O");
						
		while (!ganhou) {

			if (jogada % 2 == 1) { // jogador1

				System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {

				System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("entre com a linha (1, 2 ou 3)");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("entre com a coluna (1, 2 ou 3)");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}

			linha--;
			coluna--;
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente");
			} else { // jogada valida
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}

			// imprimir tabuleiro
			for (int i = 0; i < jogoDaVelha.length; i++) {
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
				}
				System.out.println();
			}

			// verificar se tem ganhador
			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || // linha1
					(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha2
					(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // linha3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // coluna1
					(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // coluna2
					(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || // coluna3
					(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X')) { // diagonal

				ganhou = true;
				System.out.println("Parabéns, Jogador 1 ganhou!");
			} else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || // linha1
					(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || // linha2
					(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || // linha3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // coluna1
					(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || // coluna2
					(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || // coluna3
					(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O')) { // diagonal
				ganhou = true;
				System.out.println("Parabéns, Jogador 2 ganhou!");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Ninguem ganhou");

			}
		}
	}
}