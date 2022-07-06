//Calculadora de equação do segundo grau
package ifelse;

import java.util.Scanner;

public class EquacaoSegGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double A;
		double B;
		double C;
		double delta;
		double XI;
		double XII;
		
		System.out.println("Dado a estrutura Ax² + Bx + C = 0 , Escreva: ");
		
		
		System.out.println(" Valor de A: ");
		A = sc.nextDouble();
		
		System.out.println(" Valor de B: ");
		B = sc.nextDouble();
		
		System.out.println(" Valor de C: ");
		C = sc.nextDouble();
				
			delta = B*B - 4*A*C;
			XI = -B + java.lang.Math.sqrt(delta)/2*A; //The java.lang.Math.sqrt(double a) returns the correctly rounded positive square root of a double value.
			XII = -B - java.lang.Math.sqrt(delta)/2*A;
			
			if (delta < 0) {
				System.out.println(" Não existem raízes reais para essa equação. ");
			
			}else{
			
				System.out.println(" Valor de xI = " + XI);
				
				System.out.println(" Valor de xII = " + XII);
			
			}
	}
}
