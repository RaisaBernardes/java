/*-----CLASSES ANINHADAS------
(Uma classe dentro da outra)

Obs.:
As classes internas tem acesso aos atributos das classes externas*/

package _1L_classes_aninhadas;

public class Externa {

	private String texto = "texto externo";
	
	public class Interna{
		
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(Externa.this.texto); 
		}
	}
	
	public static void main(String[] args){
		
		//Para instanciar a classe interna, é necessário instanciar a classe externa, a não ser que a classe interna seja estática.
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
	}
}