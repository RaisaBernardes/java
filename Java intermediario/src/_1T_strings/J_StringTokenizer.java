package _1T_strings;

import java.util.StringTokenizer;

public class J_StringTokenizer {

	//A classe StringTokenizer é similar ao split, mas ao invés de extrair a string em um array, vamos extrair tokens
	//Utiliza-se bastante na leitura de arquivos com java
	
	public static void main(String[] args) {
			
			String doArquivo = "1;Antônio;30;";
			
			//Separar uma string grande em strings pequenas
			
			StringTokenizer st = new StringTokenizer(doArquivo, ";"); //Parâmetros: string que queremos extrair as infromaçoes e o separador
			
			while (st.hasMoreTokens()){
				System.out.println(st.nextToken());
			}
	}
}
