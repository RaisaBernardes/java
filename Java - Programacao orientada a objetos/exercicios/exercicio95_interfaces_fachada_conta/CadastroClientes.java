package exercicio95_interfaces_fachada_conta;

public class CadastroClientes {
	
	private IRepositorioCliente clientes; // é só pra ter acesso aos metodos de repositorio

	public CadastroClientes(IRepositorioCliente clientes) {
		this.clientes = clientes;
	}

	public void adicionar(Cliente c) {

		if (clientes.existe(c.getCpf())) {
			System.out.println("cliente ja cadastrado");
			return;
		}

		this.clientes.inserir(c);

	}
}
