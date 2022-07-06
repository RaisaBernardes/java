package _1U_classes_utilitarias_java;

import java.util.Random;

public class _95NumerosRandomicos {

	public static void main(String[] args) {
			
			//A classe Math tem seus m�todos est�ticos, n�o precisando de inst�ncia para acess�-los.
			
			System.out.println(Math.floor(Math.random() * 100)); //Gera n�meros aleat�rios de 0 a 99
			//O floor arredonda o n�mero
			
			Random aleatorio = new Random();
			
			System.out.println(aleatorio.nextInt()); //N�mero aleat�rio inteiro (Intervalo: de 0 at� onde o java consegue armazenar)
			
			System.out.println(aleatorio.nextInt(5 + 1)); //Para incluir o "5" � preciso somar + 1, pois o par�metro n�o � inclusivo.
		}
	
}
