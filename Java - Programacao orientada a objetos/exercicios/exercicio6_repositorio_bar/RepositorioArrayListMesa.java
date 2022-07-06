package exercicio6_repositorio_bar;
import java.util.ArrayList;

public class RepositorioArrayListMesa {


	ArrayList <Mesa> mesa;


	public RepositorioArrayListMesa(){
		this.mesa = new ArrayList<>(); //instanciando o arraylist mesa
	}
	
	//------------------INSERIR MESA--------------------
	
	public void inserirMesa(Mesa m){
		this.mesa.add(m);  			// Adicionando o que ser� escrito na classe teste dentro do arrayList nota.
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
	public Mesa procurarMesa(Mesa m){ //o m�todo � do tipo da classe
		int indice;
		indice= procurarIndex(m); //primeiro procura o indice
		
		if(indice != -1){ //-1 � o retorno tradicional do java quando n�o encontra o �ndice
			
			return mesa.get(indice);
		}else{
			System.out.println("Mesa n�o encontrada!");
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
			System.out.println("Mesa n�o encontrada.");
		}
	}	
}