package exercicio6_repositorio_bar;
import java.util.ArrayList;

public class RepositorioArrayListPedidos {

	ArrayList<Pedidos>pedidos;
	ArrayList<Pedidos>precos;

	
	public RepositorioArrayListPedidos(){
		pedidos= new ArrayList<>(); //instanciando o arraylist pedidos
	}
	
	//Será usado no "toString"
	public ArrayList<Pedidos> getAPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	//------------------INSERIR PEDIDO--------------------
	public void inserir(Pedidos pedido){
		pedidos.add(pedido);
	}
	
	
	//------------------Procurar index--------------------
	public int procurarIndex(Pedidos pedido){
		int index= -1;
		for(Pedidos p: pedidos){
			if(p.getPedidos().equalsIgnoreCase(pedido.getPedidos())){
				index= pedidos.indexOf(p);
				break;
			}
		}
		return index;
	}

	//------------------PROCURAR PEDIDO--------------------
	public Pedidos procurarPedido(Pedidos pedido){
		int index;
		index= procurarIndex(pedido);
		
		if(index != -1){
			return this.pedidos.get(index);
		}else{
			return null;
		}
	}
	
	//------------------REMOVER PEDIDO--------------------
	public void remover(Pedidos pedido){
		int index;
		index= procurarIndex(pedido);
		
		if(index != -1){
			this.pedidos.remove(index);
		}else{
			System.out.println("Pedido não encontrado! ");
		}
	}
	
	//------------------ATUALIZAR PEDIDO--------------------
	public void atualizar(Pedidos pedido){
		int index= procurarIndex(pedido);
		
		if(index != -1){
			pedidos.remove(index);
			pedidos.add(pedido);
		}
	}
	
	public String toString(){
		return "Pedidos: " + getAPedidos();
	}
	
	/* public ArrayList<Pedidos> precos(){
		double cont= 0;
		
		for(Pedidos p: precos){
			cont+= p.getPreco();
			System.out.println("Conta: " + cont);
		}
		return null;
	}
	
	*/

}
		
