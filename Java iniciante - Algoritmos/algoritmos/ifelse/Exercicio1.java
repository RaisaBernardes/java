package ifelse;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A;
		int B;
		int C;

		System.out.println(" Digite o primeiro número INTEIRO: ");
		A = sc.nextInt();
		
		System.out.println(" Digite o segundo número INTEIRO: ");
		B = sc.nextInt();
		
		System.out.println(" Digite o terceiro número INTEIRO: ");
		C = sc.nextInt();
		
		if (A > B && A > C && B > C) {
			System.out.println( A  +  " > "  +  B  +  " > "  +  C);
		
		} else if (A > B && A > C && C > B){
			System.out.println( A  +  " > "  +  C  +  " > "  +  B);
	
		
		} else if (B > A && B > C && A > C) {
			System.out.println( B  +  " > "  +  A  +  " > "  +  C);
		
		} else if (B > A && B > C && C > A) {
			System.out.println( B  +  " > "  +  C  +  " > "  +  A);
		
		} else if (C > A && C > B && A > B) {
			System.out.println( C  +  " > "  +  A  +  " > "  +  B);
		
		} else if (C > A && C > B && B > A) {
			System.out.println( C +  " > "  +   B  +  " > "  +  A);
		
		} else {
				System.out.println("ERRO");
	}

}

}


