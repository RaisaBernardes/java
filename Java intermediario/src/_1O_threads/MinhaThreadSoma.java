package _1O_threads;

public class MinhaThreadSoma implements Runnable {

	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora(); //todas as inst�ncias dessa classe ir�o compartilhar a calculadora
	
	public MinhaThreadSoma(String nome, int[] nums){
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start(); //� a mesma coisa que escrever as linhas 13 e 14, s� que simplificado
		//Thread t = new Thread(this, nome);
		//t.start();
	}

	@Override
	public void run() {
		
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para thread " + this.nome + " �: " + soma);
		
		System.out.println(this.nome + " terminada");
		
	}
	
}