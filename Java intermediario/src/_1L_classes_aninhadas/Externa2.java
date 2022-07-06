package _1L_classes_aninhadas;

public class Externa2 {

	public void metodoQualquer(){

		class ClasseLocal{ //Essa classe local s� tem escopo dentro desse m�todo. N�o conseguiriamos instancia-la fora do m�todo.

			private String texto = "texto classe local";

			public void imprimeTexto(){
				System.out.println(texto);
			}
		}

		ClasseLocal local = new ClasseLocal(); 

		local.imprimeTexto();
	}

	public static void main(String[] args){

		Externa2 externa = new Externa2();

		externa.metodoQualquer();
	}
}