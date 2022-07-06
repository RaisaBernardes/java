package exercicio97_exceptions_fachada_conta;

public class Conta {
	
	private double saldo;
	private String numero;
	private Cliente cliente;

	public Conta(double saldo, String numero, Cliente cliente) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void debitar(double valor) {
		this.saldo -= valor;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
}
