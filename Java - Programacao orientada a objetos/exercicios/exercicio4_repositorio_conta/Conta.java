package exercicio4_repositorio_conta;

public class Conta {

	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo){
		this.numero=numero;
		this.saldo=saldo;
	
	}
	
	public String getNumero(){
		return this.numero;
	}

	public double getSaldo(){
		return this.saldo;
	}
	
	public void Creditar(double valor){
		this.saldo += valor;
	}
	
	public void Debitar(double valor){
		this.saldo -= valor;
	}

	

	
}
