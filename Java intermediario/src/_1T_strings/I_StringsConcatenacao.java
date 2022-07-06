package _1T_strings;

public class I_StringsConcatenacao {
	
	//Concatenação com StringBuilder e StringBuffer
	
	public static void main(String[] args) {

		String[] letras = {"B", "C", "D", "E", "F"};

		String alfabeto = "";
		
		//Problema de performance (A cada junção de letra, uma nova referência)
		
		for (String letra : letras){
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
		//Forma mais elegante: Utilizar o StringBuffer() do pacote java.lang
		
		//O StringBuffer() é thread safe, ou seja, se estivermos trabalhando num ambiente com mais de uma thread, trabalhamos com ele para nã dar problema
		StringBuffer sb = new StringBuffer(); //construtor padrão, mas pode passar uma capacidade em bytes
		for (String letra : letras){
			sb.append(letra); //O método append() da classe StringBuffer se torna útil quando precisamos adicionar mais conteúdo ao final de um objeto desta classe.
		}
		
		//forma 1
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		
		//forma 2
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		
		System.out.println(sb.reverse()); //imprime a String ao contrário
		
		
		//O StringBuilder() tem a mesma função do StringBuffer(), mas ele NÃO É thread safe.
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
	}

}
