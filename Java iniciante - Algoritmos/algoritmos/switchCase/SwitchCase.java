/*
	 * A declara��o condicional switch testa o valor de uma vari�vel, e dependendo
	 * do valor contido nessa vari�vel, permite executar uma entre m�ltiplas
	 * escolhas de a��es. Desta forma, � poss�vel substituir m�ltiplos �ifs�
	 * encadeados por um c�digo mais simples de criar, entender e manter
	 * posteriormente.
	 */

package switchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		  
		Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Entre com um n�mero entre 1 e 4:");
		  
		int num = entrada.nextInt();
		  
		switch (num) {  //Analise a vari�vel "num"
		     case 1: 	//O valor dela � "1"?
		       System.out.println("Voc� escolheu 1"); //Se sim, imprime essa linha.
		       break;   //A instru��o "break" � usada dentro do switch para encerrar uma sequ�ncia de
				 	    //instru��es. Ela � opcional. Se omitido, a execu��o continuar� no pr�ximo caso
				
		     case 2:
		       System.out.println("Voc� escolheu 2");
		       break;
		       
		     case 3:
		       System.out.println("Voc� escolheu 3");
		       break;
		       
		     case 4:
		       System.out.println("Voc� escolheu 4");
		       break;
		       
		     default:
		       System.out.println("N�mero inv�lido");
		  }
	}

}