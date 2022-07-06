package metodos;
import java.util.Scanner;

public class AP2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int quantidade=0;
		
		Double[][]notas= new Double [quantidade][3];
		String[]nome= new String [quantidade];
		
		int escolha;
		
		do{
		
			MENU();
		escolha= sc.nextInt();
		
		if(escolha == 0){
			System.out.println("Informe a quantidade de alunos: ");
			quantidade= sc.nextInt();
			
			
		}else if(escolha == 1){
			CADASTRO(nome, notas);
		
		}else if (escolha == 2){
			EXIBIR(nome, notas, quantidade);
		
		}else if (escolha == 3){
			ATUALIZAR(nome, notas, quantidade);
		
		}else if (escolha == 4){
			MENORNOTA(nome, notas);
		
		}else if (escolha == 5){
			MAIORNOTA(nome, notas);
		}
		
		} while(escolha != 6);
		
		if(escolha == 6){
			System.out.println("Você saiu do programa!");
	}
		
	}	public static Double[][]CADASTRO(String[]nome, Double[][]notas){
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i< notas.length; ++i){
			
			
			System.out.println("Informe o nome do " + (i+1) + "º aluno: ");
			nome[i]= sc.next();
			
			for(int j=0; j<2; ++j){
				System.out.println((i+1) + "º nota:");
				notas[i][j]= sc.nextDouble();
			
			}
			notas[i][2] = (notas[i][0] + notas[i][1])/2;
		}
	
		return notas;
	
	}	public static Double[][]EXIBIR(String[]nome, Double[][]notas, int quantidade){
		
		
		if(quantidade != 0){
		
		
			for(int i=0; i< notas.length; ++i){
				System.out.println("Aluno: " + nome[i]);
				System.out.println("1ª NOTA " + notas[i][0]);
				System.out.println("2ª NOTA " + notas[i][1]);
				System.out.println("MEDIA " + notas[i][2]);
				
			
				if(notas[i][2] >= 5){
					System.out.println();
					System.out.println("---APROVADO---");
					System.out.println();
					System.out.println();
				}else{
					System.out.println();
					System.out.println("---REPROVADO---");
					System.out.println();
					System.out.println();
				}
			}
		
		}else{
				System.out.println("ERRO");
				System.out.println("Você não informou a quantidade de alunos!");
				System.out.println("Selecione 0 para informar!");
				System.out.println();
			}
			return notas;
	
	}	public static Double[][]ATUALIZAR(String[]nome, Double[][]notas, int quantidade){
		Scanner sc= new Scanner(System.in);
		int posicao=0;
		
		if(quantidade != 0){
	
		System.out.println("Informe aluno: ");
		String aluno= sc.next();
		
		for(int i=0; i<notas.length; ++i){
			if(aluno.equalsIgnoreCase(nome[i])){
				posicao=i;
			}
		}
			if(aluno.equalsIgnoreCase(nome[posicao])){
		
				System.out.println("Qual das notas deseja atualizar? (primeira/segunda)");
				String atualizar= sc.next();
				
				System.out.println("Informe a nova nota: ");
				Double novaNota= sc.nextDouble();
				
					if(atualizar.equalsIgnoreCase("primeira")){
					
						notas[posicao][0] = novaNota;
					}
					if(atualizar.equalsIgnoreCase("segunda")){
					
						notas[posicao][1] = novaNota;
					}
					
					System.out.println("Nota atualizada!");
					System.out.println();
					
					notas[posicao][2]= (notas [posicao][0] + notas[posicao][1])/2;
			}else{
				System.out.println("Aluno não cadastrado!");
				
			}
		}else{
			System.out.println("Você não informou a quantidade!");
		}	
		return notas;
	
	}	public static void MAIORNOTA(String[]nome, Double[][]notas){
			Double MenorNota= 0.0;
			int posicao=0;
		
		for(int i=0; i<notas.length; ++i){
				
				if(notas[i][2] >= MenorNota){
					MenorNota = notas[i][2];
					posicao = i;
				}
			}
		System.out.println("Maior Nota: " + MenorNota + " - " + nome[posicao]);
	
	
	}	public static void MENORNOTA(String[]nome, Double[][]notas){
			Double MaiorNota= 10.0;
			int posicao=0;
	
			for(int i=0; i<notas.length; ++i){
				
				if(notas[i][2] <= MaiorNota){
				MaiorNota = notas[i][2];
				posicao=i;
			}
		}
	
			System.out.println("Menor Nota: " + MaiorNota + " - " + nome[posicao]);
}
	
		public static void MENU(){
		
			System.out.println("SELECIONE A OPÇÃO QUE DESEJA: ");
			System.out.println();
			System.out.println("0- Informar quantidade de alunos");
			System.out.println("1- Cadastrar alunos e notas");
			System.out.println("2- Exibir notas");
			System.out.println("3- Atualizar notas");
			System.out.println("4- Exibir Menor média");
			System.out.println("5- Exibir Maior média");
		
		}

		



}

