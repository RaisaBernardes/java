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
			
			Calendar data = new GregorianCalendar(2010, 5, 4, 14, 32, 25); //Para estabelecer uma data espec�fica utiliza-se a inst�ncia do Gregorian
			
			System.out.println(sdf.format(data.getTime())); //O par�metro do .format() � da classe date, ent�o usamos o getTime()
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
				Date minhaDataEmDate = sdf1.parse(minhaData); //o compilador manda lan�ar um try / catch
				
				System.out.println(minhaDataEmDate);
				
				System.out.println(sdf.format(minhaDataEmDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}

}
