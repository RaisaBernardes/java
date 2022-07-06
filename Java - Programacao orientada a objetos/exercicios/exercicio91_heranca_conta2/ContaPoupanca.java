package exercicio91_heranca_conta2;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	protected double diaRendimento;
	
	
	public ContaPoupanca(String nomeCliente, int numConta) {
		super(nomeCliente, numConta);
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public boolean CalcularNovoSaldo(double taxaRendimento){
		
		Calendar hoje= Calendar.getInstance();
		if(diaRendimento== hoje.get(Calendar.DAY_OF_MONTH)){
			saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (getSaldo()* taxaRendimento));
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s= "ContaPoupança -> ";
		s += "DiaRendimento: " + diaRendimento;
		s += " - " + super.toString();
		
		return s;
	}
	


}
