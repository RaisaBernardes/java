package exercicio97_exceptions_fachada_conta;
public class Testadora {
	
	public static void main(String[] args) {
		
		Fachada fachada = new Fachada();
		Cliente c = new Cliente("1234", 15, "Felipe");
		Conta conta = new Conta(100, "abcx", c);
		
		try {
			System.out.println("Antes adicionar");
			fachada.adicionarCliente(c);
			
			System.out.println("Cliente adicionado com sucesso");
			fachada.adicionarConta(conta);
			
			Cliente c2 = null;
			c2 = fachada.procurarCliente("1234"); // e retorno de fachada.procurar("1234") é do tipo cliente, por isso eu posso atribuir!

			System.out.println(c2.getNome());
			System.out.println(c2.getIdade());

		} catch (IdadeNaoPermitidaException inpe) {
			System.out.println("Informe novamente a idade ou informe a idade correta");

		} catch (ClienteJaCadastradoException cjce) {
			System.out.println("Solicitar que o cliente informe outro numero de cpf.. ou confirme");
		} catch (CPFJaCadastradoException cce) {
			System.out.println("Cliente ja cadastrado ");
		} finally {
			System.out.println("NO FINAL DO BLOCO DE EXCEPTION");
		}
		
		System.out.println("QUALQUER COISA DEPOIS DO BLOCO DE TRY... APARECE");

	}
}
