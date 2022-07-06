package _1T_strings;

public class F_StringsModificandoUmaString {
	
	//Modificando ou extraindo parte de uma String (substring, concat, replace, trim)
	//Esses são os método mais utilizados quando estamos trabalhando com strings
	

	public static void main(String[] args) {
			
			String teste = "Isso é um teste.";
			
			//O método substring é muito utilizado quando trabalhamos com integração de sistemas, com um tipo de arquivo especial 'flatfile'
			System.out.println(teste);
			System.out.println(teste.substring(10)); //imprime a partir do 10º caracter
			System.out.println(teste.substring(10, 15)); //imprime do índice 10 ao 14. O índice 10 é inclusivo, o 15 não é.
	
			//Não é muito utilizado no dia a dia
			String ola = "olá";
			String mundo = " mundo";
			String olaMundo = ola.concat(mundo); //a mesma coisa que fazer -->> ola + mundo
			System.out.println(olaMundo);
			
			//o método replace() "corrige" determinado caracter trocando o errado pelo certo
			String espacos = "i s p a ç o";
			String semEspacos = espacos.replace('i', 'e'); //Tradução = "Troque o 'i' pelo 'e'"
			System.out.println(semEspacos);
			
			//Retira todos os espaços
			//No método replaceAll(regex, replacement) trabalamos com "expressões regulares", tópico MUITO importante em qualquer linguagem
			semEspacos = semEspacos.replaceAll(" ", ""); //Tradução = troque todos os espaços " " por uma string vazia "".
			System.out.println(semEspacos);
			
			
			//Em banco de dados, quando vamos guardar algum dado, guardamos apenas com espaços entre as palavras. Espaços no inicio e no final não são bem vindos
			String nome = " meu nome é: "; //espaço antes e depois
			System.out.println(nome);
			System.out.println(nome.trim()); //O método trim() remove todos os espaços antes e depois da string.
			
		/*
		 * Quando nosso sistema precisa conversar com outro sistema, existem várias
		 * maneiras de fazer isso, e a forma mais atual é através de web services. No entanto,
		 * alguns sistemas são muito antigos ou talvez não tenha um web
		 * service disponivel ou uma outra API, sendo assim, para conversar com outros sistemas
		 * e enfim trocar informações, nós utilizamos ARQUIVOS de diversos formatos (XML,
		 * .csv, .txt). quando fazemos integração com mainframes é muito comum trocar
		 * arquivos chamados "flat file", que são arquivos simples txt que possuem
		 * dados. Essas informações podem estar estruturadas de formas diferentes:
		 * 
		 * Ex.1.: cod;nome;idade;
		 * 		  1;Antônio;30;
		 * 		  2;Ana;25;
		 * 		  3;Larissa;45;
		 * 
		 * 
		 *  Ex.2.:  cod	  	nome		idade
		 * 			1		Antônio		30
		 *  		2		Ana			25
		 *  		2		Larissa		45
		 *  
		 *  (Tradução = do caracter 1 ao 6 é referente ao codigo, do caracter 7 ao 14 é referente a nome, do caracter 15 ao 18 é referente a idade)
		 *  
		 *  - Para ler informações assim (Ex. 2) seria muito util utilizar o .substring() e o .trim()
		 *  
		 */
		}
	
}
