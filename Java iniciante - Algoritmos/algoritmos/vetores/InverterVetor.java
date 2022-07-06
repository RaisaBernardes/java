//Inverter a ordem dos valores de um vetor.

package vetores;

import java.util.Scanner;

public class InverterVetor {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe a quantidade de elementos: ");
		int quantidade= sc.nextInt();
		
		int[]valores= new int[quantidade];
		int[]vetorAuxiliar= new int[quantidade];
		int copia;
		int auxiliar = quantidade;
	
		System.out.println("Informe os valores de cada elemento: ");
		
		for(int i=0; i<quantidade; ++i){
			valores[i]= sc.nextInt();
			vetorAuxiliar[i] = valores[i];
		}
		
		for (int i = 0; i < quantidade; ++i) {
			copia = valores[i];
			vetorAuxiliar[auxiliar-1] = copia;
			--auxiliar;
		}
	
		for(int i=0; i<quantidade; ++i){
			System.out.println(vetorAuxiliar[i] + "");
		}
	}
}
