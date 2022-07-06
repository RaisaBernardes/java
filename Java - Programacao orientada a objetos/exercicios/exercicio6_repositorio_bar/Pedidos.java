package exercicio6_repositorio_bar;

public class Pedidos {

	private String pedidos;
	private double preco;
	
	
	public Pedidos(String pedidos, double preco){
		this.pedidos= pedidos;
		this.preco=preco;
	}
	
	public String toString(){
		return "Pedidos: " + pedidos + " - Preço: " + preco;
	}
	
	public String getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(String pedidos) {
		this.pedidos = pedidos;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
