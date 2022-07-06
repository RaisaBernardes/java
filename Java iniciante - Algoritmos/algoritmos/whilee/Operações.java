package whilee;
import java.util.Scanner;

public class Opera��es {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int escolha;
		int numero1;
		int numero2;

		System.out.println("Analise as op��es abaixo e digite a numera��o correspondente � opera��o " +
				"desejada. " + "\n 1- Adi��o  \n 2- Subtra��o  \n 3- Multiplica��o  \n 4- Quociente da divis�o " +
				"\n 5- Resto da divis�o  \n 6- Potencia��o  \n 7- M�dia aritm�tica " + "\n 8- SAIR" +
				"\n \n Op��o desejada: ");

		escolha = sc.nextInt();

		while(escolha != 8){


			// while is not a valid operation
			if ((escolha > 0) && (escolha < 8)) {
				System.out.println("\n Digite dois valores inteiros: ");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();

				if(escolha == 1){
					System.out.println(" (ADI��O) " +"\n" + numero1 + " + " + numero2 + " = " + (numero1+numero2));
				}else if (escolha == 2){
					System.out.println(" (SUBTRA��O) " +"\n" + numero1 + " - " + numero2 + " = " + (numero1-numero2));
				}else if (escolha == 3){
					System.out.println(" (MULTIPLICA��O) " +"\n" + numero1 + " x " + numero2 + " = " + (numero1*numero2));
				}else if (escolha == 4){
					if (numero2 == 0) {
						System.out.println("Infinito!");
					} else {
						System.out.println(" (DIVIS�O) " +"\n" + numero1 + " / " + numero2 + " = " + (numero1/numero2));
					}
				}else if (escolha == 5){
					if (numero2 == 0) {
						System.out.println("Burro da zero pra ele!!");
					} else {
						System.out.println(" (RESTO) " +"\n O resto da divis�o " + numero1 + " / " + numero2 + " = " + (numero1 % numero2));
					}
				}else if (escolha == 6){
					System.out.println(" (POTENCIA��O) " +"\n" + numero1 + " elevado a " + numero2 + " = " + Math.pow(numero1, numero2));
				}else if (escolha == 7){
					System.out.println(" (M�DIA ARITM�TICA) " +"\n" + numero1 + " + " + numero2 + " / 2  = " + ((numero1+numero2)/2));
				}
				
				System.out.println("\nEscreva numero correspondente � opera��o desejada: ");
				escolha = sc.nextInt();
			} else {
				System.out.println("\nErro! Digite novamente:");
				escolha = sc.nextInt();				
			}
		}
		
		System.out.println("VOC� SAIU DO PROGRAMA");
	}
}

