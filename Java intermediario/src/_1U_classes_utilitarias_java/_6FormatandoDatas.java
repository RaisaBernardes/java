package _1U_classes_utilitarias_java;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//FORMATANDO DATAS COM DATEFORMAT E LOCALE

public class _6FormatandoDatas {
	
		
	//A classse DateFormat � abstrata o que impossibilita de instancia-la
	
	//O DateFormat � mais �til quando estivermos trabalhando com o Locale da nossa aplica��o, o SimpleDateFormat � quando
	//queremos especificar o formato da data

		public static void main(String[] args) {
			
			//Formatar uma data para String
			
			Date hoje = new Date();
			
			System.out.println(Locale.getDefault());
			
			String hojeFormatado = DateFormat.getInstance().format(hoje); //Vai obter uma instancia do DateFormat (data completa)
			System.out.println(hojeFormatado);
			
			Locale.setDefault(new Locale("pt", "Brazil")); //Modificando o Locale do computador. Muda o formato de data.
			
			hojeFormatado = DateFormat.getInstance().format(hoje);
			System.out.println(hojeFormatado);
			
			hojeFormatado = DateFormat.getTimeInstance().format(hoje); //Obt�m apenas a hora (no formato estabelecido pelo Locale)
			System.out.println(hojeFormatado);

			hojeFormatado = DateFormat.getDateInstance().format(hoje);
			System.out.println(hojeFormatado); //dd/MMM/yyyy
			
			hojeFormatado = DateFormat.getDateTimeInstance().format(hoje); //Obt�m data e hor�rio
			System.out.println(hojeFormatado);
			
			hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje); //Obt�m hora e min
			System.out.println(hojeFormatado);
			
			hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje); //Obt�m hora, min e segundo
			System.out.println(hojeFormatado);
			
			hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje); //Obt�m hora, min e segundo + fuso hor�rio
			System.out.println(hojeFormatado);
			
			hojeFormatado = DateFormat.getDateTimeInstance(
					DateFormat.SHORT, DateFormat.SHORT).format(hoje);
			System.out.println(hojeFormatado);
			
			//Transformando variavel string em Date
			
			String data = "12-02-2017 14:25";
			try {
				Date dataDate = DateFormat.getInstance().parse(data);
				System.out.println(dataDate);
				
				//Trasformando vari�vel do tipo Date em Calendar
				Calendar calendario = Calendar.getInstance();
				calendario.setTime(dataDate);
				
				System.out.println(calendario);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

}
