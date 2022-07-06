package exercicio7_repositorio_bar2;
import java.util.ArrayList;

public class RepositorioPedidos {

	
	ArrayList<Pedidos> pedidos;

	
	
	public RepositorioPedidos (){
		super();
		this.pedidos= new ArrayList<>();
		}
	
	public ArrayList<Pedidos> getListPedidos(){
		return this.pedidos;
		}
	
	public void inserirPedidos(Pedidos pedido){
		pedidos.add(pedido);
		}
	
	public void removerPedidos(Pedidos pedido){
		int indice= procurarIndex(pedido);
		if(indice != -1){
			this.pedidos.remove(indice);
		}else{
			System.out.println("Pedido não encontrado!");
		}
	}
	
	public Pedidos procurarPedidos(Pedidos pedido){
		int indice= procurarIndex(pedido);
		
		if(indice != -1){
			return this.pedidos.get(indice);
		}else{
			return null;
		}
	}
	
	
	private int procurarIndex(Pedidos pedido){
		int indice = -1;
		
		for(Pedidos p: pedidos){
			if(p.getPedidos().equalsIgnoreCase(pedido.getPedidos())){
				indice= pedidos.indexOf(p);
				break;
			}
		}
		return indice;
	
	}
	
	


}
