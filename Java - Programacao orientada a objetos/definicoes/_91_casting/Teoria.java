/*DEFINI��O:

Casting � a transforma��o de uma determinada vari�vel com valor / refer�ncia de tipo menos espec�fico para uma vari�vel 
de tipo mais espec�fico e vice-versa.

TIPOS DE CASTING:

- Impl�cito (Upcasting) � quando transformamos uma vari�vel com valor/refer�ncia de tipo mais espec�fico em uma
vari�vel de tipo menos espec�fico, ou seja, estamos subindo na nossa hierarquia, esse tipo de cast � realizado 
automaticamente.
Este ocorre em tempo de COMPILA��O

- Expl�cito (downcasting) � quando transformamos uma vari�vel com valor/refer�ncia de tipo menos espec�fico 
em uma vari�vel de tipo mais espec�fico, ou seja, estamos descendo na nossa hierarquia, esse tipo de cast � realizado 
manualmente.
Este ocorre em tempo de EXECU��O


Para realizar a convers�o de tipo de classe, temos que seguir estas duas regras da seguinte forma:
- As classes devem ser "�-Um-Relacionamento"
- Um objeto deve ter a propriedade de uma classe na qual ele ir� converter.

*/

package _91_casting;

public class Teoria {
	
	
	//Exemplo de upcasting >>> Atribuir uma variavel filha � uma variavel pai
	
	String exampleString = new String("Hello World");
	Object exampleObject = exampleString;
	
	//Exemplo de downcasting  >>> Atribuir uma variavel pai � uma variavel filha
	
	Object exampleOject = new String("Hello World"); //Criando um objeto de classe pai mas referenciando-o a uma classe filha
	String exampleString2 = (String) exampleObject;

}
