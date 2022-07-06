package exercicio9_heranca_conta;
import java.util.ArrayList;

	public class ClasseTestadoraDaConta {
		
		public static void main(String[] args) {
			
			Conta c = new Conta("1234", 100.00);
			Poupanca p = new Poupanca("345", 100.00);
			ContaBonificada cb = new ContaBonificada("ABC",350);
			
			RepositorioContasArrayList repositorioContas = new RepositorioContasArrayList();
			
				repositorioContas.inserir(c);
				repositorioContas.inserir(p);
				repositorioContas.inserir(cb);
			
				c = new Conta("12340", 103.00);
				p = new Poupanca("3450", 104.00);
				cb = new ContaBonificada("ABC-2", 3777);

				repositorioContas.inserir(c);
				repositorioContas.inserir(p);
				repositorioContas.inserir(cb);

				c = new Conta("12340a", 1073.00);
				p = new Poupanca("3450a", 1047.00);
				cb = new ContaBonificada("ABC-2a", 99.98);

				repositorioContas.inserir(c);
				repositorioContas.inserir(p);
				repositorioContas.inserir(cb);

				ArrayList<Conta> contas = repositorioContas.retornaTodasAsContas();
				
				for (Conta conta : contas) {
					System.out .println(conta.toString());
					System.out.println("");
					
					conta.creditar(35);
				}
				
				System.out .println("Depois do deposito de 35");
				System.out .println("Depois do deposito de 35");
				
				for (Conta conta : contas) {
					
					System.out .println(conta.toString());
				}
				
				System.out .println("====================");
				
				for (Conta conta : contas) {
					if (conta instanceof ContaBonificada) {
						System.out.println("....instanceof......");
						((ContaBonificada)conta).renderBonus();
						
						System.out .println(conta.toString());
					}
				}
				
				System.out .println("Depois de render bonus das contas bonificadas");
					for (Conta conta : contas) {
						System.out .println(conta.toString());
				}
					System.out .println("Terminou o program");
				
		}
	}
