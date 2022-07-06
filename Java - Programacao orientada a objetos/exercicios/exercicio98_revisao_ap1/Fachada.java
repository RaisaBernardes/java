package exercicio98_revisao_ap1;

public class Fachada {

	private IRepositorioCliente repCliente; 
	private IRepositorioCarro repCarro;
	private CadastroCliente cadastroCliente;
	private CadastroCarro cadastroCarro;
	
	public Fachada(){
		this.repCliente= new RepositorioCliente();
		this.repCarro= new RepositorioCarro();
		this.cadastroCliente= new CadastroCliente(repCliente);
		this.cadastroCarro= new CadastroCarro(repCarro);
	}

	public void adicionarCliente(Cliente cliente) throws ClienteJaCadastradoException{
		this.cadastroCliente.adicionarCliente(cliente);
	}
	public void retirarCliente(Cliente cliente){
		this.cadastroCliente.retirarCliente(cliente);
	}
	public void atualizarCliente(Cliente cliente){
		this.cadastroCliente.atualizarCliente(cliente);
	}
	public Cliente procurarCliente(Cliente cliente){
		return this.cadastroCliente.procurarCliente(cliente);
	}
	public void adicionarCarro(Carro carro) throws CarroJaCadastradoException{
		this.cadastroCarro.adicionarCarro(carro);
	}
	public void retirarCarro(Carro carro){
		this.cadastroCarro.retirarCarro(carro);
	}
	public void atualizarCarro(Carro carro){
		this.cadastroCarro.atualizarCarro(carro);
	}
	public Carro procurarCarro(Carro carro){
		return this.cadastroCarro.procurarCarro(carro);
	}
	public void cadastrarCarro(Carro carro) throws IdadeMinimaNaoPermitidaException, NumeroMaximoDeCarrosException{
		this.cadastroCarro.cadastrarCarro(carro);
	}


}
