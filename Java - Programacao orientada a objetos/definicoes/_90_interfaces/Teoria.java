/*-------INTERFACES-------
 
 
 DEFINI��O:

Uma Interface no Java � definida como um tipo abstrato usado para especificar o comportamento de uma classe. 
� um modelo de uma classe. 


CARACTER�STICAS:

- Cont�m constantes est�ticas
- Os m�todos declarados em uma interface s�o abstratos por padr�o (somente assinatura de m�todo, sem corpo).


POR QUE USAR INTERFACES?

- � usado para alcan�ar a abstra��o total.
- Como java n�o suporta heran�as m�ltiplas no caso de classe, usando uma interface ele pode obter heran�as m�ltiplas.



INTERFACES X CLASSES ABSTRATAS:

Classes abstratas podem conter vari�veis n�o finais, j� vari�veis na interface s�o finais, p�blicas e est�ticas.


PONTOS IMPORTANTES:

- N�o podemos criar uma inst�ncia (a interface n�o pode ser instanciada) da interface, mas podemos fazer a refer�ncia dela 
  que se refere ao Objeto de sua classe de implementa��o.
- Uma classe pode implementar mais de uma interface.
- Uma interface pode se estender para outra interface ou interface (mais de uma interface).
- Uma classe que implementa a interface deve implementar todos os m�todos da interface.
- Todos os m�todos de uma interface s�o p�blicos e abstratos. E todos os campos s�o p�blicos, est�ticos e finais.
- Se uma classe implementa uma interface e n�o fornece corpos de m�todo para todas as fun��es especificadas 
  na interface, a classe deve ser declarada abstrata.
*/


package _90_interfaces;

public class Teoria {

}
