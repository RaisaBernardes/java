package _1T_strings;

public class H_StringsJuntandoSeparando {

	//Como juntar string usando o m�todo join() e como separar string usando o m�todo split().
	
	public static void main(String[] args) {
			
		
			String alfabeto = String.join(", ", "A", "B", "C", "D"); //utiliza��o do varargs (n�mero de par�metros indefinido)
			//Tradu��o = Juntar todos os elementos atrav�s de uma v�rgula (primeiro parametro), e os par�metro a serem juntados
			System.out.println(alfabeto);
	
			
			String[] letras = alfabeto.split(", ");
			for (String letra : letras){
				System.out.println(letra);
			}
			
			
			//O m�todo split � muito util para ler arquivos flatfile que utilizam um delimitador espec�fico, exemplo ";".
			//O exemplo abaixo � parecido com a vida real, no entanto, ao inv�s de ler apenas uma linha, n�s teriamos um arquivo 
			//com N linhas, leriamos todas as linhas e fariamos alguma coisa com essa informa��o, como salvar em um banco de dados.
			
			String doArquivo = "1;Ant�nio;30;";
			String[] infos = doArquivo.split(";"); //Tradu��o = separe os caracteres que estiverem entre ";"
			Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), //Aqui o compilador reclama e pede para transformar os n�meros de string em inteiros.
					infos[1], Integer.parseInt(infos[2]));
			System.out.println(pessoa);
		}
}
