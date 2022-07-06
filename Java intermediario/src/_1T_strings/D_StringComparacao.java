package _1T_strings;

public class D_StringComparacao {
	
	//Comparação de Strings: equalsIgnoreCase, regionMatches, startsWith, endsWith, compareTo

public static void main(String[] args) {
		
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true

		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true
		
		System.out.println("ola == ola1 " + (ola == ola2)); //false
		System.out.println("ola == ola3 " + (ola == ola3)); //true  --->> Porque eles possuem o mesmo id (as variáveis estão no pool)
		
		System.out.println("ola == ola4 " + (ola == ola4)); //false
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true  --->>> Porque o conteúdo é o mesmo
		System.out.println("ola equalsIgnoreCase ola4 = " + ola.equalsIgnoreCase(ola4)); //true
		
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		//o regionMatches() compara uma parte da string e retorna true ou false
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3)); //Aqui compara com o equalsIgnoreCase
		
		System.out.println(banana.endsWith(ana)); //verifica o final da string
		System.out.println(banana.startsWith(ban)); //verifica o inicio da string
		
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		//O método compareTo() é muito utilizado quando estamos trabalhando com coleção de objetos e queremos fazer ordenação (colocar em ordem alfabética, etc)
		//Esse método também é utilizado para outros tipos que não Strings
		//Existe ainda a interface Comparable onde nós implementamos ela e colocamos esse método dentro das nossas classes.
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo)); //32 -->> É a diferença na tabela ascii
		
		//-1 quando a > b
		//0 quando a == b
		//1 ou > 1 quando a < b
	}
	
}
