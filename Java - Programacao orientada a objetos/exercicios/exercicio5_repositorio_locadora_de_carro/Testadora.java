package exercicio5_repositorio_locadora_de_carro;
import java.util.ArrayList;

public class Testadora {
	
	public static void main(String[] args) {

			Cliente c1 = new Cliente("Felipe", "12345");
			Cliente c2 = new Cliente("Joao", "6789");

			Carro carro1 = new Carro("Popular", "ABC123", 100);
			Carro carro2 = new Carro("Popular", "ABC345", 100);
			Carro carro3 = new Carro("SUV", "DEF123", 1000);
			Carro carro4 = new Carro("SUV", "HJK890", 1000);

			RepositorioLocacaoArraylist rep = new RepositorioLocacaoArraylist(); //criando um objeto;
			// Esse objeto é uma especie de MEDIADOR. Ele possibilita a gente pegar o método "inserir" da classe Repositorio.

			Locacao loc = new Locacao(c1, carro1, 2);
			rep.inserir(loc);							//O método inserir adiciona elementos (loc) no arraylist.

			loc = new Locacao(c1, carro2, 6);
			rep.inserir(loc);

			loc = new Locacao(c1, carro3, 7);
			rep.inserir(loc);

			loc = new Locacao(c2, carro3, 2);
			rep.inserir(loc);

			loc = new Locacao(c2, carro4, 2);
			rep.inserir(loc);

			ArrayList<Locacao> locacoes = rep.getLocacoes(); //getLocacoes é o acesso ao arrayList completo!

			for (int i = 0; i < locacoes.size(); i++) {
				loc = locacoes.get(i); 

				System.out.println("placa: " + loc.getCarro().getPlaca());
				System.out.println("nome do cliente: " + loc.getCliente().getNome());
				System.out.println("valor da locacao: " + loc.getQuantidadeDeDias() * loc.getCarro().getValorDiaria());
				System.out.println("---------------------------------------------------------------");
			}

			System.out.println("Terminou a locação....");
			Locacao l = locacoes.get(3); 

			System.out.println("placa: " + l.getCarro().getPlaca());
			System.out.println("nome do cliente: " + l.getCliente().getNome());
			System.out.println("valor da locacao: " + l.getQuantidadeDeDias() * l.getCarro().getValorDiaria());
			System.out.println("---------------------------------------------------------------");

			rep.remover(l);
			System.out.println("SERA QUE JOAO AINDA ESTA LÁ????????");
			System.out.println("===================================");
			locacoes = rep.getLocacoes();

			for (int i = 0; i < locacoes.size(); i++) {
				loc = locacoes.get(i);
				if (loc.isLocacaoFinalizada()) {
					System.out.println("placa: " + loc.getCarro().getPlaca());
					System.out.println("nome do cliente: " + loc.getCliente().getNome());
					System.out.println("valor da locacao: " + loc.getQuantidadeDeDias() * loc.getCarro().getValorDiaria());
					System.out.println("---------------------------------------------------------------");
				}
			}
		}
	}




