/*------CLASSES ABSTRATAS------
 Uma instância de uma classe abstrata não pode ser criada.
- Construtores são permitidos.
- Podemos ter uma classe abstrata sem nenhum método abstrato.
- Pode haver método final na classe abstrata, mas qualquer método abstrato na classe (classe abstrata) não pode ser 
  declarado como final ou, em termos mais simples, o método final não pode ser abstrato, pois gerará erro: “Combinação 
  ilegal de modificadores: abstrato e final ”
- Não temos permissão para criar objetos para nenhuma classe abstrata.
- Podemos definir métodos estáticos em uma classe abstrata*/

package _8_classesAbstratas;

public abstract class Pessoa {

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
	
	public abstract String obterEtiquetaEndereco();
	
	public abstract void imprimirEtiquetaEndereco();
}