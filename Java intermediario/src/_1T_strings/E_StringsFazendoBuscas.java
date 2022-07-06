package _1T_strings;

public class E_StringsFazendoBuscas {
	
	//Fazendo buscas dentro de uma string com: indexOf, lastIndexOf e contains
	
	public static void main(String[] args) {
			
			String banana = "banana";
			String ana = "ana";
	
			System.out.println(banana.indexOf('x')); //retorna o índice do caracter 'x', e '-1' quando não existe.
			System.out.println(banana.indexOf('b'));
			System.out.println(banana.indexOf('a')); //retorna a 1ª vez que o 'a' aparece na string
			
			System.out.println(banana.indexOf(ana)); //retorna 1 pois o "ana" começa a partir do índice 1
			
			System.out.println(banana.lastIndexOf('a')); //A ultima vez que o 'a' aparece é no índice 5, logo retorna 5
			System.out.println(banana.lastIndexOf(ana)); //O 'a' do 'ana' termina no índice 3, logo retorna 3
			
			//Retorna 'true' se a string contém aquela palavra, caracter, ou conteúdo de variavel, e 'false' se não. 
			System.out.println(banana.contains(ana)); 
			System.out.println(banana.contains("ceu"));
		}

}
