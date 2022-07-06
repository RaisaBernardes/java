package exercicio9_heranca_conta;

public class Poupanca extends Conta {

	public Poupanca(String numero, double saldo) {
		super(numero, saldo);
	}
	
	public void renderJuros(double taxa){
		double valor = getSaldo()*taxa;
		creditar(valor);
	}
}