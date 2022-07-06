package _1B_enum_como_classe_construtor_e_metodos;

public class Formulario {
	
	enum Genero {
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	}

	private String nome;
	private Genero genero;
}