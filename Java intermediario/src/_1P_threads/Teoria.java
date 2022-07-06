package _1P_threads;

public class Teoria {
	
	/*
	 _____________Palavras chave: notify, wait e NotifyYAll_____________
	 
	 - CONTEXTO: Uma thread A est� sendo executada dentro de um m�todo sincronizado e precisa de acesso a um recurso R que no 
	 			 momento est� indispon�vel. Se a thread A ficar esperando por R, ir� bloquear o objeto impedindo que outras threads acessem 
	 			 o mesmo. Nesse caso, a melhor solu��o para n�o causar problemas � liberar temporariamente o controle do objeto permitindo 
	 			 que outras threads sejam executadas. Quando tivermos o recurso que precisamos, voltamos e resumimos a execu��o 
	 			 daquela tarefa. (Cen�rio de 2 pessoas escrevendo em um papel com apenas 1 caneta. Deve haver um revezamento da caneta)
	 
	 - wait(): bloqueia a execu��o da thread temporariamente, ou seja, coloca a thread em modo de espera. A thread ficar� em modo 
	 		 de espera at� que seja notificada.
	 		 
	 - notify(): notifica uma thread que estava esperando, ou seja, retorna a execu��o de uma thread.
	 - notifyAll(): notifica todas as threads, e a que tem prioridade mais altaganha acesso ao objeto.
	 

	 */
}
