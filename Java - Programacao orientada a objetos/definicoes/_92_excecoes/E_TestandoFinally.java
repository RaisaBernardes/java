/*O finally � utilizado em situa��es espec�ficas, como por exemplo nas situa��es em que precisamos:
	- Abre arquivo
	- Realiza leitura
	- Ocorre o erro
	- Fecha arquivo no finally
	
Uma outra situa��o � com o acesso a banco de dados, em que precisamos:
- Abrir uma conex�o com o banco de dados
- Tentar fazer alguma coisa dentro do banco (inserir informa��o, buscar, etc) e a� fazemos isso dentro do bloco "try".
- Independente de ocorrer sucesso ou erro, n�s precisamos fechar a conex�o com o banco de dados, 
  e na hora de fechar essa conex�o, fazemos isso dentro do bloco "finally".
	
	
*/


package _92_excecoes;

public class E_TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			try{ //Tenta executar o c�digo
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e){ //O "catch" captura a exce��o
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posi��o do array inv�lida"); 
			}
			finally { //Vai ser executado independente se o c�digo foi executado com sucesso ou se ocorreu uma exce��o
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");
			}
		}

	}

}