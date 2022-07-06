package metodos;
import java.util.Scanner;

public class AlunosNotas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int quantidade;
		
		do{

		System.out.println("Informe a quantidade de alunos: ");
		quantidade= sc.nextInt();
		
		}while(quantidade <= 0);
			
			
		String[]Nomes= new String[quantidade];
		Double[][]Notas= new Double[quantidade][3];
		
		
		for(int i= 0; i<Nomes.length; ++i){
				System.out.println();
				System.out.println("Informe o nome do " + (i+1) + "º aluno: ");
				Nomes[i]= sc.next();
			
			
			for(int j=0; j< (Notas[i].length) - 1; ++j){
				System.out.println("Informe a " + (j+1) + "ª nota de " + Nomes[i]);
				Notas[i][j]= sc.nextDouble();
			}
			Notas[i][2] = (Notas[i][0] + Notas[i][1])/ 2;
	}
		
		
		ResultadoNotas(Notas, Nomes);
		Atualizar(Notas, Nomes);
		MaiorMenorNota(Nomes, Notas);
		
	}
	//-------------------------------------------------------------------------------------------------------------------
	public static Double[][]ResultadoNotas(Double[][]Notas, String[]Nomes){
		
		for(int i=0; i<Nomes.length; ++i){
			System.out.println("Aluno: " + Nomes[i]);
			
			for(int j=0; j<(Notas[i]. length)-1; ++j){
				System.out.println(Notas[i][j]);
				
	}
		if((Notas[i][2])>=5){
			System.out.println(("MÉDIA " + Notas[i][2]) + " - APROVADO");
		
		}else{
			System.out.println(("MÉDIA " + Notas[i][2]) + " - REPROVADO");
		}
	}
		return Notas;
}
	//--------------------------------------------------------------------------------------------------------------------
	public static Double[][] Atualizar (Double[][]Notas, String[]Nomes){
		Scanner sc= new Scanner(System.in);
		String resposta;
		
		do{
		
		System.out.println();
		System.out.println("Deseja atualizar alguma nota? ");
		resposta = sc.next();
		
		if(resposta.equalsIgnoreCase("sim")){
			System.out.println("Informe nome do aluno ");
			String nomeAluno = sc.next();
			
			for(int i=0; i<Nomes.length; ++i){
				
				if(nomeAluno.equalsIgnoreCase(Nomes[i])){
					
					System.out.println("Qual nota deseja atualizar? ");
					String atualizar= sc.next();
					
					System.out.println("Digite nova nota");
					Double novaNota= sc.nextDouble();
				
				
						if(atualizar.equalsIgnoreCase("primeira")){
							Notas[i][0] = novaNota;
					
						}else{
							Notas[i][1] = novaNota;
					}
					
					System.out.println("----Notas atualizadas---");
					System.out.println("Aluno: " + Nomes[i]);
					System.out.println("Nota 1: " + Notas[i][0]);
					System.out.println("Nota 2: " + Notas [i][1]);
					System.out.println("------------------------");
					
					Notas[i][2] = (Notas[i][0] + Notas[i][1])/2;
					}
				}
			}
		} while(resposta.equalsIgnoreCase("sim"));
		
			return Notas;
	}
	
//------------------------------------------------------------------------------------------------------------------------------------
	public static String MaiorMenorNota(String[]Nomes, Double[][]Notas){
		Double maior= 10.0;
		Double menor= 0.0;
		String melhorAluno= "";
		String piorAluno= "";
		
		
		for(int i=0; i< Nomes.length; ++i){
			
				if(Notas[i][2] > menor){
					menor = Notas[i][2];
					melhorAluno = Nomes[i];
				}
				if (Notas[i][2] < maior){
					maior = Notas[i][2];
					piorAluno = Nomes[i];
				}
			} 
		
		System.out.println("NOTA MAIS ALTA: " + melhorAluno + " - " + (menor));
		System.out.println("NOTA MAIS BAIXA: " + piorAluno + " - " + (maior));
	
		return melhorAluno;
	}
}
