package exercicio97_exceptions_fachada_conta;


public class Fachada { 
	// A fachada serve de juntador de todos os m�todos de cadastro (e consequentemente do repositorio) clientes e conta
	// A pessoa que for usar o programa (o auditor, por exemplo) n�o precisa saber como feito cada m�todo (os bastidores), 
	// ele s� precisa dos m�todos em si.
	// A fachada pega s� o resultado. Obs.: O cadastro � a regra de neg�cio!
	
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

