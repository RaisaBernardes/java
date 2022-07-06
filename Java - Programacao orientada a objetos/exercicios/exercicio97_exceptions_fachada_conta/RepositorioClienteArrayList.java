package exercicio97_exceptions_fachada_conta;

import java.util.ArrayList;

public class RepositorioClienteArrayList implements IRepositorioCliente {
	
	private ArrayList<Cliente> clientes;

	public RepositorioClienteArrayList() {
		this.clientes = new ArrayList<>();
	}

	@Override
	public int inserir(Cliente c) throws CPFJaCadastradoException { //tem um motivo pra esse "int" la na classe teste!
		int result = 0;
		if (existe(c.getCpf()) == false) {
			this.clientes.add(c);

		} else {
			throw new CPFJaCadastradoException();
		}

		return result;
	}

	@Override
	public void atualizar(Cliente c) {

	}

	@Override
	public Cliente procurar(String cpf) {
		Cliente c = null;

		if (existe(cpf)== true) {
			for (int i = 0; i < this.clientes.size(); i++) {
				if (this.clientes.get(i).getCpf().equals(cpf)) {
					c = this.clientes.get(i);
				}
			}
		} else {
			System.out.println("Cliente não encontrado");
		}

		return c;
	}

	@Override
	public boolean existe(String cpf) { //verifica se existe no arraylist
		boolean result = false;
		
		for (int i = 0; i < this.clientes.size(); i++) {
			if (this.clientes.get(i).getCpf().equals(cpf)) {
				result = true;
			}
		}
		return result;

	}

	@Override
	public void remover(Cliente c) {
		//verifica se existe
		//se existir, remove
		//se não existir, retorna "não existe."
		
		if(existe(c.getCpf()) == true) {
			this.clientes.remove(c);
			return;
		} else {
			System.out.println("Cliente não existe para ser removido.");
		}

	}

}
