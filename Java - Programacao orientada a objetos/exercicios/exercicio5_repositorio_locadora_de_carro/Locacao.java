package exercicio5_repositorio_locadora_de_carro;

public class Locacao {

	
		private Cliente cliente;
		private Carro carro;
		private boolean locacaofinalizada;
		private int quantidadeDeDias;

		public Locacao(Cliente cliente, Carro carro, int quantidadeDeDias) {
			super();
			this.cliente = cliente;
			this.carro = carro;
			this.quantidadeDeDias = quantidadeDeDias;
			this.locacaofinalizada=false;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public Carro getCarro() {
			return carro;
		}

		public int getQuantidadeDeDias() {
			return quantidadeDeDias;
		}
		
		public void finalizarLocacao(){
			this.locacaofinalizada=true;
		}
		
		public boolean isLocacaoFinalizada(){
			return this.locacaofinalizada;
		}

	}



