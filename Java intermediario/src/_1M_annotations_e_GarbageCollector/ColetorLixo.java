package _1M_annotations_e_GarbageCollector;

import _1I_passagem_de_parametro_valor_e_referencia.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada(){
		
		final int MB = 1024 * 1024; //transformando be bytes para megabytes
		
		Runtime runtime = Runtime.getRuntime(); //singleton: só é permitido 1 instância da classe para todo o projeto.
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB); //Imprime a memória utilizada pelo programa
		
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[10000000];
		Contato contato;

		for (int i=0; i<contatos.length; i++){
			contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		
		contatos = null;
		
		//O getRuntime() é o que obtém a instância.
		//Toda classe java tem o método finalize() que é como se vc estivesse marcando os objetos na memória para serem coletados pelo garbage collector.	
		Runtime.getRuntime().runFinalization(); 
		
		Runtime.getRuntime().gc(); //pedindo para o garbage collector ser executado, mas não é garantido. 
								   //É raro de ver isso (a forçação do garbage collector), a não ser em casos críticos em que seja necessário liberar mais memoria para alocar objetos
								   //Existem ferramentas visuais (profiling) em que vemos como a aplicação está se comportando. A prória JVM tem uma ferramenta dessas que é o JAVA VisualVM.
		System.out.println("Contatos removidos da memória");
		
		obterMemoriaUsada();
	}

}