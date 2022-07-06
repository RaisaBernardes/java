package exercicio7_repositorio_bar2;
import java.util.ArrayList;

public class Pedidos{
	
	private String Pedidos;
	private double preco;
	
	
	public Pedidos(String pedidos, double preco) {
		super();
		Pedidos = pedidos;
		this.preco = preco;
	}
	public String getPedidos() {
		return Pedidos;
	}
	public void setPedidos(String pedidos) {
		Pedidos = pedidos;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	



}