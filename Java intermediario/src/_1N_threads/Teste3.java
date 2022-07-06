package _1N_threads;

public class Teste3 {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 700);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		
		/*try {
			t1.join(200);  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
		t2.start();
		
		/*try {
			t2.join(); //A thread t2 só será iniciada quando a t1 estiver terminada ou quando acabar os 200 milissegundos. O que acontecer primeiro.
		*/
		
		t3.start();

		try {
			t1.join(); //O método join() ESPERA a execução de uma determinada thread terminar para continuar o código.
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Programa finalizado");
	}
}