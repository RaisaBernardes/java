package _1R_threads_deadlock;

/*

_________DEFINI��O_________
Deadlock � um problema potencial em qualquer sistema operacional. Um estado de deadlock ocorre quando dois ou mais processos 
est�o esperando indefinidamente por um evento que s� pode ocorrer por um dos processos em espera. 

_______Como evitar?________
Para evitar o deadlock, deve-se usar os m�todos wait() e notify() sempre que vc precisa de um outro objeto e ele n�o est� dispon�vel.
Pois vc libera temporariamente aquele recurso e depois utiliza-o.
*/

public class Deadlock { //Esse programa � um exemplo de deadlock

	public static void main(String[] args) {
		
		//Esses v�o ser os objetos que as threads ir�o querer utilizar
		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";
		
		Thread t1 = new Thread() {
			public void run(){
				synchronized (RECURSO1) { //synchronized = bloqueia o recurso 1, de forma que apenas essa thread utilize ele.
					System.out.println("Thread #1: bloqueou recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #1: tentando o acesso ao recurso 2");
					
					synchronized (RECURSO2) {
						System.out.println("Thread #1: bloqueou recurso 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run(){
				synchronized (RECURSO2) { 
					System.out.println("Thread #2: bloqueou recurso 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #2: tentando o acesso ao recurso 1");
					
					synchronized (RECURSO1) {
						System.out.println("Thread #2: bloqueou recurso 1");
					}
				}
			}
		};
		
		//Executando as threads
		t1.start();
		t2.start();
	}

}