package _1N_threads;

public class Teste {

	public static void main(String[] args) {
		
		//Estamos executando 3 tarefas ao mesmo tempo no nosso programa, no entanto, cada tarefa tem seu pr�prio passo (tempo)
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start(); 
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
		
		
		
		
		//--------Testando MinhaThreadRunnable--------
		
		

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
		//Thread t1 = new Thread(thread1); //Isso ser� implementado no construtor
		//t1.start(); //Isso ser� implementado no construtor
		
		MinhaThreadRunnable thread4 = new MinhaThreadRunnable("#2", 650);
		
		MinhaThreadRunnable thread5 = new MinhaThreadRunnable("#3", 1100);
		
		
		
		//--------Definindo a prioridade de cada thread--------
		
		
		MinhaThreadRunnable thread6 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread7 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread8 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(thread6);
		Thread t2 = new Thread(thread7);
		Thread t3 = new Thread(thread8);
		
		//Definindo as prioridades. 
		//Obs.: N�o � 100% certo que esta prioridade/ordem ser� obedecida, pois isso depende de outros fatores como o SO, mas
		//no geral, o m�todo setPriority() � respeitado. 
		t1.setPriority(5); // O par�metro pode ser um valor de 1 a 10, em que 10 � o maior grau de prioridade
		t2.setPriority(3);
		t3.setPriority(1);
		
		//Ao inv�s de utilizar os n�meros inteiros para definir a prioridade, podemos tamb�m utilizar a constante NORM_PRIORITY
		t1.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		//Tentando executar a mensagem "Programa finalizado" ap�s a execu��o de todas as threads. 
		for (int i=0; i<7; i++){ //Na base do chute, teria que ser i<15. (VER CLASSE TESTE2)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Programa finalizado");
	}
		
}

