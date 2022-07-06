/*---------MODIFICADOR DE ACESSO STATIC---------
 O especificador STATIC confere economia de mem�ria e a possibilidade de troca de informa��es entre os objetos da classe
 O uso do modificador STATIC em um atributo de classe, por exemplo, torna esse atributo poss�vel de ser inicializado 
 em qualquer parte da classe, mas quando recebe um valor, ele � compartilhado com todos os objetos da classe. 
 Isso significa que os atributos est�ticos de uma classe s�o compartilhados por todas as inst�ncias dessa classe. 
 
 Os atributos est�ticos normalmente s�o utilizados na padroniza��o de valores (constantes) dentro do projeto/sistema, 
 visando compartilhamento de informa��es entre os objetos e para acesso direto aos atributos da classe sem a necessidade 
 de existir algum objeto instanciado dessa classe.
 */


package _4_modificadorStatic;

public class MinhaCalculadora {

	public static int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public static double soma(double num1, double num2){
		return num1 + num2;
	}
	
	public static int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public static int soma(int[] vetorInteiros){
		
		int total = 0;
		
		for (int i=0; i<vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		
		return total;
	}
}