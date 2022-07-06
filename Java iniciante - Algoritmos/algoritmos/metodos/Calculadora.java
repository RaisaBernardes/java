package metodos;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("BEM VINDO A CALCULADORA");
		System.out.println("Digite 1 -> Soma");
		System.out.println("Digite 2 -> Subtração");
		System.out.println("Digite 3 -> Multiplicação");
		System.out.println("Digite 4 -> Divisão");
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
					System.out.println("---------SUBTRAÇÃO----------");
					System.out.println(ResultadoSubtracao(primeiroValor, segundoValor));
					System.out.println("--------------------------\n");
				}

				else if (escolha == 3) {
					System.out.println("----------MULTIPLICAÇÃO---------");
					System.out.println(ResultadoMultiplicacao(primeiroValor, segundoValor));
					System.out.println("-----------------------\n");
				}

				else if (escolha == 4) {
					System.out.println("----------DIVISÃO---------");
					System.out.println(ResultadoDivisao(primeiroValor, segundoValor));
					System.out.println("-----------------------\n");
				}

				System.out.println("");
				System.out.println("Qual operação você deseja? ");
				escolha = sc.nextInt();
			}
		}
		
		System.out.println("Você saiu do programa! ");
	}

	public static int ResultadoSoma(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.println("O valor de b => " + b + "\n");
		System.out.print("O resultado da soma é: ");
		return a + b;
	}

	public static int ResultadoSubtracao(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.print("O resultado da subtração é: ");
		return a - b;
	}

	public static int ResultadoMultiplicacao(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.println("O valor de b => " + b + "\n");
		System.out.print("O resultado da multiplicação é: ");
		return a * b;
	}

	public static int ResultadoDivisao(int a, int b) {
		System.out.println("O valor de a => " + a);
		System.out.println("O valor de b => " + b + "\n");
		System.out.print("O resultado da divisão é: ");
		return a / b;
	}
}
