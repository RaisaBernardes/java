package _9_modificadorFinal;


public final class Constantes {
	//Por convenção do java, constantes são escritas em maiúsculo com _ separando as palavras

	public static final String URL_BLOG = "http://loiane.com";
	public static final String CURSO_COMPLETO = "http://loiane.training";
	public static final String EXEMPLO_INICIALIZACAO;
	
	//private String urlBlog; //Por convenção do java, variáveis normais com mais de uma palavra são escritas com a segunda palavra em maiúsculo


	//Inicializando a constante EXEMPLO_INICIALIZACAO
	static {
		EXEMPLO_INICIALIZACAO = "Valor da constante.";
	}


}