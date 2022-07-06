/* ------------CONSTRUTOR-------------
- O construtor é um método especial utilizado para inicializar objetos.
- Ele pode ser usado para definir valores iniciais para atributos de um objeto.
- Toda vez que um objeto é criado usando a palavra-chave new(), pelo menos 1 construtor é chamado.
- O compilador java cria um construtor padrão se sua classe não tiver nenhum.

---------Contrutores X Métodos---------
- Os construtores devem ter o mesmo nome da classe na qual são definidos, embora não sejam necessários para o método em Java.
- Construtores não retornam nenhum tipo enquanto método(s) tem o tipo de retorno ou void se não retornar nenhum valor.
- Os construtores são chamados apenas uma vez no momento da criação do objeto, enquanto os métodos podem ser chamados várias vezes.
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
		//this. faz referência aos atributos da classe definidos no inicio. (Selecionar palavra e utilizar tecla F3)
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() { } //Por boas práticas, deve-se criar um construtor vazio. 

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10); //this. também pode ser utilizado para fazer referência a outro construtor da classe.
		System.out.println("Chamando o construtor com 2 parâmetros");
	}

	void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km"); 
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel; //Nesse caso, o this. é usado para deixar mais explícito a que atributo estamos nos referindo 
	}
	
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}