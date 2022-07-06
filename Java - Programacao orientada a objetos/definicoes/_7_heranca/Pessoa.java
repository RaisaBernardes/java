//Por padrão, toda classe pai herda da classe Object.

package _7_heranca; //Herança = relacionamento "É UM"

public class Pessoa {

	private String nome;//O modificador "private" NÃO dá acesso nem às classes "filhas". É exclusivo da classe presente.
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	protected String nomeVisibilidade; //O protected funciona como o default (visivel ao pacote), a diferença é que as 
									   //classes filhas tem acesso à ele INDEPENDENTE do pacote.
	
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
	
	
}