package _1N_threads;

public class Teste2 {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		//O método "isAlive()" verifica se a thread ainda está executando.
		//Utilizar este método nesse contexto de imprimir "Programa finalizado" ao final de toads as execuções funciona 
		//mas não é uma boa prática. (VER CLASSE TESTE3)
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()){ //Tradução: Enquanto as threads t1, t2 e t3 estiverem rodando...
			try {
				Thread.sleep(200); //Colocando a Thread principal para dormir
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Programa finalizado");
	}
}