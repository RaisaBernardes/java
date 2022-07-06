package _1N_threads;

public class Teoria {
	
	/*
	  _________DEFINIÇÕES_________
	  
	 MULTITAREFAS: Processos e threads
	 
	 	- PROCESSO: 
	 	É um programa que está sendo executado. 
	 
	 	- THREAD: 
	 	É a menor unidade de código que pode ser executada. Dentro de um processo pode haver várias threads. 
	 	Em outras palavras, Thread é um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se 
	 	autodividir em duas ou mais tarefas. É o termo em inglês para Linha ou Encadeamento de Execução.
	
	 	Threads permitem que múltiplas execuções ocorram no mesmo ambiente do aplicativo com um grande grau de independência uma da 
	 	outra, portanto, se temos muitas threads executando em paralelo no sistema é análogo a múltiplos aplicativos executando em 
	 	paralelo em um computador. As diversas threads que existem em um programa podem trocar dados e informações entre si e 
	 	compartilhar os mesmos recursos do sistema, incluindo o mesmo espaço de memória. Assim, um usuário pode utilizar uma 
	 	funcionalidade do sistema enquanto outras linhas de execução estão trabalhando e realizando outros cálculos e operações.
	 
	 
	 	- MULTITHREADS:
	 	O termo multithreading nada mais é do que um aplicativo que possui múltiplas threads executando ao mesmo tempo (feito em 
	 	hardwares que possuem mais de uma CPU).
	 	
	 
	 _________PARA QUE SERVEM THREADS?_________
	 
	 A principal razão para existirem as threads é termos a possibilidade de ocorrem muitas atividades ao mesmo tempo em nossa 
	 aplicação. Além disso, podemos observar que o nosso modelo de programação se torna muito mais simples à medida que decompomos 
	 a nossa aplicação em múltiplos threads que executam quase em paralelo, ou mesmo em paralelo no caso de termos mais de uma CPU.
	 
	 
	 ________________EXEMPLO_________________
	 
	 (Processador de texto)
	 
	 Suponhamos que estamos escrevendo um artigo em um processador de textos, para um processador de textos considerado no mínimo 
	 bom, teríamos que ter duas threads, uma delas seria responsável por interagir com o usuário, e a outra thread seria responsável 
	 por corrigir o texto, realizando isso em segundo plano. Assim enquanto o usuário digitaria o seu texto o processador de textos 
	 iria processando o texto, enquanto após isso o segundo thread seria responsável por corrigir os textos que iriam sendo digitados 
	 pelo usuário caso estivessem errados. Que tal se ainda colocassem um terceiro thread que seria responsável por salvar o documento
	 de tempo em tempo para que caso venha a faltar energia o usuário não perdesse o documento.
	 Essa é a idéia de threads, onde temos a nossa aplicação dividida em pequenos módulos funcionais, fazendo da aplicação ainda 
	 mais completa.
	 
	 
	 _________VANTAGENS DE USAR THREADS_________
	 
	  - Deixam os programas mais eficientes, capazes de executar mais de uma tarefa ao mesmo tempo.
	  - No entanto, uma das desvantagens é que com vários threads o trabalho fica mais complexo, justamente por causa da interação 
	  que ocorre entre eles.
	 
	
	 ________________CICLO DE VIDA_______________
	 
	 O CICLO DE VIDA das threads é composto por 5 estados:
	
	 - Criação da instância -> new Thread()
	 - Pronta para execução (RUNNABLE) -> start()
	 - Em execução (RUNNING) -> run() 
	 	- É possivel voltar para o estado "RUNNABLE" através do método yield()
	 	- É possivel terminar a thread entrando no estado "Thread terminada" (DEAD)
	 	- É possivel entrar em Estado de espera (WAITING) -> sleep(), wait(), suspend().
	   		- Em seguida as threads podem "acordar" e sair do estado de espera -> notify() / notifyAll()
	   		- Ou podemos resumir sua execução e ela volta para o estado "Pronta para execução" e depois para "Em execução" -> resume()
	 
	 
	________________IMPLEMENTAÇÕES_______________
	
	Qual abordagem é melhor: fazer o extends da classe "Thread" ou usar a interface Runnable?
	
	Depende do que o programa precisa.
	
	- Quando fazemos o extends da Thread, o único método que precisa ser sobreposto é o run e dar inicio com o start(), mas não poderemos
	extender nenhuma outra classe. (Java não tem herança multipla)
	- Quando implementamos a interface Runnable, nós também precisamos implementar o método run, mas com a interface Runnable nós 
	podemos extender qualquer outra classe.
	
	Se não for sobrepor qualquer outro método da classe Thread, pode ser melhor usar o Runnable
	
	 
	 */

}
