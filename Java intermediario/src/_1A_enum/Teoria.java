package _1A_enum;


/*
******QUANDO USAR?******
Enums são usados quando conhecemos todos os valores possíveis em tempo de compilação, como opções em um menu, modos de 
arredondamento, sinalizadores de linha de comando, etc. Não é necessário que o conjunto de constantes em um tipo enum 
permaneça fixo o tempo todo.


********OBJETIVO*********
Definir nossos próprios tipos de dados (tipos de dados enumerados).


*****CARACTERISTICAS*****

- Tipos enumerados herdam da classe Enum, que possui alguns métodos úteis como name() e ordinal(), que retornam o nome da 
  constante e sua posição na estrutura respectivamente.

- Declaração de enum em Java pode ser feita fora de uma classe ou dentro de uma classe, mas NÃO dentro
  de um método.

- Em Java (a partir de 1.5), enums são representados usando o tipo de dados enum. As enumerações Java são mais poderosas
  que as enumerações C/C++. Em Java, também podemos adicionar variáveis, métodos e construtores a ele.
  
- Em geral as enums podem ser declaradas como classes separadas ou membros de classes. Normalmente, quando a enumeração 
  se torna grande, com diversas constantes, propriedades e métodos deseja-se por declarar uma classe própria para essa 
  enum, não poluindo assim a classe principal. No entanto, quando a enumeração é pequena possuindo poucas constantes ou
  métodos, geralmente declara-se a enumeração como um membro de uma classe.

*******VANTAGENS*********
- Ajudam na redução do número crescente de bugs na aplicação. Isso ocorre pois as enumerações reduzem o número infinito
  de possibilidades de valores que podem ser atribuídos.
  
  Exemplo.: você pode limitar os meses do ano em apenas 12 meses, ou menos se for o caso da aplicação. Poderia-se decidir 
  que um determinado método só receberia dos meses de Janeiro a Junho e de Agosto até Novembro, se informado qualquer
  mês diferente disso poderia gerar um erro para o usuários, pois os outros meses não são aceitos nos meses úteis de 
  trabalho para o ano. Assim, com simples atribuições você garante para o compilador de atribuir coisas que não fazem
  parte do escopo.
*/

public class Teoria {
	
	

}
