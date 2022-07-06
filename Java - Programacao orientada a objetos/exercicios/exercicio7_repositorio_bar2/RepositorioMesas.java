package exercicio7_repositorio_bar2;
import java.util.ArrayList;

public class RepositorioMesas {

	ArrayList <Mesa> mesas;


	public RepositorioMesas(){
		this.mesas= new ArrayList<>();
	}
	
	public ArrayList<Mesa> getMesas(){
		return this.mesas;
	}
	
	public void inserir(Mesa mesa){
		this.mesas.add(mesa);
		mesa.setDisponibilidade(false);
	}
	
	public void Remover(Mesa mesa){
		int index = ProcurarIndex(mesa);
		if(index != -1){
			this.mesas.remove(index);
			System.out.println("Mesa removida!");
			mesa.setDisponibilidade(true);
		
		}else{
			System.out.println("Mesa não encontrada!");
		}
	}
	
	public Mesa ProcurarMesa(Mesa mesa){
	int	index = ProcurarIndex(mesa);
		if(index != -1){
			return this.mesas.get(index);
	}else{
		System.out.println("Mesa não encontrada!");
	} return null;
}
	
	public int ProcurarIndex(Mesa mesa){
		int indice= -1;
		
		for(Mesa m: mesas){
			if(m.getMesa() == mesa.getMesa()){
				indice= mesas.indexOf(mesa);
				break;
			}
		}
			return indice;
		}
	

}
