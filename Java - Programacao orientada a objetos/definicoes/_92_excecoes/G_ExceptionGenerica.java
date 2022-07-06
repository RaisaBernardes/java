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
				System.out.println(e.getMessage()); //retorna a descrição do erro
				e.printStackTrace(); //imprime o stacktrace (rastreamento) do erro 
				
				/*
				 * getMessage() e printStackTrace() são métodos da classe Throwable do Java e
				 * servem para ajudar o desenvolvedor a descobrir aonde foi que o erro ocorreu.
				 * Em projetos reais essas informações não serão jogadas para o console, mas sim
				 * para um arquivo de log para que depois esse arquivo seja acessado por um
				 * desenvolvedor para ver onde ocorreu aquele erro.
				 * 
				 * Error: resulta na finalização do programa
				 * Exception: possível tratar o erro e continuar a execução do programa
				 */
				
			}
		}
		
	}
}
