/* --------MODIFICADOR FINAL--------
 
O modificador final é usado em diferentes contextos:
- Final variável -> Para criar uma variável CONSTANTE
- Final método   -> Para evitar o overriding de um método
- Final classe   -> Para evitar "filhos" dessa classe
	
---FINAL EM VARIÁVEIS---:
- O valor não poderá ser modificado
- Toda constante deve ser inicializada ao ser criada (atribuir um valor a ela)

Obs.: uma variável final não pode ser reatribuída. Mas no caso de uma variável final de referência, o estado interno 
do objeto apontado por essa variável de referência pode ser alterado. (Ver exemplo na classe "Teste")

---FINAL EM CLASSES---:
Todas as classes wrapper como Integer, Float, etc são classes finais.
1º situação de uso -> Evitar herança
2º situação de uso -> O outro uso de final with classes é criar uma classe imutável como a classe String predefinida.
(Não se pode tornar uma classe imutável sem torná-la final.)

---FINAL EM MÉTODOS---:
Um método final não pode ser substituído (Overriding). A classe Object faz isso — vários de seus métodos são finais. 
Devemos declarar métodos com a palavra-chave final quando queremos seguir a mesma implementação em todas as classes 
derivadas.
					  
*/


package _9_modificadorFinal;

public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	private String telefoneCelular;
	
	public Pessoa() {}
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	//public abstract String obterEtiquetaEndereco();
	
	//public abstract void imprimirEtiquetaEndereco();
}