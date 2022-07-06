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
				System.out.println("Aplicação disponível: POUPANÇA \n Sua rentabilidade será " +
			" R$ " + lucro1 + " por mês");
				
			}else if (valor >= 1000 && valor < 2500){
				System.out.println("Aplicações disponíveis: \n POUPANÇA" +
				"\n Sua rentabilidade será R$" + lucro1 + " por mês " + 
				"\n \n FUNDOS DE RENDA FIXA \n" + "Sua rentabilidade será R$ " 
				+ lucro2 + " por mês");
				
			}else if (valor >= 2500){
				System.out.println("Aplicações disponíveis: \n \n POUPANÇA \n Sua rentabilidade será " +
				" R$ " + lucro1 + " por mês \n \n" +		
				"FUNDOS DE RENDA FIXA \n Sua rentabilidade será " +
				" R$ " + lucro2 + " por mês \n \n" +
				"CDBs \n Sua rentabilidade será R$ " + lucro3 + "por mês");
			
			}else{
				System.out.println("Esse valor não permite quaisquer dos três investimentos.");
			}
	}
}