package forr;
import java.util.Scanner;

public class Tabuada1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		for(int numero = 0; numero <= 10; ++numero){
			
			System.out.println("1 x " + numero + " = " + numero*1);
		}
		for(int numero = 0; numero <= 10; ++numero){
			
			System.out.println("2 x " + numero + " = " + numero*2);
		}
		for(int numero = 0; numero <= 10; ++numero){
			
			System.out.println("3 x " + numero + " = " + numero*3);
		}
		for(int numero = 0; numero <= 10; ++numero){
			
			System.out.println("4 x " + numero + " = " + numero*4);
		}
		for(int numero = 0; numero <= 10; ++numero){
			
			System.out.println("5 x " + numero + " = " + numero*5);
		}
	}
}

