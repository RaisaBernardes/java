package exercicio98_revisao_ap1;

public class CadastroCliente {

	private IRepositorioCliente repCliente;
	
	public CadastroCliente(IRepositorioCliente repCliente){
		this.repCliente= repCliente;
	}
	
	public void adicionarCliente(Cliente cliente) throws ClienteJaCadastradoException{
		
		if(repCliente.existe(cliente) == false){
			repCliente.inserir(cliente);
			
			cliente.setQntCarros(1);
		}else{
			throw new ClienteJaCadastradoException();
		}
	}
	
	public void retirarCliente(Cliente cliente){
		if(repCliente.existe(cliente) == true){
			repCliente.remover(cliente);
		}else{
			System.out.println("Cliente não existe (cadastro)");
		}
	}
	
	public void atualizarCliente(Cliente cliente){
		repCliente.atualizar(cliente);
	}
	
	public Cliente procurarCliente(Cliente cliente){
		return repCliente.procurarCliente(cliente);
	}

}
