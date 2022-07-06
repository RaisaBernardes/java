package _1U_classes_utilitarias_java;

import java.util.Date;

public class _2Date {

	public static void main(String[] args) {
			//A classe Date n�o � a melhor forma de trabalhar com datas no java, mas ainda existem raz�es para trabalhar-se com ela
			//como por exemplo, quando fazemos a integra��o java com o banco de dados e temos uma classe que representar� uma tabela,
			//se a coluna do banco de dados for do tipo data, n�s declaramos o atributo como tipo Data.
			Date hoje = new Date(); 
			
			System.out.println(hoje);
			
			//o m�todo getTime() pode ser bem util no dia a dia de projetos quando trabalhamos com banco de dados utilizando JPA 
			//ou hibernate frameworks para abstrair a parte de banco de dados do java, sempre declaramos nossos atributos como Date
			System.out.println("Milisegundos desde 1 Jan 1970: " + hoje.getTime());
			
			System.out.println(hoje.getDate());
	
		}
	
}
