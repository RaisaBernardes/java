package _1U_classes_utilitarias_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class _5FormatandoDatas {
	
	//Formatando datas com SimpleDateFormat
	
		public static void main(String[] args) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z"); //A classe simpleDateFormat formata uma data
			
			Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25); //Para estabelecer uma data específica utiliza-se a instância do Gregorian
			
			System.out.println(sdf.format(data.getTime())); //O parâmetro do .format() é da classe date, então usamos o getTime()
															//pois ele retorna uma instancia da classe Date
			
			//Outra maneira
			Date hoje = new Date();
			System.out.println(sdf.format(hoje));
			
			//Atribuindo um formata data para formato String
			String d = sdf.format(hoje);
			
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			
			//transformando uma data do formato string para Date
			String minhaData = "20/02/2000";
			
			try {
				Date minhaDataEmDate = sdf1.parse(minhaData); //o compilador manda lançar um try / catch
				
				System.out.println(minhaDataEmDate);
				
				System.out.println(sdf.format(minhaDataEmDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}

}
