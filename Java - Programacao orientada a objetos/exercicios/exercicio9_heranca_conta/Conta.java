package exercicio9_heranca_conta;

public class Conta {

	private String numero;
	private double saldo;

	public Conta(String numero, double saldo){
		this.numero=numero;
		this.saldo=saldo;
	}
	
	public void creditar(double valor){
		this.saldo+=valor;
	}
	
	public void debitar(double valor){
		this.saldo-=valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public String toString(){
		String result="";
		result = "Numero= "+this.numero+" "+ "saldo="
				+this.saldo;
			return result;
	}
}