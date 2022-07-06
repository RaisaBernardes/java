/*DEFINIÇÃO:

Casting é a transformação de uma determinada variável com valor / referência de tipo menos específico para uma variável 
de tipo mais específico e vice-versa.

TIPOS DE CASTING:

- Implícito (Upcasting) é quando transformamos uma variável com valor/referência de tipo mais específico em uma
variável de tipo menos específico, ou seja, estamos subindo na nossa hierarquia, esse tipo de cast é realizado 
automaticamente.
Este ocorre em tempo de COMPILAÇÃO

- Explícito (downcasting) é quando transformamos uma variável com valor/referência de tipo menos específico 
em uma variável de tipo mais específico, ou seja, estamos descendo na nossa hierarquia, esse tipo de cast é realizado 
manualmente.
Este ocorre em tempo de EXECUÇÃO


Para realizar a conversão de tipo de classe, temos que seguir estas duas regras da seguinte forma:
- As classes devem ser "É-Um-Relacionamento"
- Um objeto deve ter a propriedade de uma classe na qual ele irá converter.

*/

package _91_casting;

public class Teoria {
	
	
	//Exemplo de upcasting >>> Atribuir uma variavel filha à uma variavel pai
	
	String exampleString = new String("Hello World");
	Object exampleObject = exampleString;
	
	//Exemplo de downcasting  >>> Atribuir uma variavel pai à uma variavel filha
	
	Object exampleOject = new String("Hello World"); //Criando um objeto de classe pai mas referenciando-o a uma classe filha
	String exampleString2 = (String) exampleObject;

}
