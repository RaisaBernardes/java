/*O finally é utilizado em situações específicas, como por exemplo nas situações em que precisamos:
	- Abre arquivo
	- Realiza leitura
	- Ocorre o erro
	- Fecha arquivo no finally
	
Uma outra situação é com o acesso a banco de dados, em que precisamos:
- Abrir uma conexão com o banco de dados
- Tentar fazer alguma coisa dentro do banco (inserir informação, buscar, etc) e aí fazemos isso dentro do bloco "try".
- Independente de ocorrer sucesso ou erro, nós precisamos fechar a conexão com o banco de dados, 
  e na hora de fechar essa conexão, fazemos isso dentro do bloco "finally".
	
	
*/


package _92_excecoes;

public class E_TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			try{ //Tenta executar o código
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e){ //O "catch" captura a exceção
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posição do array inválida"); 
			}
			finally { //Vai ser executado independente se o código foi executado com sucesso ou se ocorreu uma exceção
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			}
		}

	}

}