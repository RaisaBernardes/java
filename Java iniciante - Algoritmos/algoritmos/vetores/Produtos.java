package vetores;
import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int quantidadeDeProdutos = 2;
		String codigo[] = new String[quantidadeDeProdutos];
		int numeroDeUnidades[] = new int[quantidadeDeProdutos];
		double compra[] = new double[quantidadeDeProdutos];
		double venda[] = new double[quantidadeDeProdutos];
		String nome[] = new String[quantidadeDeProdutos];
		int escolha;
		
		for (int i= 0; i< quantidadeDeProdutos; ++i){
			
			System.out.println("Informe código do produto: ");
			codigo[i] =sc.next();
			
			System.out.println("Informe nome do produto: ");
			nome[i] =sc.next();
			
			System.out.println("Informe o número de unidades: ");
			numeroDeUnidades[i] =sc.nextInt();
			
			System.out.println("Informe preço de compra do produto: ");
			compra[i] =sc.nextDouble();
			
			System.out.println("Informe preço de venda do produto: ");
			venda[i] =sc.nextDouble();
		}
		 
		System.out.println("Analise as opções e digite o numero correspondente a sua escolha: ");
		System.out.println("1- Informação de todos os produtos.\n2- Informação de apenas um produto.\n3- SAIR");
		
		for(int i= 0; i< quantidadeDeProdutos; ++i){
			escolha= sc.nextInt();
			
			if(escolha== 1){
				 System.out.println(nome[i]);
				 System.out.println("O codigo do produto é " + codigo[i]);
				 System.out.println(numeroDeUnidades[i] + " unidades");
				 System.out.println("Seu preço de compra foi " + compra[i] + " reais");
				 System.out.println("Seu preço de venda foi " + venda[i] + " reais");
				 System.out.println("\n");
				 
			}else if(escolha== 2){
				System.out.println("Digite o código do produto: ");
				String cod = sc.next();
		
				for(int g= 0; g< quantidadeDeProdutos; ++g){
			
					if(cod.equals(codigo[g])){
						 System.out.println(nome[g]);
						 System.out.println(numeroDeUnidades[g] + " unidades");
						 System.out.println("Seu preço de compra foi " + compra[g] + " reais");
						 System.out.println("Seu preço de venda foi " + venda[g] + " reais");
					}	 
				}
		
			System.out.println("\nAnalise as opções e digite o numero correspondente a sua escolha: ");
			System.out.println("1- Informação de todos os produtos.\n2- Informação de apenas um produto.\n3- SAIR");
			escolha= sc.nextInt();
			}
		}
			System.out.println("Você saiu do programa.");	 
	}
}
	
	
	
	
	
	
	


