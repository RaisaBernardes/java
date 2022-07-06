package exercicio97_exceptions_fachada_conta;


public class Fachada { 
	// A fachada serve de juntador de todos os métodos de cadastro (e consequentemente do repositorio) clientes e conta
	// A pessoa que for usar o programa (o auditor, por exemplo) não precisa saber como feito cada método (os bastidores), 
	// ele só precisa dos métodos em si.
	// A fachada pega só o resultado. Obs.: O cadastro é a regra de negócio!
	
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
	
	public int adicionarCliente(Cliente c) throws IdadeNaoPermitidaException,ClienteJaCadastradoException,CPFJaCadastradoException{
		return this.cadastroClientes.adicionar(c);
	}
	
	public void adicionarConta(Conta c){
		this.cadastroContas.adicionar(c);
	}
	
	public Cliente procurarCliente(String cpf){
		return this.cadastroClientes.procurar(cpf);
	}

}

