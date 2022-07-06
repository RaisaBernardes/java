/*--------CLASSE----------
Uma classe é um projeto ou protótipo definido pelo usuário a partir do qual os objetos são criados. 
Ele representa o conjunto de propriedades ou métodos que são comuns a todos os objetos de um tipo. 
Em geral, as declarações de classe podem incluir esses componentes, na ordem:
	
- Modificadores: Uma classe pode ser pública ou ter acesso padrão.
- Palavra-chave class: a palavra-chave class é usada para criar uma classe.
- Nome da classe: O nome deve começar com uma letra inicial (maiúscula por convenção).
- Superclass(se houver): O nome do pai da classe (superclasse), se houver, precedido pela palavra-chave extends. Uma classe só pode estender (subclasse) um pai.
- Interfaces(se houver): Uma lista separada por vírgulas de interfaces implementadas pela classe, se houver, precedida pela palavra-chave implements. Uma classe pode implementar mais de uma interface.
- Corpo: O corpo da classe entre chaves, { }.



----------OBJETO------------
É uma unidade básica de Programação Orientada a Objetos e representa as entidades da vida real. 
Um programa Java típico cria muitos objetos que, como você sabe, interagem invocando métodos. 
Um objeto consiste em:

- Estado: É representado por atributos de um objeto. Também reflete as propriedades de um objeto.
- Comportamento: É representado por métodos de um objeto. Também reflete a resposta de um objeto com outros objetos.
- Identidade: Dá um nome exclusivo a um objeto e permite que um objeto interaja com outros objetos.



---------MODIFICADORES--------
- PUBLIC: Visivel por classes de qualquer outro pacote.
- DEFAULT: Visivel apenas por classes dentro do seu pacote. Caso não seja definido nenhum modificador para a classe (ou atributo), o tipo dela será default.
- PRIVATE: Visível apenas dentro da própria classe.
- PROTECTED: Os métodos ou membros de dados declarados como protegidos são acessíveis dentro do mesmo pacote ou subclasses em pacotes diferentes.

*/

package _1_classe;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
}
