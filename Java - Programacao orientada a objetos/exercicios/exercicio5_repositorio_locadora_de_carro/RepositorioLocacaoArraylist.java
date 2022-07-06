package exercicio5_repositorio_locadora_de_carro;
import java.util.ArrayList;

	public class RepositorioLocacaoArraylist {

		private ArrayList<Locacao> locacoes;

		public RepositorioLocacaoArraylist() {
			super();
			this.locacoes = new ArrayList<>(); //Instanciando o arraylist
		}
		
		//---------------INSERIR---------------
		public void inserir(Locacao locacao){ 
			this.locacoes.add(locacao);
			locacao.getCarro().setDisponivel(false);
		}
		
		
		//---------------Procurar index para usar em "Procurar locação"---------------
		public int procurarIndex(Locacao locacao){
			int index= -1;
			for(Locacao l: locacoes){
				if(l.getCarro().getModelo().equals(locacao.getCarro().getModelo())){
					index = locacoes.indexOf(locacao);
				}
			}
			return index;
		}
		
		
		//---------------REMOVER LOCAÇÃO---------------
		public void remover(Locacao locacao){
			int x= procurarIndex(locacao);
			
			if(x != -1){
				locacao.getCarro().setDisponivel(true);
				locacao.finalizarLocacao();
				locacoes.remove(x);
			}
		}
		
		//---------------VERIFICA SE EXISTE---------------
		public boolean existe(Locacao locacao){
			boolean existe = false;
			
			int x= procurarIndex(locacao);
				if( x != -1){
				System.out.println("Existe!!");
				existe = true;
				
					return existe;
			
			} else{
				System.out.println("Não existe!!");
			} 
			return existe;
		}
		
		//---------------ATUALIZA---------------
		public void atualizar(Locacao locacao){
			int i= procurarIndex(locacao);
			if( i != -1){
				this.locacoes.remove(i);
				this.locacoes.add(locacao);
			}
			
		}
		
		//---------------RETORNA ARRAY---------------
		public ArrayList<Locacao> getLocacoes(){
			return this.locacoes;
		}
		
	}
