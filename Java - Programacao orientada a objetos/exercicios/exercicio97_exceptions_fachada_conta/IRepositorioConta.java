package exercicio97_exceptions_fachada_conta;

public interface IRepositorioConta {
	
	public void inserir(Conta c);
	public void atualizar(Conta c);
	public void procurar(String num);
	public boolean existe(String num);
	public void remover(Conta c);
	
}
