package exercicio98_revisao_ap1;

public class CadastroCarro {
	
	private IRepositorioCarro repCarro;
	private IRepositorioCliente repCliente;
	
	public CadastroCarro(IRepositorioCarro repCarro){
		this.repCarro= repCarro;
	}
	
	
	public void adicionarCarro(Carro carro) throws CarroJaCadastradoException{
		
		if(repCarro.existe(carro) == false){
			repCarro.inserir(carro);
		}else{
			
			System.out.println("Carro ja cadastrado!! (cadastro carro)");
			throw new CarroJaCadastradoException();
			
		}
	}	
	
	public void cadastrarCarro(Carro carro) throws IdadeMinimaNaoPermitidaException, NumeroMaximoDeCarrosException{
		
		if(repCliente.existe(carro.getCliente())){
			if(carro.getCliente().getIdade() >= 18){
		
				if(carro.getCliente().getQntCarros() < 3){
				
				repCarro.inserir(carro);
				
			}else{
				System.out.println("Numero máximo de carros atingido! (cadastro carro)");
				throw new NumeroMaximoDeCarrosException();
				
				
			}
			}else{
				System.out.println("Idade não permitida! (cadastro carro)");	
				throw new IdadeMinimaNaoPermitidaException();
			}
		}
	}
	
	public void retirarCarro(Carro carro){
		repCarro.remover(carro);
	}
	
	public Carro procurarCarro(Carro carro){
		return repCarro.procurarCarro(carro);	
	}
	
	public void atualizarCarro(Carro carro){
		repCarro.atualizar(carro);
	}
	
}
	
	


