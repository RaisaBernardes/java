package exercicio98_revisao_ap1;

public interface IRepositorioCliente {

	public void inserir(Cliente cliente);
	public void remover(Cliente cliente);
	public Cliente procurarCliente(Cliente cliente);
	public void atualizar(Cliente cliente);
	public boolean existe(Cliente cliente);
	
	
	
}
