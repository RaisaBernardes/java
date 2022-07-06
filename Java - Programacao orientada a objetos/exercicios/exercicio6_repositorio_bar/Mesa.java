package exercicio6_repositorio_bar;
import java.util.ArrayList;

public class Mesa {

	private int mesa;
	private int qntpessoas;
	private  ArrayList<Pedidos> pedidos; //uma MESA tem VARIOS PEDIDOS
	private ArrayList<Pedidos> precos; //uma MESA tem VARIOS PREÇOS
	private boolean disponibilidade;
	private boolean Finalizado;

	public Mesa(int mesa, int qntpessoas, ArrayList<Pedidos> pedidos){
		
		this.mesa= mesa;
		this.qntpessoas= qntpessoas;
		this.pedidos= pedidos;
		this.Finalizado = false;
	}

	public int getMesa(){
		return this.mesa;
	}
	
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	
	public boolean getDisponibilidade(){
		System.out.println("Disponibilidade: " + this.disponibilidade);
		return this.disponibilidade;
	}
	
	public void setDisponibilidade(boolean disponibilidade){
		this.disponibilidade= disponibilidade;
	}
	
	public int getQntpessoas() {
		return qntpessoas;
	}
	
	public void setQntpessoas(int qntpessoas) {
		this.qntpessoas = qntpessoas;
	}
	
	public ArrayList<Pedidos> getPedidos() {
		return pedidos;
	}
	
	public void setFinalizado(boolean finalizado) {
		Finalizado = finalizado;
	}
	
	public boolean getFinalizado(){
		return this.Finalizado= true;
	}
		
}
