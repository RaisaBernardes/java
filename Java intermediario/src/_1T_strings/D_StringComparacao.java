package _1T_strings;

public class D_StringComparacao {
	
	//Compara��o de Strings: equalsIgnoreCase, regionMatches, startsWith, endsWith, compareTo

public static void main(String[] args) {
		
		String ola = "Ol�";
		String ola2 = "OL�";
		String ola3 = "Ol�";
		String ola4 = new String(ola);
		
		System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); //true

		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true
		
		System.out.println("ola == ola1 " + (ola == ola2)); //false
		System.out.println("ola == ola3 " + (ola == ola3)); //true  --->> Porque eles possuem o mesmo id (as vari�veis est�o no pool)
		
		System.out.println("ola == ola4 " + (ola == ola4)); //false
		System.out.println("ola equals ola4 = " + ola.equals(ola4)); //true  --->>> Porque o conte�do � o mesmo
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
		
		//O m�todo compareTo() � muito utilizado quando estamos trabalhando com cole��o de objetos e queremos fazer ordena��o (colocar em ordem alfab�tica, etc)
		//Esse m�todo tamb�m � utilizado para outros tipos que n�o Strings
		//Existe ainda a interface Comparable onde n�s implementamos ela e colocamos esse m�todo dentro das nossas classes.
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo)); //32 -->> � a diferen�a na tabela ascii
		
		//-1 quando a > b
		//0 quando a == b
		//1 ou > 1 quando a < b
	}
	
}
