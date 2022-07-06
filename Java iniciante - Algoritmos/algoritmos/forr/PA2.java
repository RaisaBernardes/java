package forr;

import java.util.Scanner;

public class PA2 {

	public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			int primeiro=1;
			int segundo= primeiro+3;
			
			System.out.println(primeiro);
			System.out.println(segundo);
			
			for(int i=1; i< 23; ++i){
				primeiro = segundo;
				segundo = primeiro + 3;
				
				System.out.println(segundo);
			}
		
		}

}
