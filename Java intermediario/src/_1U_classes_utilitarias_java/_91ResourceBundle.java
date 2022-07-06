package _1U_classes_utilitarias_java;

import java.util.Locale;
import java.util.ResourceBundle;

public class _91ResourceBundle {
	//Resource Bundle: SÃO ARQUIVOS que ajudam a obter configurações de acordo com o Locale da aplicação. 
	//Serve tbm para internacionalizar nossos projetos.
	
	//Pode-se utilizar o Resource Bundle utilizando arquivos ou a própria classe.
	//Neste caso, o Resource Bundle será utilizado a partir de arquivos que é o que geralmente é utilizado nos projetos no dia a dia
	
	//Ajuda quando vamos trabalhar com aplicações onde precisamos de forma dinamica pegar textos de arquivos de acordo com o Locale

	//Uma outra utilidade: Fazer um relatório pdf no lado do back-end da aplicação e de acordo com a localização que a aplicação estiver
	//sendo executada (de acordo com o Locale), vc vai gerar os textos do relatório, (por exemplo: o cabeçalho, o nome das colunas, etc) 
	//de acordo com a língua que está sendo utilizada na aplicação.
	
	
	public static void main(String[] args) {
			
			System.out.println("Locale atual " + Locale.getDefault());
			ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
			
			System.out.println("Hello EN: " + rb.getString("hello")); //"hello" é a chave
			System.out.println("World EN: " + rb.getString("world")); //"world" é a chave
			
			//Locale.setDefault(new Locale("pt_BR", "pt_BR"));
			rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR")); //Ao inves de fazer 2 linhas de codigo, é possivel passar o proprio Locale aqui.
			//O proprio java vai ver que estamos definindo pt_BR e vai procurar pelo arquivo com o _pt_BR
			
			System.out.println("Olá pt_BR: " + rb.getString("hello"));
			System.out.println("Mundo pt_BR: " + rb.getString("world"));
		}
	
}
