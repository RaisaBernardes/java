package exercicio91_heranca_conta2;

public class ContaEspecial extends ContaBancaria{

	protected double limite;
	
	public ContaEspecial(String nomeCliente, int numConta) {
		super(nomeCliente, numConta);
		
	}
	
	public double getLimite(){
		return this.limite;
	}
	public void setLimite(double limite){
		this.limite=limite;
	}

	@Override
	public void Sacar(double valor) {
		if(getLimite() + getSaldo() >= valor){
			setSaldo(getSaldo() - valor);
		if(getSaldo() < valor){
			System.out.println("ATENÇÃO! Você entrou no limite!!");
		}
	}else{
		System.out.println("Saldo e Limite indisponivel!");
	}
		
	}

	@Override
	public String toString() {
		String s= "Conta Especial ";
		s += " Limite: " + limite;
		s += super.toString();
		
		return s;
	}

	
	
	
	
	
}
