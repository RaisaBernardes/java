/* ------------CONSTRUTOR-------------
- O construtor � um m�todo especial utilizado para inicializar objetos.
- Ele pode ser usado para definir valores iniciais para atributos de um objeto.
- Toda vez que um objeto � criado usando a palavra-chave new(), pelo menos 1 construtor � chamado.
- O compilador java cria um construtor padr�o se sua classe n�o tiver nenhum.

---------Contrutores X M�todos---------
- Os construtores devem ter o mesmo nome da classe na qual s�o definidos, embora n�o sejam necess�rios para o m�todo em Java.
- Construtores n�o retornam nenhum tipo enquanto m�todo(s) tem o tipo de retorno ou void se n�o retornar nenhum valor.
- Os construtores s�o chamados apenas uma vez no momento da cria��o do objeto, enquanto os m�todos podem ser chamados v�rias vezes.
*/

package _2_construtor;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros,
			double capCombustivel, double consumoCombustivel) {
		//this. faz refer�ncia aos atributos da classe definidos no inicio. (Selecionar palavra e utilizar tecla F3)
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() { } //Por boas pr�ticas, deve-se criar um construtor vazio. 

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 par�metros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10); //this. tamb�m pode ser utilizado para fazer refer�ncia a outro construtor da classe.
		System.out.println("Chamando o construtor com 2 par�metros");
	}

	void exibirAutonomia() {
	    System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " km"); 
	}
	
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel; //Nesse caso, o this. � usado para deixar mais expl�cito a que atributo estamos nos referindo 
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}