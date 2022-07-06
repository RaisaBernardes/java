package _1A_enum;


/*
******QUANDO USAR?******
Enums s�o usados quando conhecemos todos os valores poss�veis em tempo de compila��o, como op��es em um menu, modos de 
arredondamento, sinalizadores de linha de comando, etc. N�o � necess�rio que o conjunto de constantes em um tipo enum 
permane�a fixo o tempo todo.


********OBJETIVO*********
Definir nossos pr�prios tipos de dados (tipos de dados enumerados).


*****CARACTERISTICAS*****

- Tipos enumerados herdam da classe Enum, que possui alguns m�todos �teis como name() e ordinal(), que retornam o nome da 
  constante e sua posi��o na estrutura respectivamente.

- Declara��o de enum em Java pode ser feita fora de uma classe ou dentro de uma classe, mas N�O dentro
  de um m�todo.

- Em Java (a partir de 1.5), enums s�o representados usando o tipo de dados enum. As enumera��es Java s�o mais poderosas
  que as enumera��es C/C++. Em Java, tamb�m podemos adicionar vari�veis, m�todos e construtores a ele.
  
- Em geral as enums podem ser declaradas como classes separadas ou membros de classes. Normalmente, quando a enumera��o 
  se torna grande, com diversas constantes, propriedades e m�todos deseja-se por declarar uma classe pr�pria para essa 
  enum, n�o poluindo assim a classe principal. No entanto, quando a enumera��o � pequena possuindo poucas constantes ou
  m�todos, geralmente declara-se a enumera��o como um membro de uma classe.

*******VANTAGENS*********
- Ajudam na redu��o do n�mero crescente de bugs na aplica��o. Isso ocorre pois as enumera��es reduzem o n�mero infinito
  de possibilidades de valores que podem ser atribu�dos.
  
  Exemplo.: voc� pode limitar os meses do ano em apenas 12 meses, ou menos se for o caso da aplica��o. Poderia-se decidir 
  que um determinado m�todo s� receberia dos meses de Janeiro a Junho e de Agosto at� Novembro, se informado qualquer
  m�s diferente disso poderia gerar um erro para o usu�rios, pois os outros meses n�o s�o aceitos nos meses �teis de 
  trabalho para o ano. Assim, com simples atribui��es voc� garante para o compilador de atribuir coisas que n�o fazem
  parte do escopo.
*/

public class Teoria {
	
	

}
