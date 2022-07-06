//Repetir "Digite um novo valor" até que o usuário digite um numero entre 1 e 100
package whilee;

import java.util.Scanner;

public class Valor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int valor;
		int numero=1;
		
		System.out.println("Digite um valor qualquer: ");
		valor = sc.nextInt();
		
		if (valor >= 1 && valor <= 100){
			System.out.println("Este valor está entre o intervalo requerido.");
		
		} else {
			
			while(valor < 1 || valor > 100){
				
				System.out.println("Este valor está fora do intervalo requerido. ");
				System.out.println("Digite um novo valor: ");
				valor = sc.nextInt();
				
				if(valor >= 1 && valor <= 100) {
					System.out.println("Acertou!");
				}
			}	
		}
	}
}
