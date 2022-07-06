package _1U_classes_utilitarias_java;

import java.util.Locale;
import java.util.ResourceBundle;

public class _91ResourceBundle {
	//Resource Bundle: S�O ARQUIVOS que ajudam a obter configura��es de acordo com o Locale da aplica��o. 
	//Serve tbm para internacionalizar nossos projetos.
	
	//Pode-se utilizar o Resource Bundle utilizando arquivos ou a pr�pria classe.
	//Neste caso, o Resource Bundle ser� utilizado a partir de arquivos que � o que geralmente � utilizado nos projetos no dia a dia
	
	//Ajuda quando vamos trabalhar com aplica��es onde precisamos de forma dinamica pegar textos de arquivos de acordo com o Locale

	//Uma outra utilidade: Fazer um relat�rio pdf no lado do back-end da aplica��o e de acordo com a localiza��o que a aplica��o estiver
	//sendo executada (de acordo com o Locale), vc vai gerar os textos do relat�rio, (por exemplo: o cabe�alho, o nome das colunas, etc) 
	//de acordo com a l�ngua que est� sendo utilizada na aplica��o.
	
	
	public static void main(String[] args) {
			
			System.out.println("Locale atual " + Locale.getDefault());
			ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
			
			System.out.println("Hello EN: " + rb.getString("hello")); //"hello" � a chave
			System.out.println("World EN: " + rb.getString("world")); //"world" � a chave
			
			//Locale.setDefault(new Locale("pt_BR", "pt_BR"));
			rb = ResourceBundle.getBundle("meu-texto", new Locale("pt_BR", "pt_BR")); //Ao inves de fazer 2 linhas de codigo, � possivel passar o proprio Locale aqui.
			//O proprio java vai ver que estamos definindo pt_BR e vai procurar pelo arquivo com o _pt_BR
			
			System.out.println("Ol� pt_BR: " + rb.getString("hello"));
			System.out.println("Mundo pt_BR: " + rb.getString("world"));
		}
	
}
