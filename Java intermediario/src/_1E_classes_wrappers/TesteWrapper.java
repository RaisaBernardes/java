package _1E_classes_wrappers;

/*
 - Classes Wrappers s�o as classes que representam os tipos primitivos no java.
 - O java n�o � 100% orientado a objetos, por causa dos tipos primitivos. 
 - Todas as classes wrappers eu consigo transformar um tipo em outro.
*/

public class TesteWrapper {

	public static void main(String[] args) {
		
		short num1 = 1; //� capaz de armazenar valores entre � 32768 at� 32767.
		byte num2 = 10; //� capaz de armazenar valores entre -128 at� 127.
		int num3 = 100; //� capaz de armazenar valores entre �2147483648 at� 2147483647.
		long num4 = 10000l; //� capaz de armazenar valores entre �9223372036854775808 at� 9223372036854775807.
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';
		
		//Instanciando as classes primitivas
		Short num7 = new Short((short) 1); //casting obrigat�rio
		Byte num8 = new Byte((byte) 10); //casting obrigat�rio
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		
		//As classes wrappers "Boolean" e "Character" tem como super classe a classe Object, enquanto as outras acima
		//tem como superclasse a classe Number
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		
		//Op��o de par�metro como string
		Integer num13 = new Integer("100"); //Pode disparar a exce��o NumberFormatException
		
		Double num14 = new Double("3.5"); //3,5 para quem usar PC Portugu�s Brasil
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue(); //O m�todo "longValue" retornar� o valor num�rico representado por este objeto como long (caso fosse de outro tipo, como float, por exemplo)
		
		//O parseInt transforma o inteiro em string
		int num16 = Integer.parseInt("100000"); //Pode disparar a exce��o NumberFormatException
		
		//O parseDouble transforme double em string
		double num17 = Double.parseDouble("3.555"); //Pode disparar a exce��o NumberFormatException
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1343); //Transforma um tipo inteiro em uma inst�ncia da classe Integer
		System.out.println(num18);
		
		System.out.println(num9 == num13); //== n�o funciona com wrappers, Deve-se utilizar o "equals".
	}

}