package exercicio7_repositorio_bar2;
import java.util.ArrayList;
public class Mesa {

	private int mesa;
	private boolean disponivel;
	private boolean finalizar;
	private ArrayList<Cliente> clientes;
	//private ArrayList<Pedidos> pedidos;
	
	public Mesa(int mesa, ArrayList<Cliente> pessoa){
		super();
		this.mesa= mesa;
		this.disponivel= true;
		this.finalizar= false;
	
	}

	public int getMesa(){
		return this.mesa;
	}
	
	public boolean getDisponibilidade(){
		return this.disponivel;
	}
	public void setDisponibilidade(boolean diponivel){
		this.disponivel= disponivel;
	}
	
	//public ArrayList<Pedidos> getLPedidos(){
	//	return this.pedidos;
	//}
	
	public ArrayList<Cliente> getClientes(){
		return this.clientes;
	}
		
	
}
