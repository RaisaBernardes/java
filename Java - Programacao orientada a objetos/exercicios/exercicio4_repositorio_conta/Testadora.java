package exercicio4_repositorio_conta;
import java.util.ArrayList;
import java.util.Random;

public class Testadora {

	public static void main(String[] args) {
		
		Conta c= new Conta("1", 200.0);
		Conta c1= new Conta("222", 1000.0);
		Random r= new Random();
		
		RepositorioContasArrayList repositorioContas= new RepositorioContasArrayList();
		
		
		for(int i=0; i<3; ++i){ //Nesse caso, 3 é o número total de contas
			c= new Conta(" " + i, r.nextDouble()); //Estou gerando um numero double randômico para o valor da conta
			repositorioContas.Inserir(c);
			
		}
		
		ArrayList<Conta> contasArray = repositorioContas.getArray();
		
		for(int i=0; i< contasArray.size(); ++i){
			c= contasArray.get(i); //o "get()" retorna o item em uma posição de índice especificada, nesse caso, i.
			
			System.out.println("Conta " + c.getNumero());
			System.out.println("Saldo " + c.getSaldo());
			System.out.println(" ");
			
		}
		
		
		
		
		
		
		//c= new Conta("55", 0);
		
		//c= repositorioContas.procurarConta(c); //Não vai encontrar a conta, pois o c atualizado não foi inserido no rep
		
	/*	if(c != null){
			System.out.println(c.getNumero());
			System.out.println(c.getSaldo());
		}
	
		c= new Conta("76", 0);
		c= repositorioContas.procurarConta(c);
		
		if(c != null){
			System.out.println(c.getSaldo());
		}
		
		repositorioContas.Remover(c);
		
		c= new Conta("76", 0);
		c= repositorioContas.procurarConta(c);
		
		if(c != null){
			System.out.println(c.getSaldo());
		}else{
			System.out.println("Conta removida!");
		} 
		
		
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
