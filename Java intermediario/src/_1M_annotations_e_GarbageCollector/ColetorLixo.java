package _1M_annotations_e_GarbageCollector;

import _1I_passagem_de_parametro_valor_e_referencia.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada(){
		
		final int MB = 1024 * 1024; //transformando be bytes para megabytes
		
		Runtime runtime = Runtime.getRuntime(); //singleton: s� � permitido 1 inst�ncia da classe para todo o projeto.
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB); //Imprime a mem�ria utilizada pelo programa
		
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
		
		//O getRuntime() � o que obt�m a inst�ncia.
		//Toda classe java tem o m�todo finalize() que � como se vc estivesse marcando os objetos na mem�ria para serem coletados pelo garbage collector.	
		Runtime.getRuntime().runFinalization(); 
		
		Runtime.getRuntime().gc(); //pedindo para o garbage collector ser executado, mas n�o � garantido. 
								   //� raro de ver isso (a for�a��o do garbage collector), a n�o ser em casos cr�ticos em que seja necess�rio liberar mais memoria para alocar objetos
								   //Existem ferramentas visuais (profiling) em que vemos como a aplica��o est� se comportando. A pr�ria JVM tem uma ferramenta dessas que � o JAVA VisualVM.
		System.out.println("Contatos removidos da mem�ria");
		
		obterMemoriaUsada();
	}

}