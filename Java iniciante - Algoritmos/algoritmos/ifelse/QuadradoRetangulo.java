package ifelse;
//Informando se é um quadrado ou um retângulo
import java.util.Scanner;

public class QuadradoRetangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double lado1;
		double lado2;
		double area;
			
		System.out.println ("Digite valor correspondente ao lado A: ");
			
		lado1 = sc.nextDouble();
		
		System.out.println ("Digite valor correspondente ao lado B: ");
			
		lado2 = sc.nextDouble();
			
			
		if (lado1 == lado2){
				
			System.out.println("A figura geométrica é um quadrado. ");
			
		} else {
				System.out.println("A figura geomátrica é um retângulo. ");
		}
	}
}
	