package _1U_classes_utilitarias_java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class _8DataNoJava {

	//API para se trabalhar com datas introduzido a partir do java 8 (Se vc precisa fazer manipula��o de datas, calcular diferen�a entre datas, etc )
	//Essa API � segura na quest�o threads.
	//Data no Java 8+: LocalDate, LocalDateTime, LocalTime, ZoneId, ZoneDateTime
	
	//Existe objeto para s� data, s� hor�rio, e o objeto completo. 
	//Quando trabalha-se com a classe Date e vc s� quer a data (sem hora), � muito f�cil de dar bugs.
	
	public static void main(String[] args) {
			
			//-----TRABALHANDO COM DATAS-------
		
			//Padr�o ISO de data: YYYY-MM-DD
			LocalDate agora = LocalDate.now(); //Objeto para: dia - m�s - ano (no padr�o ISO) 
			System.out.println(agora);
			
			System.out.println(LocalDate.of(2019, 2, 1)); //Definir uma data espec�fica
			System.out.println(LocalDate.parse("2020-02-01")); //Passando uma string (no formato ISO) para o tipo LocalDate
	
			System.out.println(agora.plusDays(30)); //Adicionar 30 dias
			
			System.out.println(agora.minus(1, ChronoUnit.MONTHS)); //Volta no tempo: voltar 1 m�s da data de hoje.
			
			System.out.println(agora.getDayOfWeek()); //Retorna o dia da semana de hoje
			System.out.println(agora.getDayOfMonth()); //Retorna o dia do m�s 
			System.out.println(agora.getDayOfYear()); //Retorna o dia do ano
			
			System.out.println(LocalDate.parse("2020-02-01").isLeapYear()); //Verifica se � ano bissexto.
			
			
			//-----TRABALHANDO COM HOR�RIO-----
			
			// hora formato ISO (hor�rio militar. Ex.: 13h, 14h, etc)
			LocalTime hAgora = LocalTime.now(); //Retorna a hora atual
			System.out.println("\n---LocalTime---");
			System.out.println(hAgora);
			
			System.out.println(LocalTime.of(20, 18)); //Definindo uma hora espec�fica (20h e 18min)
			System.out.println(LocalTime.parse("20:18")); //Passando string para o tipo LocalTime
			
			System.out.println(hAgora.plusMinutes(50)); //Adiciona 50 min na hora atual
			System.out.println(hAgora.minus(40, ChronoUnit.MINUTES)); //Diminui 40 minutos a partir da hora atual
			
			System.out.println(hAgora.getHour()); //Pega apenas a hora
			
			//-------TRABALHANDO COM DATA E HORA--------
			
			// data completa = data + hora
			LocalDateTime agoraCompleto = LocalDateTime.now();
			System.out.println("\n-------LocalDateTime------");
			System.out.println(agoraCompleto);
			
			System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10)); //definindo data e hora especifica
			System.out.println(LocalDateTime.parse("2019-02-16T20:25:10")); //Passando de string (no padr�o ISO) para o tipo LocalDateTime
			System.out.println(agoraCompleto.plusYears(20)); //Adiciona 20 anos a partir da data atual.
			
			ZoneId fuso = ZoneId.systemDefault(); //retorna o fuso hor�rio atual
			System.out.println(fuso);
			
			//Pegando todos os fusos
			Set<String> fusos = ZoneId.getAvailableZoneIds();
	//		for (String f : fusos) { 
	//			System.out.println(f);
	//		}
			
			ZoneId sp = ZoneId.of("America/Sao_Paulo"); //Definindo um fuso
			ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp); //uma data e hor�rio que tem fuso horario
			System.out.println(zdt);
			System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));
			
			ZoneOffset offset = ZoneOffset.of("+02:00"); //ZoneOffset trabalha com +02:00, ou +03:00, etc
			OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset); //Como fica uma data calculada adicionando o Offset (adiciona o offset na data)
			System.out.println(offsetdt);
			
			//Convertendo um objeto Date ou Calendar para essa API.
			Date date = new Date();
			Calendar c = Calendar.getInstance();
			LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp); //O toInstant(), a partir do java8, foi oq substituiu o Date. Se vc precisar fazer um mapeamento de uma coluna de um objeto pra uma coluna do tipo DateTime no banco de dados, no lugar de usar o Date, usamos o Instant
			System.out.println(ldtDate);
			System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
		}

	
	
}
