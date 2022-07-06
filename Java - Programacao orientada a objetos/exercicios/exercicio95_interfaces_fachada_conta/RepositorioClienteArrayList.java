package exercicio95_interfaces_fachada_conta;
import java.util.ArrayList;

public class RepositorioClienteArrayList implements IRepositorioCliente {
	private ArrayList<Cliente> clientes = new ArrayList<>();

	public RepositorioClienteArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void inserir(Cliente c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Cliente c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void procurar(String cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existe(String cpf) {
		return false;

	}

	@Override
	public void remover(String cpf) {
		// TODO Auto-generated method stub

	}

}
