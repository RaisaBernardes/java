package exercicio4_repositorio_conta;
import java.util.ArrayList;

public class RepositorioContasArrayList {

	ArrayList<Conta> contas;

	public RepositorioContasArrayList(){
		contas= new ArrayList<>(); //instanciando o arraylist contasa
	}
	
	//---------------INSERIR---------------
	public void Inserir(Conta conta){
		this.contas.add(conta);
	}
	
	//---------------Procurar index para usar em "Procurar conta"---------------
	private int procurarIndex(Conta conta){  //Saber qual é o index de determinada conta 
		int index= -1;
		
		for(Conta c : contas){ 		//Armazeno as contas do arraylist "contas" dentro de c
				
			if (c.getNumero().equals(conta.getNumero())){
				index= contas.indexOf(c); //retorna o índex a conta achada
				break;
			}
		}
			return index;
	}
	

	//---------------PROCURAR CONTA---------------
	public Conta procurarConta(Conta conta){
		int index= procurarIndex(conta);
			if(index != -1){ //Pois -1 é o valor tradicional retornado quando não se encontra 
				System.out.println("Conta encontrada!");
				return this.contas.get(index); //retorna a conta encontrada
				
			}else{
				System.out.println("Conta não encontrada!");
		}
		return null;
	}

	
	
	//---------------REMOVER CONTA---------------
	public void Remover(Conta conta){
		int index= procurarIndex(conta);
			if(index != -1){
				this.contas.remove(index); //removi a conta cujo index é igual a esse
				System.out.println("Removi Conta: " + this.contas.get(index));
			}
		}
	
	public ArrayList<Conta> getArray(){
		return contas;
	}
		
}
