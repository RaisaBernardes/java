package exercicio7_repositorio_bar2;
import java.util.ArrayList;

public class RepositorioCliente {

ArrayList <Cliente> cliente;


	public RepositorioCliente(){
		this.cliente= new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes(){
		return this.cliente;
	}
	
	public void inserirCliente(Cliente pedido){
		cliente.add(pedido);
	} 
	
	public void removerCliente(Cliente pedido){
		int index= ProcurarIndex(pedido);
		if(index != -1){
			this.cliente.remove(index);
			
		}else{
			System.out.println("O pedido desse cliente não foi encontrado!");
		}
	}
	
	public int ProcurarIndex(Cliente pedido){
		int index= -1;
		
		for(Cliente p: cliente){
			if(p.getCliente() == pedido.getCliente()){
				index= this.cliente.indexOf(pedido);
				
				break;
			}
		}
			return index;
	}
	
	
	public Cliente ProcurarCliente(Cliente pedido){
		int index= ProcurarIndex(pedido);
		
		if(index != -1){
			return this.cliente.get(index);
		}else{
			System.out.println("não foi encontrado o pedido do cliente ");
		}
		return null;
	} 
	
	
	
	
	
}
