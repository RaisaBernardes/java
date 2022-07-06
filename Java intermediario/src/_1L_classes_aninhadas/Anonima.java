/*-----EXEMPLOS REAIS------
	
	- Classes que ser�o utilizadas somente dentro da classe "externa"
	- Hibernate/JPA (tabela com chave prim�ria composta)
	- Quando vc n�o vai usar aquela classe em outro lugar do projeto, somente naquela classe.
	- Swing (actions)
	- Collections (uma classe para comparar objetos, entre outros)

*/

package _1L_classes_aninhadas;


public class Anonima { //� quando a gente instancia a classe e muda seu comportamento quando estamos instanciando.
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
		Texto texto = new Texto() { //� possivel instaciar uma interface, por�m, como classe an�nima. Ap�s a instancia��o, abrir e fechar chaves { } com a implementa��o dos m�todos.
			@Override //Obrigatoriamente deve-se implementar os m�todos da interface
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}
}