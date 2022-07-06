package exercicio97_exceptions_fachada_conta;
import java.util.ArrayList;

public class RepositorioContaArrayList implements IRepositorioConta {

	private ArrayList<Conta> contas = new ArrayList<>();
	
	public RepositorioContaArrayList() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void inserir(Conta c) {
		contas.add(c);

	}

	@Override
	public void atualizar(Conta c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void procurar(String num) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existe(String num) {
		return false;
	}

	@Override
	public void remover(Conta c) {
		// TODO Auto-generated method stub

	}

}
