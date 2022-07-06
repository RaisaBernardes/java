package exercicio95_interfaces_fachada_conta;

public class CadastroContas {
	private IRepositorioConta contas;

	
	public CadastroContas(IRepositorioConta contas){
		this.contas = contas ;
	}
	
	public void adicionar(Conta c) {

		if(contas.existe(c.getNumero())){
			System.out.println("Conta ja cadastrada");
			return;
		}
		
		if (c.getCliente().getIdade() >= 18) {
			this.contas.inserir(c);
		}else{
			System.out.println("Cliente menor de idade");
		}	
	}
}
