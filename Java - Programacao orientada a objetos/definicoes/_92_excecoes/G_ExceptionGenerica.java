package _92_excecoes;

public class G_ExceptionGenerica {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			
			try{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			//Na vida real fazemos dessa forma
			//Error: 
			catch(Exception e){ 
				System.out.println(e.getMessage()); //retorna a descri��o do erro
				e.printStackTrace(); //imprime o stacktrace (rastreamento) do erro 
				
				/*
				 * getMessage() e printStackTrace() s�o m�todos da classe Throwable do Java e
				 * servem para ajudar o desenvolvedor a descobrir aonde foi que o erro ocorreu.
				 * Em projetos reais essas informa��es n�o ser�o jogadas para o console, mas sim
				 * para um arquivo de log para que depois esse arquivo seja acessado por um
				 * desenvolvedor para ver onde ocorreu aquele erro.
				 * 
				 * Error: resulta na finaliza��o do programa
				 * Exception: poss�vel tratar o erro e continuar a execu��o do programa
				 */
				
			}
		}
		
	}
}
