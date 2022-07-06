package _1O_threads;

public class Calculadora {

	private int soma;
	
	public synchronized int somaArray(int[] array){ //com a palavra chave "synchronized" apenas 1 thread por vez acessará esse método
		
		//Caso esse método não fosse sincronizado, a soma seria compartilhada entre as duas threads ao mesmo tempo, interferindo 
		//no resultado da soma. 
		
		soma = 0;
		
		for (int i=0; i<array.length; i++) {
			
			soma += array[i];
			
			System.out.println("Executando a soma " + Thread.currentThread().getName() + 
					" somando o valor " + array[i] + " com total de " + soma);
			
			//Thread.currentThread() -> significa a thread atual que está utilizando este recurso
			//Thread.currentThread().getName() -> como informamos o nome da thread quando instanciamos ela na classe MinhaThreadSoma, 
			//podemos pegar o nome dessa thread
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		return soma;
	}
}