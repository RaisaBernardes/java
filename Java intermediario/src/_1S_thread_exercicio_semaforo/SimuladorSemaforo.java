package _1S_thread_exercicio_semaforo;

public class SimuladorSemaforo {

	public static void main(String[] args) {
		
		ThreadSemaforo semaforo = new ThreadSemaforo(); //quando instancia automaticamente rosa o metodo run() da classe.
		
		for (int i=0; i<10; i++){ //quantas vezes eu quero rodar o sem�foro
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}
		
		semaforo.desligarSemafaro(); //sai da condi��o "while" do m�todo "run"
	}

}