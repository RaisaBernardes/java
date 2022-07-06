package _1I_passagem_de_parametro_valor_e_referencia;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com"); //� uma inst�ncia de um objeto, logo, tem uma ref na mem�ria.
		int valor = 10;																   //A mem�ria do java � separada em 2 partes: A pilha do programa e a Heap.
																					   //Com a cria��o de "contato" e "valor", na pilha, encontra-se o endere�o 
																					   //de mem de "contato" e o valor da variavel "valor".
																					   //Os valores do objeto "contato" estar�o no Heap.

		System.out.println("***** Valores originais*****");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 1*****");

		testePassagemValorReferencia(valor, contato); //Quando chamamos um m�todo, � criado uma outra pilha, por�m no m�todo. Assim, as vari�veis
													  //declaradas como par�metro s�o criadas e uma c�pia dos valores originais s�o passados pro m�todo.
													  //e � por isso que a c�pia do nosso contato continua apontando pro mesmo endere�o da mem�ria heap do java.
													  //Quando mudamos esse valor no m�todo, estamos mudando-o dentro da pilha LOCAL do m�todo.
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 2*****");

		testePassagemValorReferencia2(valor, contato); //Continua apontando pra mesma ref de mem�ria, no entanto a mudan�a ser� feita nos valores do Heap.

		System.out.println(contato);
		System.out.println(valor);
	}


	private static void testePassagemValorReferencia(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}

	private static void testePassagemValorReferencia2(int valor, Contato contato){

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato"+novoValor); //o novo nome dever� ser "contato20". A mudan�a aqui � feita na mem�ria Heap.
	}
}