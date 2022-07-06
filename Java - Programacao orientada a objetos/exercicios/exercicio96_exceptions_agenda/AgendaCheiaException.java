package exercicio96_exceptions_agenda;

import java.util.Arrays;

public class AgendaCheiaException extends Exception{

	@Override
	public String getMessage() {
		return "Agenda já está cheia!";
	}
	
}
