package whilee;
import java.util.Scanner;

public class Operações {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int escolha;
		int numero1;
		int numero2;

		System.out.println("Analise as opções abaixo e digite a numeração correspondente à operação " +
				"desejada. " + "\n 1- Adição  \n 2- Subtração  \n 3- Multiplicação  \n 4- Quociente da divisão " +
				"\n 5- Resto da divisão  \n 6- Potenciação  \n 7- Média aritmética " + "\n 8- SAIR" +
				"\n \n Opção desejada: ");

		escolha = sc.nextInt();

		while(escolha != 8){


			// while is not a valid operation
			if ((escolha > 0) && (escolha < 8)) {
				System.out.println("\n Digite dois valores inteiros: ");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();

				if(escolha == 1){
					System.out.println(" (ADIÇÃO) " +"\n" + numero1 + " + " + numero2 + " = " + (numero1+numero2));
				}else if (escolha == 2){
					System.out.println(" (SUBTRAÇÃO) " +"\n" + numero1 + " - " + numero2 + " = " + (numero1-numero2));
				}else if (escolha == 3){
					System.out.println(" (MULTIPLICAÇÃO) " +"\n" + numero1 + " x " + numero2 + " = " + (numero1*numero2));
				}else if (escolha == 4){
					if (numero2 == 0) {
						System.out.println("Infinito!");
					} else {
						System.out.println(" (DIVISÃO) " +"\n" + numero1 + " / " + numero2 + " = " + (numero1/numero2));
					}
				}else if (escolha == 5){
					if (numero2 == 0) {
						System.out.println("Burro da zero pra ele!!");
					} else {
						System.out.println(" (RESTO) " +"\n O resto da divisão " + numero1 + " / " + numero2 + " = " + (numero1 % numero2));
					}
				}else if (escolha == 6){
					System.out.println(" (POTENCIAÇÃO) " +"\n" + numero1 + " elevado a " + numero2 + " = " + Math.pow(numero1, numero2));
				}else if (escolha == 7){
					System.out.println(" (MÉDIA ARITMÉTICA) " +"\n" + numero1 + " + " + numero2 + " / 2  = " + ((numero1+numero2)/2));
				}
				
				System.out.println("\nEscreva numero correspondente à operação desejada: ");
				escolha = sc.nextInt();
			} else {
				System.out.println("\nErro! Digite novamente:");
				escolha = sc.nextInt();				
			}
		}
		
		System.out.println("VOCÊ SAIU DO PROGRAMA");
	}
}

