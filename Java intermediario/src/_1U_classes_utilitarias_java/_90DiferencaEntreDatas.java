package _1U_classes_utilitarias_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class _90DiferencaEntreDatas {
	
	//Diferen�a entre Datas (Date, LocalDate, LocalDateTime)
	
	public static void main(String[] args) {
		
		try {
			diferencaDataAteJava7();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("---------");
		diferencaDataJava8();
		
		System.out.println("---------");
		diferencaDataJava8ComTempo();
		
		System.out.println("---------");
		diferencaDataJava8ComChronoUnit();
	}
	
	public static void diferencaDataAteJava7() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("01/01/2019");
		Date segundaDt = sdf.parse("01/02/2019");
		
		//Calculando a diferen�a de milissegundos de uma data e outra.
		//abs = valor absoluto (para n�o dar negativo)
		long diffEmMil = Math.abs(segundaDt.getTime() - primeiraDt.getTime()); //o getTime pega a quantidade de milissegundos daquele dia
		
		long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS); //Forma 1 de converter milissegundos em dias
		
		
		int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24)); //forma 2 de converter milissegundos em dias (mais antiga)
		//Usar essa forma 2 para calcular meses � complicado, pois tem meses que tem 30, 31 e 28 dias
		
		System.out.println(diff);
		System.out.println(dias);
		
	}
	
	public static void diferencaDataJava8() { //Com a API deve-se pegar a informa��o em conjunto para obter a diferen�a exata (ano, mes, dias, horas, min e seg)
		LocalDate data1 = LocalDate.of(2019, 1, 1);
		LocalDate data2 = LocalDate.of(2019, 2, 10);
		
		Period periodo = Period.between(data1, data2);//calculando o periodo entre uma data e outra
		int dias = periodo.getDays(); //pega a diferen�a de dias
		int meses = periodo.getMonths(); //pega a diferen�a de meses
		int anos = periodo.getYears(); //pega a diferen�a de anos
		
		//System.out.println("Periodo: " + periodo); //Vai retornar o endere�o de mem�ria
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos : " + anos);
	}

	public static void diferencaDataJava8ComTempo() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		//Calculando a diferen�a de dura��o de horas (8 e 6)
		Duration duracao = Duration.between(data1, data2);
		long diff = duracao.toHours();
		
		System.out.println(diff);
	}
	
	public static void diferencaDataJava8ComChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		//calcula a diferen�a entre a data1 e a data2
		long diff = ChronoUnit.HOURS.between(data1, data2); //diferen�a de horas
		long diffDias = ChronoUnit.DAYS.between(data1, data2); //diferen�a de dias
		
		System.out.println(diff);
		System.out.println(diffDias);
	}

}
