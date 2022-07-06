package _1T_strings;


public class A_StringsConstrutores {

	public static void main(String[] args) {
		//Formas de declarar e atribuir strings
		
		String vazia = new String(); //É o mesmo que -> " ". É uma string vazia.
		System.out.println(vazia);

		
		String java = new String("JAVA");
		System.out.println(java);
		
		//Apesar da variável java1 ser uma "cópia" da variável "java" acima, a referência de memória é diferente
		//pois utilizamos o "new". É um novo objeto.
		String java1 = new String(java);
		System.out.println(java1);
		
		
		char[] charsJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		
		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String(abcdef, 0, 3);
		System.out.println(abc);
		
		
		byte[] ascii = {65, 66, 67, 68, 69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		//Quando fazemos uma atribuição simples, como nos dois casos abaixo, existe uma espécie de uma memoria pool, ou seja, um lugar
		//especial aonde são criadas as strings através de atribuição simples. Quando criamos a variável "java4" com o mesmo
		//valor "JAVA", o Java faz uma cópia da variável que já existe com a mesma referência na memória.
		//Se debugarmos o programa, veremos que as duas variáveis abaixo possuem o mesmo id, diferente de quando utilizamos o "new".
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		
		System.out.println(java3);
		System.out.println(java4);
	}

}