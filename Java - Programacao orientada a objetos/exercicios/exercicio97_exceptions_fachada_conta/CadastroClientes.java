package exercicio97_exceptions_fachada_conta;

public class CadastroClientes {
	
	private IRepositorioCliente clientes;

	public CadastroClientes(IRepositorioCliente clientes) {
		this.clientes = clientes;
	}

	public int adicionar(Cliente c) throws IdadeNaoPermitidaException,ClienteJaCadastradoException,CPFJaCadastradoException {

		if (c.getIdade() < 18) {
			throw new IdadeNaoPermitidaException();
		}
		if (clientes.existe(c.getCpf())) {
			throw new ClienteJaCadastradoException();
		}
 
		return this.clientes.inserir(c);

	}
	
	public Cliente procurar(String cpf){
		Cliente c = this.clientes.procurar(cpf);
		
		return c;
	}
	
}
