package exercicio9_heranca_conta;

public class ContaBonificada extends Conta {

	private double bonus;

	public ContaBonificada(String numero, double saldo) {
		super(numero, saldo);
		this.bonus = 0.0;
	}
	public double getBonus() {
		return bonus;
	}
	public void renderBonus() {
		super.creditar(bonus);
		this.bonus = 0;
	}
	public void creditar(double valor) {
		this.bonus += valor * 0.01;
		super.creditar(valor);
	}
	public String toString(){
		String result = super.toString();
		result+=" Bonus="+this.bonus;
	return result;
	
	}
}