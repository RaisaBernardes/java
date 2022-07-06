package exercicio6_repositorio_bar;
import java.util.ArrayList;

public class RepositorioArrayListMesa {


	ArrayList <Mesa> mesa;


	public RepositorioArrayListMesa(){
		this.mesa = new ArrayList<>(); //instanciando o arraylist mesa
	}
	
	//------------------INSERIR MESA--------------------
	
	public void inserirMesa(Mesa m){
		this.mesa.add(m);  			// Adicionando o que será escrito na classe teste dentro do arrayList nota.
		m.setDisponibilidade(false);
	}
	
	
	//------------------PROCURAR INDEX--------------------
	public int procurarIndex(Mesa m){
		int indice= -1;
		for(Mesa x: mesa){
			if(x.getMesa() == m.getMesa()){ //verifica se a mesa existe
				indice= mesa.indexOf(x); //retorna o index
				break;
			}
		}
		return indice;
	}
	
	
	//-------------------PROCURAR MESA--------------------
	public Mesa procurarMesa(Mesa m){ //o método é do tipo da classe
		int indice;
		indice= procurarIndex(m); //primeiro procura o indice
		
		if(indice != -1){ //-1 é o retorno tradicional do java quando não encontra o índice
			
			return mesa.get(indice);
		}else{
			System.out.println("Mesa não encontrada!");
			return null;
		}
	}
	
	
	//---------------------REMOVER MESA--------------------
	public void removerMesa(Mesa m){
		procurarMesa(m);
		
		if(procurarMesa(m) != null){
			this.mesa.remove(m);
			
			m.setDisponibilidade(true);
			m.setFinalizado(true);
			
			System.out.println("Mesa LIBERADA");
		
		}else{
			System.out.println("Mesa não encontrada.");
		}
	}	
}