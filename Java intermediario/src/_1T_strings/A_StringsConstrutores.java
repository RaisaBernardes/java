package _1T_strings;


public class A_StringsConstrutores {

	public static void main(String[] args) {
		//Formas de declarar e atribuir strings
		
		String vazia = new String(); //� o mesmo que -> " ". � uma string vazia.
		System.out.println(vazia);

		
		String java = new String("JAVA");
		System.out.println(java);
		
		//Apesar da vari�vel java1 ser uma "c�pia" da vari�vel "java" acima, a refer�ncia de mem�ria � diferente
		//pois utilizamos o "new". � um novo objeto.
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
		
		//Quando fazemos uma atribui��o simples, como nos dois casos abaixo, existe uma esp�cie de uma memoria pool, ou seja, um lugar
		//especial aonde s�o criadas as strings atrav�s de atribui��o simples. Quando criamos a vari�vel "java4" com o mesmo
		//valor "JAVA", o Java faz uma c�pia da vari�vel que j� existe com a mesma refer�ncia na mem�ria.
		//Se debugarmos o programa, veremos que as duas vari�veis abaixo possuem o mesmo id, diferente de quando utilizamos o "new".
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		
		System.out.println(java3);
		System.out.println(java4);
	}

}