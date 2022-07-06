package _1U_classes_utilitarias_java;

import java.util.Calendar;

public class _3Calendar {

		public static void main(String[] args) {
			
			
			Calendar hoje = Calendar.getInstance(); //Já existe um calendario instanciado no java e para obte-lo usamos o metodo getInstance()
			//Esse padrão de retornar umas instância e não deixar o usuário instanciar o objeto é um padrão de projeto chamado 
			//SINGLETON
			
			int ano = hoje.get(Calendar.YEAR);
			int mes = hoje.get(Calendar.MONTH);
			int dia = hoje.get(Calendar.DAY_OF_MONTH);
			int hora = hoje.get(Calendar.HOUR_OF_DAY);
			int minutos = hoje.get(Calendar.MINUTE);
			int segundos = hoje.get(Calendar.SECOND);
			
			
			//Saída formatada com "printf". Lembrando que é um varargs
			System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
					dia, (mes+1), ano, hora, minutos, segundos); //O mês no java inicia-se com 0
			
			hoje.add(Calendar.DAY_OF_MONTH, -1); //tirando -1 dia da data de hoje
			
			hoje.add(Calendar.DAY_OF_MONTH, 5); //aumentando 6 dias à data de hoje
			
			System.out.println();
			
			System.out.println(hoje.get(Calendar.DAY_OF_MONTH)); //vai imprimir a última formatação (hoje - 5)
		
		}

	
}
