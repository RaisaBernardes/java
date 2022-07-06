package exercicio97_exceptions_fachada_conta;

public interface IRepositorioCliente {

	public int inserir(Cliente c) throws CPFJaCadastradoException;
	public void atualizar(Cliente c);
	public Cliente procurar(String cpf);
	public boolean existe(String cpf);
	public void remover(Cliente c);
	
}
