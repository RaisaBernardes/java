package _1P_threads;

public class TiqueTaque {

	boolean tique; //se "tique" for falso imprimir� "taque"

	synchronized void tique(boolean estaExecutando){ //para utilizar o wait e notify o bloco de c�digo tem que ser sincronizado.

		if (!estaExecutando){
			tique = true;
			notify(); //notifica a outra thread
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify(); //notifica/executa a thread do "taque"

		try {
			while (tique){ //enquanto o "tique" estiver executando, manda o comando de espera para o "taque"
				wait(); //exige try e catch
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExecutando){

		if (!estaExecutando){
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque");
		
		//"TAQUE" FOI IMPRESSO

		tique = false; //l�gica do "taque" sendo impresso
		
		//O "taque" j� foi impresso e agr chegou a vez de imprimir o "tique"
		//Para imprimir o "tique" temos que mandar a notifica��o pra ele executar
		
		notify(); 

		try {
			while (!tique){
				wait();  //tem que esperar pq a notifica��o (linha 47) foi mandada para o "tique" ser impresso
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}