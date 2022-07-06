package exercicio96_exceptions_agenda;

public class Contatos {

	private static int contador = 0;
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	
	public Contatos(){
		++contador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	
	@Override
	public String toString() {
		return "CONTATOS:  \n" + "Nome: " + nome + "\n" +
				"Telefone: " + telefone + "Email: " + email ;
				
	}

}
