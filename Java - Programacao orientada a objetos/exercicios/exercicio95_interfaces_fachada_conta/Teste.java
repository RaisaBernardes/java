package exercicio95_interfaces_fachada_conta;

public class Teste {

public static void main(String[] args) {
		
	
		Fachada fachada = new Fachada();
		Cliente c = new Cliente("1234", 19, "Felipe");
		Conta conta = new Conta(100, "abcx", c);
		
		fachada.adicionar(c);
		fachada.adicionar(conta);
		
	}
}


