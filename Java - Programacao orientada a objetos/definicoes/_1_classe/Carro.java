/*--------CLASSE----------
Uma classe � um projeto ou prot�tipo definido pelo usu�rio a partir do qual os objetos s�o criados. 
Ele representa o conjunto de propriedades ou m�todos que s�o comuns a todos os objetos de um tipo. 
Em geral, as declara��es de classe podem incluir esses componentes, na ordem:
	
- Modificadores: Uma classe pode ser p�blica ou ter acesso padr�o.
- Palavra-chave class: a palavra-chave class � usada para criar uma classe.
- Nome da classe: O nome deve come�ar com uma letra inicial (mai�scula por conven��o).
- Superclass(se houver): O nome do pai da classe (superclasse), se houver, precedido pela palavra-chave extends. Uma classe s� pode estender (subclasse) um pai.
- Interfaces(se houver): Uma lista separada por v�rgulas de interfaces implementadas pela classe, se houver, precedida pela palavra-chave implements. Uma classe pode implementar mais de uma interface.
- Corpo: O corpo da classe entre chaves, { }.



----------OBJETO------------
� uma unidade b�sica de Programa��o Orientada a Objetos e representa as entidades da vida real. 
Um programa Java t�pico cria muitos objetos que, como voc� sabe, interagem invocando m�todos. 
Um objeto consiste em:

- Estado: � representado por atributos de um objeto. Tamb�m reflete as propriedades de um objeto.
- Comportamento: � representado por m�todos de um objeto. Tamb�m reflete a resposta de um objeto com outros objetos.
- Identidade: D� um nome exclusivo a um objeto e permite que um objeto interaja com outros objetos.



---------MODIFICADORES--------
- PUBLIC: Visivel por classes de qualquer outro pacote.
- DEFAULT: Visivel apenas por classes dentro do seu pacote. Caso n�o seja definido nenhum modificador para a classe (ou atributo), o tipo dela ser� default.
- PRIVATE: Vis�vel apenas dentro da pr�pria classe.
- PROTECTED: Os m�todos ou membros de dados declarados como protegidos s�o acess�veis dentro do mesmo pacote ou subclasses em pacotes diferentes.

*/

package _1_classe;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
}
