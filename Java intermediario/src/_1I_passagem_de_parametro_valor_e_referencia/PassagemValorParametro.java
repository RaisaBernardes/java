package _1I_passagem_de_parametro_valor_e_referencia;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com"); //É uma instância de um objeto, logo, tem uma ref na memória.
		int valor = 10;																   //A memória do java é separada em 2 partes: A pilha do programa e a Heap.
																					   //Com a criação de "contato" e "valor", na pilha, encontra-se o endereço 
																					   //de mem de "contato" e o valor da variavel "valor".
																					   //Os valores do objeto "contato" estarão no Heap.

		System.out.println("***** Valores originais*****");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 1*****");

		testePassagemValorReferencia(valor, contato); //Quando chamamos um método, é criado uma outra pilha, porém no método. Assim, as variáveis
													  //declaradas como parâmetro são criadas e uma cópia dos valores originais são passados pro método.
													  //e é por isso que a cópia do nosso contato continua apontando pro mesmo endereço da memória heap do java.
													  //Quando mudamos esse valor no método, estamos mudando-o dentro da pilha LOCAL do método.
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("***** Exemplo 2*****");

		testePassagemValorReferencia2(valor, contato); //Continua apontando pra mesma ref de memória, no entanto a mudança será feita nos valores do Heap.

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

		contato.setNome("Contato"+novoValor); //o novo nome deverá ser "contato20". A mudança aqui é feita na memória Heap.
	}
}