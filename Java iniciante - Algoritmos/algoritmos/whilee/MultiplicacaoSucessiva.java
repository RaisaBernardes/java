//Multiplicação sucessiva de N por 2
package whilee;

import java.util.Scanner;

public class MultiplicacaoSucessiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int valor;
		int potencia = 1;
		
		System.out.println("Digite um valor qualquer: ");
		valor = sc.nextInt();
		
		while (Math.pow (2, potencia)*valor < 250){
			if(valor >= 1 && valor <= 50){
			
			System.out.println( valor + " x (2 elevado a " + potencia + ") = "
			+ Math.pow (2, potencia)*valor);
			
			++potencia;
			
			}else{
				System.out.println("Valor digitado INVÁLIDO. Digite um valor entre 1 e 50.");
				valor = sc.nextInt();
			}
	
		}
	
	} 

}


