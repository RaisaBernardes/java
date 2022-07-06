package _1T_strings;

public class I_StringsConcatenacao {
	
	//Concatena��o com StringBuilder e StringBuffer
	
	public static void main(String[] args) {

		String[] letras = {"B", "C", "D", "E", "F"};

		String alfabeto = "";
		
		//Problema de performance (A cada jun��o de letra, uma nova refer�ncia)
		
		for (String letra : letras){
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
		//Forma mais elegante: Utilizar o StringBuffer() do pacote java.lang
		
		//O StringBuffer() � thread safe, ou seja, se estivermos trabalhando num ambiente com mais de uma thread, trabalhamos com ele para n� dar problema
		StringBuffer sb = new StringBuffer(); //construtor padr�o, mas pode passar uma capacidade em bytes
		for (String letra : letras){
			sb.append(letra); //O m�todo append() da classe StringBuffer se torna �til quando precisamos adicionar mais conte�do ao final de um objeto desta classe.
		}
		
		//forma 1
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		
		//forma 2
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		
		System.out.println(sb.reverse()); //imprime a String ao contr�rio
		
		
		//O StringBuilder() tem a mesma fun��o do StringBuffer(), mas ele N�O � thread safe.
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
	}

}
