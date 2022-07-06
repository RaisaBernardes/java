/*-------INTERFACES-------
 
 
 DEFINIÇÃO:

Uma Interface no Java é definida como um tipo abstrato usado para especificar o comportamento de uma classe. 
É um modelo de uma classe. 


CARACTERÍSTICAS:

- Contém constantes estáticas
- Os métodos declarados em uma interface são abstratos por padrão (somente assinatura de método, sem corpo).


POR QUE USAR INTERFACES?

- É usado para alcançar a abstração total.
- Como java não suporta heranças múltiplas no caso de classe, usando uma interface ele pode obter heranças múltiplas.



INTERFACES X CLASSES ABSTRATAS:

Classes abstratas podem conter variáveis não finais, já variáveis na interface são finais, públicas e estáticas.


PONTOS IMPORTANTES:

- Não podemos criar uma instância (a interface não pode ser instanciada) da interface, mas podemos fazer a referência dela 
  que se refere ao Objeto de sua classe de implementação.
- Uma classe pode implementar mais de uma interface.
- Uma interface pode se estender para outra interface ou interface (mais de uma interface).
- Uma classe que implementa a interface deve implementar todos os métodos da interface.
- Todos os métodos de uma interface são públicos e abstratos. E todos os campos são públicos, estáticos e finais.
- Se uma classe implementa uma interface e não fornece corpos de método para todas as funções especificadas 
  na interface, a classe deve ser declarada abstrata.
*/


package _90_interfaces;

public class Teoria {

}
