package exercicio91_heranca_conta2;

public class ContaBancaria {

	protected String nomeCliente;
	protected int numConta;
	protected double saldo;
	
	public ContaBancaria(String nomeCliente, int numConta){
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		double saldo=0;
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public void Sacar(double valor){
		if(getSaldo() >= valor){
		setSaldo(getSaldo() - valor);
		System.out.println(valor + " sacado com sucesso!");
		System.out.println("Seu saldo é " + getSaldo());
		System.out.println("");
		
		}else{
			System.out.println("Saldo insuficiente!");
		}
	}
	
		public void Depositar(double valor){
			setSaldo(getSaldo() + valor);
			System.out.println(valor + " depositado com sucesso!");
	}


	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

}
