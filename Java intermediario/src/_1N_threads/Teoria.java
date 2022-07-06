package _1N_threads;

public class Teoria {
	
	/*
	  _________DEFINI��ES_________
	  
	 MULTITAREFAS: Processos e threads
	 
	 	- PROCESSO: 
	 	� um programa que est� sendo executado. 
	 
	 	- THREAD: 
	 	� a menor unidade de c�digo que pode ser executada. Dentro de um processo pode haver v�rias threads. 
	 	Em outras palavras, Thread � um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se 
	 	autodividir em duas ou mais tarefas. � o termo em ingl�s para Linha ou Encadeamento de Execu��o.
	
	 	Threads permitem que m�ltiplas execu��es ocorram no mesmo ambiente do aplicativo com um grande grau de independ�ncia uma da 
	 	outra, portanto, se temos muitas threads executando em paralelo no sistema � an�logo a m�ltiplos aplicativos executando em 
	 	paralelo em um computador. As diversas threads que existem em um programa podem trocar dados e informa��es entre si e 
	 	compartilhar os mesmos recursos do sistema, incluindo o mesmo espa�o de mem�ria. Assim, um usu�rio pode utilizar uma 
	 	funcionalidade do sistema enquanto outras linhas de execu��o est�o trabalhando e realizando outros c�lculos e opera��es.
	 
	 
	 	- MULTITHREADS:
	 	O termo multithreading nada mais � do que um aplicativo que possui m�ltiplas threads executando ao mesmo tempo (feito em 
	 	hardwares que possuem mais de uma CPU).
	 	
	 
	 _________PARA QUE SERVEM THREADS?_________
	 
	 A principal raz�o para existirem as threads � termos a possibilidade de ocorrem muitas atividades ao mesmo tempo em nossa 
	 aplica��o. Al�m disso, podemos observar que o nosso modelo de programa��o se torna muito mais simples � medida que decompomos 
	 a nossa aplica��o em m�ltiplos threads que executam quase em paralelo, ou mesmo em paralelo no caso de termos mais de uma CPU.
	 
	 
	 ________________EXEMPLO_________________
	 
	 (Processador de texto)
	 
	 Suponhamos que estamos escrevendo um artigo em um processador de textos, para um processador de textos considerado no m�nimo 
	 bom, ter�amos que ter duas threads, uma delas seria respons�vel por interagir com o usu�rio, e a outra thread seria respons�vel 
	 por corrigir o texto, realizando isso em segundo plano. Assim enquanto o usu�rio digitaria o seu texto o processador de textos 
	 iria processando o texto, enquanto ap�s isso o segundo thread seria respons�vel por corrigir os textos que iriam sendo digitados 
	 pelo usu�rio caso estivessem errados. Que tal se ainda colocassem um terceiro thread que seria respons�vel por salvar o documento
	 de tempo em tempo para que caso venha a faltar energia o usu�rio n�o perdesse o documento.
	 Essa � a id�ia de threads, onde temos a nossa aplica��o dividida em pequenos m�dulos funcionais, fazendo da aplica��o ainda 
	 mais completa.
	 
	 
	 _________VANTAGENS DE USAR THREADS_________
	 
	  - Deixam os programas mais eficientes, capazes de executar mais de uma tarefa ao mesmo tempo.
	  - No entanto, uma das desvantagens � que com v�rios threads o trabalho fica mais complexo, justamente por causa da intera��o 
	  que ocorre entre eles.
	 
	
	 ________________CICLO DE VIDA_______________
	 
	 O CICLO DE VIDA das threads � composto por 5 estados:
	
	 - Cria��o da inst�ncia -> new Thread()
	 - Pronta para execu��o (RUNNABLE) -> start()
	 - Em execu��o (RUNNING) -> run() 
	 	- � possivel voltar para o estado "RUNNABLE" atrav�s do m�todo yield()
	 	- � possivel terminar a thread entrando no estado "Thread terminada" (DEAD)
	 	- � possivel entrar em Estado de espera (WAITING) -> sleep(), wait(), suspend().
	   		- Em seguida as threads podem "acordar" e sair do estado de espera -> notify() / notifyAll()
	   		- Ou podemos resumir sua execu��o e ela volta para o estado "Pronta para execu��o" e depois para "Em execu��o" -> resume()
	 
	 
	________________IMPLEMENTA��ES_______________
	
	Qual abordagem � melhor: fazer o extends da classe "Thread" ou usar a interface Runnable?
	
	Depende do que o programa precisa.
	
	- Quando fazemos o extends da Thread, o �nico m�todo que precisa ser sobreposto � o run e dar inicio com o start(), mas n�o poderemos
	extender nenhuma outra classe. (Java n�o tem heran�a multipla)
	- Quando implementamos a interface Runnable, n�s tamb�m precisamos implementar o m�todo run, mas com a interface Runnable n�s 
	podemos extender qualquer outra classe.
	
	Se n�o for sobrepor qualquer outro m�todo da classe Thread, pode ser melhor usar o Runnable
	
	 
	 */

}
