package _1U_classes_utilitarias_java;

import java.util.Random;

public class _95NumerosRandomicos {

	public static void main(String[] args) {
			
			//A classe Math tem seus métodos estáticos, não precisando de instância para acessá-los.
			
			System.out.println(Math.floor(Math.random() * 100)); //Gera números aleatórios de 0 a 99
			//O floor arredonda o número
			
			Random aleatorio = new Random();
			
			System.out.println(aleatorio.nextInt()); //Número aleatório inteiro (Intervalo: de 0 até onde o java consegue armazenar)
			
			System.out.println(aleatorio.nextInt(5 + 1)); //Para incluir o "5" é preciso somar + 1, pois o parâmetro não é inclusivo.
		}
	
}
