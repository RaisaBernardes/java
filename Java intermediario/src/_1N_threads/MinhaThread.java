package _1N_threads;

public class MinhaThread extends Thread { //Clase "Thread" � do pacote java.lang

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		start(); //Inicia a thread (chama o m�todo run())
				 //Colocar no construtor para n�o ter que ficar chamando start() no m�todo main da classe Teste.
	}

	public void run(){ //� um override 

		try {
			for (int i=0; i<6; i++){
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo); //determina o tempo em que ser� impresso cada nome.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execu��o");
	}

}