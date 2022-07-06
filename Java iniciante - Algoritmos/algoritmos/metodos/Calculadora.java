package metodos;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("BEM VINDO A CALCULADORA");
		System.out.println("Digite 1 -> Soma");
		System.out.println("Digite 2 -> Subtra��o");
		System.out.println("Digite 3 -> Multiplica��o");
		System.out.println("Digite 4 -> Divis�o");
		System.out.println("Digite 5 -> Sair");
		
		int escolha = sc.nextInt();

		while (escolha != 5) {

			if (escolha > 5 || escolha < 1) {
				System.out.println("ERRO! Tente novamente.");
				escolha = sc.nextInt();
			}

			if (escolha < 5 && escolha >= 1) {

				System.out.println("Digite o primeiro valor: ");
				int primeiroValor = sc.nextInt();

				System.out.println("Digite o segundo valor: ");
				int segundoValor = sc.nextInt();

				if (escolha == 1) {
					System.out.println("---------SOMA----------");
					System.out.println(ResultadoSoma(primeiroValor, segundoValor));
					System.out.println("-------------------------\n");
				}

				else if (escolha == 2) {
					System.out.println("---------SUBTRA��O----------");
					System.out.println(ResultadoSubtracao(primeiroValor, segundoValor));
					System.out.println("--------------------------\n");
				}

				else if (escolha == 3) {
					System.out.println("----------MULTIPLICA��O---------");
					System.out.println(ResultadoMultiplicacao(primeiroValor, segundoValor));
					System.out.println("-----------------------\n");
				}

				else if (escolha == 4) {
					System.out.println("----------DIVIS�O---------");
					System.out.println(ResultadoDivisao(primeiroValor, segundoValor));
					System.out.println("-----------------------\n");
				}

				System.out.println("");
				System.out.println("Qual opera��o voc� deseja? ");
				escolha = sc.nextInt();
			}
		}
		
		System.out.println("Voc� saiu do programa! ");
	}

	public static int ResultadoSoma(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.println("O valor de b => " + b + "\n");
		System.out.print("O resultado da soma �: ");
		return a + b;
	}

	public static int ResultadoSubtracao(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.print("O resultado da subtra��o �: ");
		return a - b;
	}

	public static int ResultadoMultiplicacao(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.println("O valor de b => " + b + "\n");
		System.out.print("O resultado da multiplica��o �: ");
		return a * b;
	}

	public static int ResultadoDivisao(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.println("O valor de b => " + b + "\n");
		System.out.print("O resultado da divis�o �: ");
		return a / b;
	}
}
