/*
*********OBSERVA��ES**********
- Enums extends a classe java.lang.Enum
- Enums podem ser comparados utilizando ==, diferente da compara��o de classes no java que utiliza-se o m�todo equals.
- Enums n�o podem ser instanciadas com new
- N�o existe heran�a em uma classe enum
- Podem implementar interfaces
- Pode ser declarado separadamente ou dentro de classe
- N�o se deve criar setters para as propriedades de um enum, pois isso vai de encontro com sua caracter�stica imut�vel.

********M�todo values()********
Os valores Enum tem um m�todo est�tico chamado values que retorna uma matriz contendo todos os valores do enum na ordem 
em que s�o declarados. Este m�todo � normalmente usado em combina��o com o "for" para construir cada repeti��o dos valores 
de um tipo de enumera��o.


********M�todo valueOf()********

Todos os objetos em Java possuem um m�todo toString que permite obter a representa��o em string do objeto em quest�o, 
por exemplo, para fins de exibi��o. Por�m, os tipos primitivos (como int, float, boolean, char, etc.) n�o possuem esse 
m�todo. No entanto, ainda assim, � poss�vel obter a representa��o de string de um tipo primitivo usando um m�todo especial pertencente � 
classe String: o m�todo valueOf.

Resumindo: O m�todo valueOf() retorna o objeto da classe enum cujo nome � a string do argumento.

Ex.: Integer num18 = Integer.valueOf(1343); //Transforma um tipo inteiro em uma inst�ncia da classe Integer

*/


package _1B_enum_como_classe_construtor_e_metodos;

public class Teoria {

}
