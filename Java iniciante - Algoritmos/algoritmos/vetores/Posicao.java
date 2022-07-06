package vetores;
import java.util.Scanner;

public class Posicao {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int valor=0;
		int quantidadeDeElementos=0;
		
		
		System.out.println("Informe a quantidade de elementos: ");
		quantidadeDeElementos= sc.nextInt();
		
		int[]valores = new int[quantidadeDeElementos];
	
		System.out.println("Informe os valores inteiros de cada elemento: ");
		
		for(int i=0; i<quantidadeDeElementos; ++i){
			valor= sc.nextInt();
			valores[i]= valor;
		}

		System.out.println("Deseja saber a posição de qual elemento do vetor? ");
		int elemento= sc.nextInt();
	
		for(int i=0; i<quantidadeDeElementos; ++i){
			if(valores[i] == elemento){
				System.out.println("O elemento se encontra na " + (i+1) + "º posição");
			}
		}
	}
}
