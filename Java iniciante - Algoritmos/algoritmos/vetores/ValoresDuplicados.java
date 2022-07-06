package vetores;
import java.util.Scanner;

public class ValoresDuplicados {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe a quantidade de elementos: ");
		int quantidade= sc.nextInt();
		
		int[]valores= new int[quantidade];
		int[]armazenador=new int[10]; //added
		
	
		System.out.println("Informe os valores de cada elemento: ");
		
		for(int i=0; i<quantidade; ++i){
			valores[i]= sc.nextInt();
		}

		for(int i=0; i<quantidade; ++i){
			for(int j=0; j< quantidade; ++j) {
				if(valores[i] == valores[j] && i != j){  // i != j -> pq como é o mesmo array vão dar valores iguais.
					
					System.out.println(" posição " + i + " e posição " + j + " são numeros iguais.");
				}
			}
		}	
	}
}


