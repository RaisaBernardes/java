package metodos;
import java.util.Scanner;

public class Biblioteca1 {

public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			String nome, autor, status;
			
			System.out.println("Informe a quantidade de livros que a biblioteca contém: ");
			int quantidade= sc.nextInt();
			
			String [][]livros= new String[quantidade][3];
			
			//Recolhendo informações
			for(int i= 0; i< livros.length; ++i){
				
				System.out.println("Informe o nome do livro: ");
				nome= sc.next();
				
				System.out.println("Informe o autor: ");
				autor= sc.next();
				
				System.out.println("Informe status: ");
				status= sc.next();
				
				livros[i][0]= nome.toUpperCase();
				livros[i][1]= autor.toUpperCase();
				livros[i][2]= status.toUpperCase();
			}
			
			int escolha;
		
			do{
			
				menu();
				escolha = sc.nextInt();
			
			
			if(escolha == 1){
				ProcurarLivro(livros);
				
			}
			else if(escolha == 2){
				EmprestarLivro(livros);
			}
			else if(escolha == 3){
				DevolverLivro(livros);
			}
			else if(escolha == 4){
				VerTodosOsLivros(livros);
			
			}else if(escolha > 4){
				System.out.println("ERRO. Escolha novamente");
			
			}
			}while(escolha != 0);
			
		
			if(escolha == 0){
				System.out.println("Você saiu do programa");
			} 
			
		}
			
//----------------------------------------------------------------------------------------------------------------------------------
		public static void menu(){
			System.out.println();
			System.out.println("Escolha uma das opções: ");
			System.out.println("1- Procurar livro");
			System.out.println("2- Emprestar livro");
			System.out.println("3- Devolver livro");
			System.out.println("4- Ver todos os livros");
			System.out.println("0- SAIR");
		}	
//-----------------------------------------------------------------------------------------------------------------------------------
		public static void ProcurarLivro(String[][]livros){
			Scanner sc= new Scanner(System.in);
			boolean encontrou=false;
			int posicao=0;
			
			System.out.println("Informe o nome do livro: ");
			String busca= sc.next();
			
			for(int i=0; i< livros.length; i++){
				if(livros[i][0]. equalsIgnoreCase(busca)){
					encontrou = true;
					posicao= i;
				}
			}
				if(encontrou==true){
					System.out.println("Nome: " + livros[posicao][0]);
					System.out.println("Autor: " + livros[posicao][1]);
					System.out.println("Status: " + livros[posicao][2]);
				}else{
					System.out.println("Livro não encontrado!");
				}
			}
//------------------------------------------------------------------------------------------------------------------------------------
		public static String[][] EmprestarLivro(String[][]livros){	
				Scanner sc= new Scanner(System.in);
				boolean encontrou=false;
				int posicao=0;
				
				System.out.println("Informe o nome do livro: ");
				String busca= sc.next();
				
				for(int i=0; i<livros.length; ++i){
					if(livros[i][0]. equalsIgnoreCase(busca)){
						encontrou=true;
						posicao=i;
					}
				}
					
				if(encontrou==true){
					if(livros[posicao][2].equalsIgnoreCase("EMPRESTADO")){
						System.out.println("Esse livro está EMPRESTADO!");
					
					}if(livros[posicao][2].equalsIgnoreCase("DISPONIVEL")){
						System.out.println("Deseja alugar esse livro? ");
						String resposta= sc.next();
						if(resposta. equalsIgnoreCase("sim")){
							System.out.println("Você alugou o livro " + livros[posicao][0] + ". Favor, recolhe-lo na recepção! ");
							livros[posicao][2] = "EMPRESTADO";
						}else{
						livros[posicao][2] = "DISPONIVEL";
					}return livros;
				}
			}else{
				System.out.println("Livro não encontrado!");
			}
				return livros;
		}	
//------------------------------------------------------------------------------------------------------------------------------------------------
			public static String[][] DevolverLivro(String[][]livros){
				Scanner sc= new Scanner(System.in);
				boolean encontrou=false;
				int posicao=0;
				
				System.out.println("Informe o nome do livro: ");
				String busca= sc.next();
				
				for(int i=0; i<livros.length; ++i){
					if(livros[i][0].equalsIgnoreCase(busca)){
						encontrou=true;
						posicao=i;
					}
				}
					if(encontrou==true){
						if(livros[posicao][2].equalsIgnoreCase("DISPONIVEL")){
							System.out.println("Você não alugou esse livro! Ele encontra-se disponivel na biblioteca");
						}else if(livros[posicao][2].equalsIgnoreCase("EMPRESTADO")){
							System.out.println("O livro " + livros[posicao][0] + " foi devolvido com sucesso! ");
							livros[posicao][2]= "DISPONIVEL";
						}
					}
				if(encontrou==false){
					System.out.println("Livro não encontrado!");
				}
					return livros;
			}
		
//--------------------------------------------------------------------------------------------------------------------------------------------------
		public static void VerTodosOsLivros(String[][]livros){
				
				for(int i=0; i<livros.length; ++i){
					System.out.println(livros[i][0]);
					}
				}
			}//fechando classe



