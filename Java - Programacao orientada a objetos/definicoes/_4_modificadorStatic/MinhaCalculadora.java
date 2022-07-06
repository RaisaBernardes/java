/*---------MODIFICADOR DE ACESSO STATIC---------
 O especificador STATIC confere economia de memória e a possibilidade de troca de informações entre os objetos da classe
 O uso do modificador STATIC em um atributo de classe, por exemplo, torna esse atributo possível de ser inicializado 
 em qualquer parte da classe, mas quando recebe um valor, ele é compartilhado com todos os objetos da classe. 
 Isso significa que os atributos estáticos de uma classe são compartilhados por todas as instâncias dessa classe. 
 
 Os atributos estáticos normalmente são utilizados na padronização de valores (constantes) dentro do projeto/sistema, 
 visando compartilhamento de informações entre os objetos e para acesso direto aos atributos da classe sem a necessidade 
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