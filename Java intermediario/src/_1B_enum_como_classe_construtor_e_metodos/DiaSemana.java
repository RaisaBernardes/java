package _1B_enum_como_classe_construtor_e_metodos;

public enum DiaSemana {

	//Devido a existência do construtor na linha 15, o eclipse pede obrigatoriamente para "transformarmos" cada enum
	//desses em construtores. Ademais, um valor inteiro deverá ser passado nos parâmetros de cada construtor.

	
	//Enumeradores com construtor
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), 
	SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	//Não é necessário utilizar um modificador de acesso na hora de declarar um construtor de uma classe enum. Isso acontece
	//porque o construtor do enum também é utilizado internamente pelo prórpio enumerador.
	DiaSemana(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}
}