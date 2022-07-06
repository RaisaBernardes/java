//Inserir determinado valor e verificar se este encontra-se no vetor.
package vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Informe quantidade de elementos: ");
		int quantidade= sc.nextInt();
		
		int[]valores= new int[quantidade];
		
		System.out.println("Informe os valores desejados: ");
		
		for(int i= 0; i< quantidade; ++i){
			valores[i]= sc.nextInt();
		}
		
		System.out.println("Insira determinado valor e verifique se este encontra-se no vetor. ");
		int valor= sc.nextInt();

		for(int i= 0; i<quantidade; ++i){
		
			if (valores[i] == valor){
				System.out.println("O vetor contem esse valor! ");
			}
		}
	}
}
