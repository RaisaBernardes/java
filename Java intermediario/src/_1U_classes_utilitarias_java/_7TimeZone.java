package _1U_classes_utilitarias_java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class _7TimeZone {
	
	//É util quando vc quer saber qual foi o horario em que um determinado registro foi modificado em sua base de dados.
	//Caso a pessoa esteja utilizando o programa no Japão, EUA, etc, o horário registrado será o de la. Nesse contexto
	//pode ser que vc queira padronizar como salvar as datas na sua base de dados, e para isso, pode-se utilizar a classe
	//TimeZone.
	
public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz); // EST
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso: fusos) {
//			System.out.println(fuso);
//		}
		
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());

		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraSP = Calendar.getInstance(tzSP);
		System.out.println(agoraSP.getTimeZone());
		System.out.println(sdf.format(agoraSP.getTime()));
		
		agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis())) / 1000 / 60/ 60);
		System.out.println(sdf.format(agoraSP.getTime()));
	}

}
