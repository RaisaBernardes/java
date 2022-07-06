/*-----EXEMPLOS REAIS------
	
	- Classes que serão utilizadas somente dentro da classe "externa"
	- Hibernate/JPA (tabela com chave primária composta)
	- Quando vc não vai usar aquela classe em outro lugar do projeto, somente naquela classe.
	- Swing (actions)
	- Collections (uma classe para comparar objetos, entre outros)

*/

package _1L_classes_aninhadas;


public class Anonima { //É quando a gente instancia a classe e muda seu comportamento quando estamos instanciando.
					   //Classes anonimas podem implementar interface

	public void imprimeTexto(){
		System.out.println("qualquer texto");
	}
	
	public static void main(String[] args){
		
		Anonima anonima = new Anonima(){
			public void imprimeTexto(){
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		//usando interface
		Texto texto = new Texto() { //É possivel instaciar uma interface, porém, como classe anônima. Após a instanciação, abrir e fechar chaves { } com a implementação dos métodos.
			@Override //Obrigatoriamente deve-se implementar os métodos da interface
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}
}