package exercicio95_interfaces_fachada_conta;

public interface IRepositorioCliente {
	
	public void inserir(Cliente c);
	public void atualizar(Cliente c);
	public void procurar(String cpf);
	public boolean existe(String cpf);
	public void remover(String cpf);
	
}

