package _9_modificadorFinal;


public final class Constantes {
	//Por conven��o do java, constantes s�o escritas em mai�sculo com _ separando as palavras

	public static final String URL_BLOG = "http://loiane.com";
	public static final String CURSO_COMPLETO = "http://loiane.training";
	public static final String EXEMPLO_INICIALIZACAO;
	
	//private String urlBlog; //Por conven��o do java, vari�veis normais com mais de uma palavra s�o escritas com a segunda palavra em mai�sculo


	//Inicializando a constante EXEMPLO_INICIALIZACAO
	static {
		EXEMPLO_INICIALIZACAO = "Valor da constante.";
	}


}