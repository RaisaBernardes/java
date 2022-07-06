package exercicio98_revisao_ap1;

public interface IRepositorioCarro {

	public void inserir(Carro carro);
	public void remover(Carro carro);
	public Carro procurarCarro(Carro carro);
	public void atualizar(Carro carro);
	public boolean existe(Carro carro);
}
