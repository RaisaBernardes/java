/*--------ENCAPSULAMENTO------
 O encapsulamento � definido como o empacotamento de dados em uma �nica unidade. � o mecanismo que une o c�digo e os dados 
que ele manipula. Outra maneira de pensar sobre o encapsulamento � que ele � um escudo protetor que impede que os dados 
sejam acessados pelo c�digo fora desse escudo.

Tecnicamente, no encapsulamento, as vari�veis ou dados de uma classe s�o ocultados de qualquer outra classe e podem ser 
acessados apenas por meio de qualquer fun��o membro de sua pr�pria classe na qual ela � declarada.
Como no encapsulamento, os dados em uma classe s�o ocultados de outras classes usando o conceito de oculta��o de dados que
� obtido tornando os membros ou m�todos de uma classe privados, e a classe � exposta ao usu�rio final ou ao mundo sem 
fornecer detalhes por tr�s da implementa��o usando o conceito de abstra��o, por isso tamb�m � conhecido como uma 
combina��o de oculta��o de dados e abstra��o. 
O encapsulamento pode ser obtido declarando todas as vari�veis na classe como privadas e escrevendo m�todos p�blicos na 
classe para definir e obter os valores das vari�veis. � mais definido com o m�todo setter e getter.

Vantagens:
- Oculta��o de dados
- Maior flexibilidade: Podemos tornar as vari�veis da classe somente leitura ou somente escrita dependendo de nossa necessidade
- Reutiliza��o: O encapsulamento tamb�m melhora a reutiliza��o e � f�cil de mudar com novos requisitos.
- Testar c�digo � f�cil: O c�digo encapsulado � f�cil de testar para teste de unidade.

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