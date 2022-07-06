package exercicio92_heranca_gustavo_guanabara;

public class Gafanhoto extends Pessoa {

	protected String login;
	protected int totAssistido;
	
	
	public Gafanhoto(String login){
		this.login= login;
		this.totAssistido = 0;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido += totAssistido;
	}

	@Override
	public String toString() {
		return "Gafanhoto: login= " + login + ", totAssistido= " + totAssistido + "";
	}

	
}
