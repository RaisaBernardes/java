package _1U_classes_utilitarias_java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _4GregorianCalendar {
	

	//A classe Calendar � uma instancia da classe GregorianCalendar. 
	//A classe Calendar � uma classe abstrata, e a GregorianCalendar � uma subclasse da classe Calendar, logo ela tem
	//todos os m�todos da classe Calendar.
	
	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance(); //O getInstance() retorna a data de hoje
												 //Por tr�s dos panos o java est� instanciando uma inst�ncia da classe GregorianCalendar
		
		GregorianCalendar hoje = new GregorianCalendar(); //Diferente da Calendar, a Gregorian n�o utiliza o padr�o singleton
														 
		//System.out.println(hoje);
		
		imprimirData(hoje); //Polimorfismo. � possivel pois a Gregorian extende a Calendar.
		
		System.out.println(hoje.isLeapYear(2020)); //verifica se o ano � bissexto. (O Calendar n�o tem esse m�todo, s� o Gregorian)
		
		GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1);
		
		imprimirData(hoje2);
		
		GregorianCalendar hoje3 = new GregorianCalendar(2017, 0, 1, 14, 30, 23);
		
		imprimirData(hoje3);

	}
	
	//o metodo tem que ser static para chamar ele no main acima.
	private static void imprimirData(Calendar hoje) {
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		//Fazer isso da muito trabalho, ent�o � normal ter uma classe utilit�ria no projeto onde eu vou ter esse m�todo est�tico
		//e ele ser� publico para eu chamar sempre que precisar. 
		
		System.out.printf("Hoje � : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minutos, segundos);
		
		System.out.println();
	}

}
