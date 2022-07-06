package _1U_classes_utilitarias_java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _4GregorianCalendar {
	

	//A classe Calendar é uma instancia da classe GregorianCalendar. 
	//A classe Calendar é uma classe abstrata, e a GregorianCalendar é uma subclasse da classe Calendar, logo ela tem
	//todos os métodos da classe Calendar.
	
	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance(); //O getInstance() retorna a data de hoje
												 //Por trás dos panos o java está instanciando uma instância da classe GregorianCalendar
		
		GregorianCalendar hoje = new GregorianCalendar(); //Diferente da Calendar, a Gregorian não utiliza o padrão singleton
														 
		//System.out.println(hoje);
		
		imprimirData(hoje); //Polimorfismo. É possivel pois a Gregorian extende a Calendar.
		
		System.out.println(hoje.isLeapYear(2020)); //verifica se o ano é bissexto. (O Calendar não tem esse método, só o Gregorian)
		
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
		
		//Fazer isso da muito trabalho, então é normal ter uma classe utilitária no projeto onde eu vou ter esse método estático
		//e ele será publico para eu chamar sempre que precisar. 
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minutos, segundos);
		
		System.out.println();
	}

}
