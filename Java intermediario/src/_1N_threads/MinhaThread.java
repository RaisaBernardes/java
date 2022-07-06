package _1N_threads;

public class MinhaThread extends Thread { //Clase "Thread" é do pacote java.lang

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		start(); //Inicia a thread (chama o método run())
				 //Colocar no construtor para não ter que ficar chamando start() no método main da classe Teste.
	}

	public void run(){ //É um override 

		try {
			for (int i=0; i<6; i++){
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo); //determina o tempo em que será impresso cada nome.
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execução");
	}

}