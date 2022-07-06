package _6_temUm;

public class Contato {

	private String nome;
	private Endereco endereco; //Relacionamento Tem-um
	private Telefone[] telefones; //Relacionamento Tem-muitos. (Na vida real se usa Collections do java, não arrays)
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
}