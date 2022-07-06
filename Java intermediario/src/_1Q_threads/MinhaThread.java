package _1Q_threads;

public class MinhaThread implements Runnable {

	//Vamos copiar o comportamento daqueles m�todos!
	
	private String nome;
	private boolean estaSuspensa;	
	private boolean foiTerminada;

	public MinhaThread(String nome){
		this.nome = nome;
		this.estaSuspensa = false;
		new Thread(this, nome).start(); //o this � pq precisamos passar uma instancia da classe Runnable
		//Thread t = new Thread(this, nome); //As linhas 15 e 16 s�o a mesma coisa da linha 14
		//t.start();
	}

	@Override
	public void run() {

		System.out.println("Executando " + this.nome);

		try {
			for (int i=0; i<10; i++){
				System.out.println("Thread " + nome + ", " + i);
				Thread.sleep(300);
				synchronized (this) { //Tradu��o -> sincronize(CoisaAserSincronizada). Nesse caso, � a classe inteira, por isso o "this"
					while (estaSuspensa){
						wait();
					}
					if (this.foiTerminada){
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread " + this.nome + " terminada.");
	}
	
	void suspend(){
		this.estaSuspensa = true;
	}

	synchronized void resume(){
		this.estaSuspensa = false;
		notify(); //notifica a thread que est� suspensa
	}
	
	synchronized void stop(){
		this.foiTerminada = true;
		notify();
	}
}