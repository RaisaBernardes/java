/*Palavra chave: Throws

Usamos quando não queremos tratar uma exceção, ou seja, quando não queremos colocar um try e catch no método.
Utilizandoo o throws:
	
	- O método pode disparar uma Exception
	- Passa a responsabilidade de tratar a exceptionpra quem for utilizar o método
	- Exceptions disparadas em tempo de execução (ArrayOutOfBounds, Arithmetic) não necessitam de throws explicitamente.

É ÚTIL PARA:

- Quando você está construindo uma API, ou seja, construindo uma biblioteca para que outros desenvolvedores possam
utiliza-la. 

- Quando estamos trabalhando com Java web pois geralmente não ficamos tratando essas exceções em todo canto
do código. Existe um lugar específico onde vamos tratar essas exceções para que possamos retornar um erro mais amigável 
para o usuário.

*/

package _92_excecoes;

import java.util.Scanner;

public class H_UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um número decimal");
		try { //Tratando a exceção, já que usamos um throws no método lenumero().
			double num = leNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace(); //usado à nivel de log
		}

	}

	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}