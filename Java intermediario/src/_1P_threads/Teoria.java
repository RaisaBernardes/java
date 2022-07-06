package _1P_threads;

public class Teoria {
	
	/*
	 _____________Palavras chave: notify, wait e NotifyYAll_____________
	 
	 - CONTEXTO: Uma thread A está sendo executada dentro de um método sincronizado e precisa de acesso a um recurso R que no 
	 			 momento está indisponível. Se a thread A ficar esperando por R, irá bloquear o objeto impedindo que outras threads acessem 
	 			 o mesmo. Nesse caso, a melhor solução para não causar problemas é liberar temporariamente o controle do objeto permitindo 
	 			 que outras threads sejam executadas. Quando tivermos o recurso que precisamos, voltamos e resumimos a execução 
	 			 daquela tarefa. (Cenário de 2 pessoas escrevendo em um papel com apenas 1 caneta. Deve haver um revezamento da caneta)
	 
	 - wait(): bloqueia a execução da thread temporariamente, ou seja, coloca a thread em modo de espera. A thread ficará em modo 
	 		 de espera até que seja notificada.
	 		 
	 - notify(): notifica uma thread que estava esperando, ou seja, retorna a execução de uma thread.
	 - notifyAll(): notifica todas as threads, e a que tem prioridade mais altaganha acesso ao objeto.
	 

	 */
}
