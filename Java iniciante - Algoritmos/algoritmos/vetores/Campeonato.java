package vetores;
import java.util.Scanner;

public class Campeonato {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);

		int quantidade;
		int pontuacao;
		int quantidadeDeJogosPorTime;
	
	
		System.out.println("Informe a quantidade de times: ");
		quantidade = sc.nextInt();
		quantidadeDeJogosPorTime = (quantidade - 1)*2;
		
		String[]times = new String[quantidade];
		String[]times2 = new String [quantidade];
		int[]vitorias = new int [quantidade];
		int[]empates = new int [quantidade];
		int[]gols = new int [quantidade];
			
		for(int i = 0; i < quantidade; ++i){
			System.out.println("Informe o nome do " + (i + 1) +  "º time: ");
			times[i] = sc.next();
			times2[i] = times[i];
		} 
		for(int i = 0; i < quantidade; ++i){
			System.out.println((i+1) + "º time " + " = " + times[i] );
		}
		
		//Duplo "for" para garantir que todos competirão contra todos.
		for (int i = 0; i < quantidade; ++i){
			
			for(int j = 0; j < quantidade; ++j){
			
				if(!times[i].equals(times2[j])){ //Garantindo que não ocorra "A x A  ou  B x B"
					
					//if(i > 0 && i != j-1) {
				
					System.out.println("\n" + times[i] + " x " + times2[j]);	
				
					//}
				}
			}	
		}
		
		for (int i = 0; i < quantidade; ++i){
			
			do{
			System.out.println("\nPara o time: " + times[i]);
			
			System.out.println("\nQuantas vitórias? ");
			vitorias[i] = sc.nextInt();
			
			System.out.println("\nQuantos empates? ");
			empates[i] = sc.nextInt();
			
			System.out.println("\nQuantos gols? ");
			gols[i] = sc.nextInt();
			
			}
			while(quantidadeDeJogosPorTime < quantidade);{
				if( vitorias[i] + empates[i] > quantidadeDeJogosPorTime){
					System.out.println("Você informou valores errados. Tente novamente.");
				}
			}
		}
		
		System.out.println("TIME\tVitorias\t\tEmpates\t\t Gols\t\tPontuação");
		for(int i = 0; i < quantidade; ++i){
			
			pontuacao = (vitorias[i]*3) + (empates[i]*1);
			
			System.out.println(times[i] +"\t\t" + vitorias[i] + "\t\t" + empates[i] + "\t\t" + gols[i] + "\t\t" + pontuacao);
		}
	}
}

