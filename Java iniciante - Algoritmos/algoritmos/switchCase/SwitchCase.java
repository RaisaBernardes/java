/*
	 * A declaração condicional switch testa o valor de uma variável, e dependendo
	 * do valor contido nessa variável, permite executar uma entre múltiplas
	 * escolhas de ações. Desta forma, é possível substituir múltiplos “ifs”
	 * encadeados por um código mais simples de criar, entender e manter
	 * posteriormente.
	 */

package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		  
		Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Entre com um número entre 1 e 4:");
		  
		int num = entrada.nextInt();
		  
		switch (num) {  //Analise a variável "num"
		     case 1: 	//O valor dela é "1"?
		       System.out.println("Você escolheu 1"); //Se sim, imprime essa linha.
		       break;   //A instrução "break" é usada dentro do switch para encerrar uma sequência de
				 	    //instruções. Ela é opcional. Se omitido, a execução continuará no próximo caso
				
		     case 2:
		       System.out.println("Você escolheu 2");
		       break;
		       
		     case 3:
		       System.out.println("Você escolheu 3");
		       break;
		       
		     case 4:
		       System.out.println("Você escolheu 4");
		       break;
		       
		     default:
		       System.out.println("Número inválido");
		  }
	}

}