/*------CLASSES ABSTRATAS------
 Uma inst�ncia de uma classe abstrata n�o pode ser criada.
- Construtores s�o permitidos.
- Podemos ter uma classe abstrata sem nenhum m�todo abstrato.
- Pode haver m�todo final na classe abstrata, mas qualquer m�todo abstrato na classe (classe abstrata) n�o pode ser 
  declarado como final ou, em termos mais simples, o m�todo final n�o pode ser abstrato, pois gerar� erro: �Combina��o 
  ilegal de modificadores: abstrato e final �
- N�o temos permiss�o para criar objetos para nenhuma classe abstrata.
- Podemos definir m�todos est�ticos em uma classe abstrata*/

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