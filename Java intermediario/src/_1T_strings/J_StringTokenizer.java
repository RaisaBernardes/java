package _1T_strings;

import java.util.StringTokenizer;

public class J_StringTokenizer {

	//A classe StringTokenizer � similar ao split, mas ao inv�s de extrair a string em um array, vamos extrair tokens
	//Utiliza-se bastante na leitura de arquivos com java
	
	public static void main(String[] args) {
			
			String doArquivo = "1;Ant�nio;30;";
			
			//Separar uma string grande em strings pequenas
			
			StringTokenizer st = new StringTokenizer(doArquivo, ";"); //Par�metros: string que queremos extrair as infroma�oes e o separador
			
			while (st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
	}
}
