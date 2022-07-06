package _1T_strings;

public class H_StringsJuntandoSeparando {

	//Como juntar string usando o método join() e como separar string usando o método split().
	
	public static void main(String[] args) {
			
		
			String alfabeto = String.join(", ", "A", "B", "C", "D"); //utilização do varargs (número de parâmetros indefinido)
			//Tradução = Juntar todos os elementos através de uma vírgula (primeiro parametro), e os parâmetro a serem juntados
			System.out.println(alfabeto);
	
			
			String[] letras = alfabeto.split(", ");
			for (String letra : letras){
				System.out.println(letra);
			}
			
			
			//O método split é muito util para ler arquivos flatfile que utilizam um delimitador específico, exemplo ";".
			//O exemplo abaixo é parecido com a vida real, no entanto, ao invés de ler apenas uma linha, nós teriamos um arquivo 
			//com N linhas, leriamos todas as linhas e fariamos alguma coisa com essa informação, como salvar em um banco de dados.
			
			String doArquivo = "1;Antônio;30;";
			String[] infos = doArquivo.split(";"); //Tradução = separe os caracteres que estiverem entre ";"
			Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), //Aqui o compilador reclama e pede para transformar os números de string em inteiros.
					infos[1], Integer.parseInt(infos[2]));
			System.out.println(pessoa);
		}
}
