package _1T_strings;

public class F_StringsModificandoUmaString {
	
	//Modificando ou extraindo parte de uma String (substring, concat, replace, trim)
	//Esses s�o os m�todo mais utilizados quando estamos trabalhando com strings
	

	public static void main(String[] args) {
			
			String teste = "Isso � um teste.";
			
			//O m�todo substring � muito utilizado quando trabalhamos com integra��o de sistemas, com um tipo de arquivo especial 'flatfile'
			System.out.println(teste);
			System.out.println(teste.substring(10)); //imprime a partir do 10� caracter
			System.out.println(teste.substring(10, 15)); //imprime do �ndice 10 ao 14. O �ndice 10 � inclusivo, o 15 n�o �.
	
			//N�o � muito utilizado no dia a dia
			String ola = "ol�";
			String mundo = " mundo";
			String olaMundo = ola.concat(mundo); //a mesma coisa que fazer -->> ola + mundo
			System.out.println(olaMundo);
			
			//o m�todo replace() "corrige" determinado caracter trocando o errado pelo certo
			String espacos = "i s p a � o";
			String semEspacos = espacos.replace('i', 'e'); //Tradu��o = "Troque o 'i' pelo 'e'"
			System.out.println(semEspacos);
			
			//Retira todos os espa�os
			//No m�todo replaceAll(regex, replacement) trabalamos com "express�es regulares", t�pico MUITO importante em qualquer linguagem
			semEspacos = semEspacos.replaceAll(" ", ""); //Tradu��o = troque todos os espa�os " " por uma string vazia "".
			System.out.println(semEspacos);
			
			
			//Em banco de dados, quando vamos guardar algum dado, guardamos apenas com espa�os entre as palavras. Espa�os no inicio e no final n�o s�o bem vindos
			String nome = " meu nome �: "; //espa�o antes e depois
			System.out.println(nome);
			System.out.println(nome.trim()); //O m�todo trim() remove todos os espa�os antes e depois da string.
			
		/*
		 * Quando nosso sistema precisa conversar com outro sistema, existem v�rias
		 * maneiras de fazer isso, e a forma mais atual � atrav�s de web services. No entanto,
		 * alguns sistemas s�o muito antigos ou talvez n�o tenha um web
		 * service disponivel ou uma outra API, sendo assim, para conversar com outros sistemas
		 * e enfim trocar informa��es, n�s utilizamos ARQUIVOS de diversos formatos (XML,
		 * .csv, .txt). quando fazemos integra��o com mainframes � muito comum trocar
		 * arquivos chamados "flat file", que s�o arquivos simples txt que possuem
		 * dados. Essas informa��es podem estar estruturadas de formas diferentes:
		 * 
		 * Ex.1.: cod;nome;idade;
		 * 		  1;Ant�nio;30;
		 * 		  2;Ana;25;
		 * 		  3;Larissa;45;
		 * 
		 * 
		 *  Ex.2.:  cod	  	nome		idade
		 * 			1		Ant�nio		30
		 *  		2		Ana			25
		 *  		2		Larissa		45
		 *  
		 *  (Tradu��o = do caracter 1 ao 6 � referente ao codigo, do caracter 7 ao 14 � referente a nome, do caracter 15 ao 18 � referente a idade)
		 *  
		 *  - Para ler informa��es assim (Ex. 2) seria muito util utilizar o .substring() e o .trim()
		 *  
		 */
		}
	
}
