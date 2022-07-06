package exercicio97_exceptions_fachada_conta;

public class Cliente {
	private String cpf;
	private int idade;
	private String nome;

	public Cliente(String cpf, int idade, String nome) {
		super();
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

}
