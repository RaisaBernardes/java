package exercicio91_heranca_conta2;

public class Principal {

	public static void main(String[] args) {
		
		ContaBancaria[] conta= new ContaBancaria[3];

		conta[0] = new ContaBancaria("Jos� da Silva", 1234567);
		conta[1] = new ContaBancaria("Maria Rosa", 9876549);
		conta[2] = new ContaBancaria("Amanda Gomes", 7890765);
		
	//	conta[0].Sacar(10.0);
	//	conta[0].Depositar(500.0);
		
	//	 System.out.println(conta[0].toString());
		
	//	conta[1] = new ContaPoupanca("Maria Rosa", 9876549);
	//	conta[1].Depositar(1000.0);
		
		ContaPoupanca[] cp= new ContaPoupanca[3];
		
		cp[0]= new ContaPoupanca ("Ra�sa Mirella ", 1234567);
		cp[0].Depositar(200.0);
		cp[0].CalcularNovoSaldo(2.0);
		cp[0].setDiaRendimento(5);
		System.out.println(cp[0].toString());
		cp[0].Depositar(1000);
		cp[0].Sacar(2000);
		
		if (cp[0].CalcularNovoSaldo(0.5)){
		
			System.out.println("Rendimento aplicado, novo saldo � de = " + cp[0].getSaldo());
		} else {
		 System.out.println("Hoje n�o � dia de rendimento, novo saldo n�o calculado");
		}
		
		/*ContaEspecial ce= new ContaEspecial ("Anderson Frederick ", 1234567);
		ce.Depositar(700.0);
		ce.setLimite(2000);
		System.out.println(ce.toString());
		ce.Sacar(300);
		System.out.println(ce.getSaldo());
		ce.Sacar(500);
		
		*/
	}

}
