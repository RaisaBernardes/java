//Imputar os nomes de times de futebol em um vetor e definir quem jogará contra quem de forma que todos os times joguem.

package vetores;

import java.util.Scanner;

public class TimesFutebol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidade= 3;
		String time[] = new String [quantidade];
		String time2[] = new String [quantidade];
		
		for(int i= 0; i<quantidade; ++i){
			System.out.println("Digite nome do " + (i+1) + "º time: ");
			time[i]= sc.next();
			time2[i] = time[i];
		}

		for(int i= 0; i<quantidade; ++i){
			for(int j= 0; j<quantidade; ++j){
				if(!time[i].equals(time2[j]) ){
				System.out.println(time[i] + " x " + time2[j]);
			
				}
			}
		}
	}
}
