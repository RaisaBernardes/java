package ifelse;
import java.util.Scanner;

public class Investimento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double valor;
			
		System.out.println("Digite o valor que deseja investir: ");
		valor = sc.nextDouble();
		
		double lucro1 = (0.5/100) * valor;
		double lucro2 = (1.0/100) * valor;
		double lucro3 = (1.5/100) * valor;
		
			if (valor >= 100 && valor < 1000){
				System.out.println("Aplica��o dispon�vel: POUPAN�A \n Sua rentabilidade ser� " +
			" R$ " + lucro1 + " por m�s");
				
			}else if (valor >= 1000 && valor < 2500){
				System.out.println("Aplica��es dispon�veis: \n POUPAN�A" +
				"\n Sua rentabilidade ser� R$" + lucro1 + " por m�s " + 
				"\n \n FUNDOS DE RENDA FIXA \n" + "Sua rentabilidade ser� R$ " 
				+ lucro2 + " por m�s");
				
			}else if (valor >= 2500){
				System.out.println("Aplica��es dispon�veis: \n \n POUPAN�A \n Sua rentabilidade ser� " +
				" R$ " + lucro1 + " por m�s \n \n" +		
				"FUNDOS DE RENDA FIXA \n Sua rentabilidade ser� " +
				" R$ " + lucro2 + " por m�s \n \n" +
				"CDBs \n Sua rentabilidade ser� R$ " + lucro3 + "por m�s");
			
			}else{
				System.out.println("Esse valor n�o permite quaisquer dos tr�s investimentos.");
			}
	}
}