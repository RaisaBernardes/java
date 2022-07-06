/*--------ENCAPSULAMENTO------
 O encapsulamento é definido como o empacotamento de dados em uma única unidade. É o mecanismo que une o código e os dados 
que ele manipula. Outra maneira de pensar sobre o encapsulamento é que ele é um escudo protetor que impede que os dados 
sejam acessados pelo código fora desse escudo.

Tecnicamente, no encapsulamento, as variáveis ou dados de uma classe são ocultados de qualquer outra classe e podem ser 
acessados apenas por meio de qualquer função membro de sua própria classe na qual ela é declarada.
Como no encapsulamento, os dados em uma classe são ocultados de outras classes usando o conceito de ocultação de dados que
é obtido tornando os membros ou métodos de uma classe privados, e a classe é exposta ao usuário final ou ao mundo sem 
fornecer detalhes por trás da implementação usando o conceito de abstração, por isso também é conhecido como uma 
combinação de ocultação de dados e abstração. 
O encapsulamento pode ser obtido declarando todas as variáveis na classe como privadas e escrevendo métodos públicos na 
classe para definir e obter os valores das variáveis. É mais definido com o método setter e getter.

Vantagens:
- Ocultação de dados
- Maior flexibilidade: Podemos tornar as variáveis da classe somente leitura ou somente escrita dependendo de nossa necessidade
- Reutilização: O encapsulamento também melhora a reutilização e é fácil de mudar com novos requisitos.
- Testar código é fácil: O código encapsulado é fácil de testar para teste de unidade.

*/

package _3_encapsulamento;

public class Carro {

	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
}