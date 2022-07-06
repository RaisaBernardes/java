package _1U_classes_utilitarias_java;

public class _1Math {

	//Utilidades:
	//FUNÇÕES TRIGONOMÉTRICAS, FUNÇÕES EXPONENCIAIS E FUNÇÕES DE ARREDONDAMENTO (útil principalmente para aplicações financeiras)
	
	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3)); //2 ^ 3
		
		System.out.println(Math.round(4.7)); //arredonda pra 5
		
		System.out.println(Math.round(4.4)); //arredonda pra 4
		
		System.out.println(Math.ceil(4.4)); //arredonda sempre pra cima
		
		System.out.println(Math.ceil(4.7)); //arredonda sempre pra cima
		
		System.out.println(Math.floor(4.4)); //arredonda sempre pra baixo
		
		System.out.println(Math.floor(4.7)); //arredonda sempre pra baixo
		
		System.out.println(Math.round(Math.random() * 100)); //gera um número aleatório de 0 a 100
		
		System.out.println(Math.sin(Math.toRadians(30))); //seno de 30
		
		System.out.println(Math.cos(Math.toRadians(1))); //cosseno de 1
		
		System.out.println(Math.tan(Math.toRadians(45))); //tangente de 45
		
		//O java não é uma linguagem 100% para se trabalhar com números. Logo, quando trabalha-se com números (financeiro), devemos fugir
		//de lidar com esses tipos primitivos dessa forma. Para isso usamos classes como BigNumber e BigDecimal para fazermos 
		//operações mais precisas.

	}
	
}
