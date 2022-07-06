package exercicio9_heranca_conta;

import java.util.ArrayList;

public class RepositorioContasArrayList {

	ArrayList<Conta> contas;

	public RepositorioContasArrayList(){
		contas= new ArrayList<>();
	}
	
	public void inserir(Conta conta){
		this.contas.add(conta);
	}
	
	public void remover(Conta conta){
		int index= procurarIndex(conta);
			if(index != -1){
				this.contas.remove(index); //removi a conta cujo index é igual a esse
			}
		}
	
	public Conta procurarConta(Conta conta){
		int index= procurarIndex(conta);
			if(index != -1){
				return this.contas.get(index); //"pegar" a conta daquele index
			}else{
				System.out.println("Conta não encontrada!");
		}
		return null;
	}

	private int procurarIndex(Conta conta){  //Saber qual é o index de determinada conta 
		int resposta= -1;
		
		for(Conta c : contas){ 		//Armazeno as contas Array dentro de c
				
			if (c.getNumero().equals(conta.getNumero())){
				resposta= contas.indexOf(c); //estou dando o index da conta achada para "resposta"
				break;
			}
		}
	
			return resposta;
	}
	
	public ArrayList<Conta> retornaTodasAsContas(){

		return this.contas;
	}

}


