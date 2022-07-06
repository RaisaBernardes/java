package _1U_classes_utilitarias_java;

public class _1Math {

	//Utilidades:
	//FUN��ES TRIGONOM�TRICAS, FUN��ES EXPONENCIAIS E FUN��ES DE ARREDONDAMENTO (�til principalmente para aplica��es financeiras)
	
	public static void main(String[] args) {
		
		System.out.println(Math.pow(2, 3)); //2 ^ 3
		
		System.out.println(Math.round(4.7)); //arredonda pra 5
		
		System.out.println(Math.round(4.4)); //arredonda pra 4
		
		System.out.println(Math.ceil(4.4)); //arredonda sempre pra cima
		
		System.out.println(Math.ceil(4.7)); //arredonda sempre pra cima
		
		System.out.println(Math.floor(4.4)); //arredonda sempre pra baixo
		
		System.out.println(Math.floor(4.7)); //arredonda sempre pra baixo
		
		System.out.println(Math.round(Math.random() * 100)); //gera um n�mero aleat�rio de 0 a 100
		
		System.out.println(Math.sin(Math.toRadians(30))); //seno de 30
		
		System.out.println(Math.cos(Math.toRadians(1))); //cosseno de 1
		
		System.out.println(Math.tan(Math.toRadians(45))); //tangente de 45
		
		//O java n�o � uma linguagem 100% para se trabalhar com n�meros. Logo, quando trabalha-se com n�meros (financeiro), devemos fugir
		//de lidar com esses tipos primitivos dessa forma. Para isso usamos classes como BigNumber e BigDecimal para fazermos 
		//opera��es mais precisas.

	}
	
}
