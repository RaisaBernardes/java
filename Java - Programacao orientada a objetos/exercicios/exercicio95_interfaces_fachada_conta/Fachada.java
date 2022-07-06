package exercicio95_interfaces_fachada_conta;

public class Fachada {
	
	private CadastroClientes cadastroClientes;
	private CadastroContas cadastroContas;

	private IRepositorioCliente repClientes;
	private IRepositorioConta repContas;

	public Fachada() {
		this.repClientes = new RepositorioClienteArrayList();
		this.repContas = new RepositorioContaArrayList();
		
		this.cadastroClientes = new CadastroClientes(repClientes);
		this.cadastroContas = new CadastroContas(repContas);
		
	}
	
	public void adicionar(Cliente c){
		this.cadastroClientes.adicionar(c);
	}
	
	public void adicionar(Conta c){
		this.cadastroContas.adicionar(c);
	}

}
