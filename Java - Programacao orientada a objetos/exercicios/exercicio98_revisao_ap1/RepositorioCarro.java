package exercicio98_revisao_ap1;
import java.util.ArrayList;

public class RepositorioCarro implements IRepositorioCarro{

	private ArrayList<Carro>carros;
	
	public RepositorioCarro(){
		carros= new ArrayList<>();
	}
	
	@Override
	public void inserir(Carro carro){
		if(existe(carro)){
			carros.add(carro);
		}else{
			
		}
	}

	@Override
	public void remover(Carro carro) {
		if(existe(carro) == true){
			carros.remove(carro);
		}else{
			
		}
	}

	@Override
	public Carro procurarCarro(Carro carro) {
		Carro c= null;
		
		if(existe(carro) == true){
			for(int i=0; i< carros.size(); ++i){
				if(carros.get(i).getMarca().equalsIgnoreCase(carro.getMarca())){
					c= carros.get(i); 
					return c;
				}
			}
		}
		return null;
	}
	@Override
	public void atualizar(Carro carro) {
		
		for(int i=0; i< carros.size(); ++i){
			if(carros.get(i).getMarca().equalsIgnoreCase(carro.getMarca())){
				carros.remove(i);
				carros.add(carro);
				
				System.out.println(" Atualizado! ");
				
			}else{
				System.out.println("Carro não encontrado!");
			}
		}
	}
	@Override
	public boolean existe(Carro carro) {
		boolean encontrou= false;
		
		for(int i=0; i<carros.size(); ++i){
			if(carros.get(i).getMarca().equalsIgnoreCase(carro.getMarca())){
				encontrou= true;
			}
		}
		
		return encontrou;
	}
	public ArrayList getArrayCarros(){
		return this.carros;
	}



}
