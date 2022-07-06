package _1S_thread_exercicio_semaforo;


public class ThreadSemaforo implements Runnable {

	private CorSemaforo cor;
	private boolean parar; //por padrão todo atributo booleano inicia-se como false.
	private boolean corMudou;

	public ThreadSemaforo(){
		this.cor = CorSemaforo.VERMELHO;

		this.parar = false;
		this.corMudou = false;

		new Thread(this).start();
	}

	@Override
	public void run() {

		while(!parar){ //enquanto não pedir pra parar
			try {
				/*switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;
				case AMARELO:
					Thread.sleep(300);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;
				default:
					break;
				}*/
				Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void mudarCor(){
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemaforo.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;
		default:
			break;
		}
		this.corMudou = true;
		notify();
	}
	
	public synchronized void esperaCorMudar(){
		while(!this.corMudou){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}
	
	public synchronized void desligarSemafaro(){
		this.parar = true;
	}

	public CorSemaforo getCor() {
		return cor;
	}
}