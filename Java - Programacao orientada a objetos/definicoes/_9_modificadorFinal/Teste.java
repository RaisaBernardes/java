package _9_modificadorFinal;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		//exemplo 02
		System.out.println(Constantes.URL_BLOG);
		//Contantes.URL_BLOG = "sdjfskjdhfsdf"; 
		System.out.println(Constantes.URL_BLOG);
		
		final int TOTAL = 1; 
		//total = total + 1;
		System.out.println(TOTAL);
		
		
		//Exemplo de objeto final
		//A classe StringBuilder faz parte do pacote java e permite criar e manipular dados de Strings dinamicamente,
		//ou seja, podem criar variáveis de String modificáveis.
		final StringBuilder sb = new StringBuilder("Exemplo");
		System.out.println(sb);
		
		sb.append("Modificando exemplo"); //o método append() adiciona mais conteúdo ao final de um StringBuffer.
		System.out.println(sb);
		
	}

}