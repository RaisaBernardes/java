/*Palavra chave: Throws

Usamos quando n�o queremos tratar uma exce��o, ou seja, quando n�o queremos colocar um try e catch no m�todo.
Utilizandoo o throws:
	
	- O m�todo pode disparar uma Exception
	- Passa a responsabilidade de tratar a exceptionpra quem for utilizar o m�todo
	- Exceptions disparadas em tempo de execu��o (ArrayOutOfBounds, Arithmetic) n�o necessitam de throws explicitamente.

� �TIL PARA:

- Quando voc� est� construindo uma API, ou seja, construindo uma biblioteca para que outros desenvolvedores possam
utiliza-la. 

- Quando estamos trabalhando com Java web pois geralmente n�o ficamos tratando essas exce��es em todo canto
do c�digo. Existe um lugar espec�fico onde vamos tratar essas exce��es para que possamos retornar um erro mais amig�vel 
para o usu�rio.

*/

package _92_excecoes;

import java.util.Scanner;

public class H_UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um n�mero decimal");
		try { //Tratando a exce��o, j� que usamos um throws no m�todo lenumero().
			double num = leNumero();
			System.out.println("Voc� digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
			e.printStackTrace(); //usado � nivel de log
		}

	}

	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}