package _1P_threads;

public class Teste {

	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		try {
			tique.t.join(); //o método join() espera a execuçao da thread terminr para continuar o codigo.
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}