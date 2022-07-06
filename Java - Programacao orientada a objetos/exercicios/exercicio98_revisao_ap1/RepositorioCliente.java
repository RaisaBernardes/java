package exercicio98_revisao_ap1;
import java.util.ArrayList;

public class RepositorioCliente implements IRepositorioCliente{

	private ArrayList<Cliente> clientes;
	
	public RepositorioCliente(){
		clientes= new ArrayList<>();
	}

	@Override
	public void inserir(Cliente cliente){
		if(existe(cliente) == false){
			clientes.add(cliente);
		}
	}
	@Override
	public void remover(Cliente cliente) {
		if(existe(cliente) == true){
			clientes.remove(cliente);
		}
	}
	@Override
	public Cliente procurarCliente(Cliente cliente) {
		if(existe(cliente) == true){
			for(int i=0; i< clientes.size(); ++i){
				if(clientes.get(i) == cliente){
					
					return clientes.get(i);
				}else{
					System.out.println(" Conta não encontrada! ");
				}
			}
		}
		
		return null;
	}
	public int procurarIndex(Cliente cliente){
		int index=-1;
		
		for(Cliente c: clientes){
			if(c.getCpf().equals(cliente)){
				index= clientes.indexOf(c);
			}
		}
		return index;
	}
	@Override
	public void atualizar(Cliente cliente) {
	
		for(int i=0; i< clientes.size(); ++i){
			if(clientes.get(i).getCpf().equals(cliente.getCpf())){
				clientes.remove(i);
				clientes.add(cliente);
				
				System.out.println(" Atualizado! ");
			}else{
				System.out.println(" CPF não cadastrado! ");
			}
		}
	}
	@Override
	public boolean existe(Cliente cliente) {
		boolean encontrou= false;
		
		for(int i=0; i< clientes.size(); ++i){
			if(clientes.get(i).getCpf().equals(cliente.getCpf())){
				encontrou= true;
			}
		}
		return encontrou;
	}
	
	public ArrayList getArrayClientes(){
		return this.clientes;
	}
	
	
}