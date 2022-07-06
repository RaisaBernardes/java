package exercicio96_exceptions_agenda;

public class ContatoNaoExisteException extends Exception{

	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato){
		this.nomeContato=nomeContato;
	}

	public String getMessage(){
		return "Contato " + nomeContato + " n�o existe na agenda!";
	}
}
