package exercicio7_repositorio_bar2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Random r= new Random();
		
		
		Pedidos p1= new Pedidos("pizza", 20.0);
		Pedidos p2= new Pedidos("torta", 10.0);
		Pedidos p3= new Pedidos("refrigerante", 5.0);
		
		Pedidos p4= new Pedidos("café", 4.0);
		Pedidos p5= new Pedidos("pão de queijo", 8.50);
		Pedidos p7= new Pedidos("refri", 4.5);
		
		Pedidos p6= new Pedidos("coxinha", 3.0);
	
		
		
		
		RepositorioPedidos rp= new RepositorioPedidos();
		RepositorioPedidos rp2= new RepositorioPedidos();
		RepositorioPedidos rp3= new RepositorioPedidos();
		
		RepositorioCliente rc= new RepositorioCliente();
		RepositorioCliente rc2= new RepositorioCliente();
		
		RepositorioMesas mesa= new RepositorioMesas();
	 
		
		//Add pedidos de 1 cliente
		
		rp.inserirPedidos(p1);
		rp.inserirPedidos(p2);
		rp.inserirPedidos(p3);
		
		
		
		ArrayList<Pedidos> pedidos1= rp.getListPedidos();
		
		
		Cliente c1= new Cliente(pedidos1);
		
	 //testando
		System.out.println(c1.getCliente());
		
		rp2.inserirPedidos(p7);
		rp2.inserirPedidos(p4);
		rp2.inserirPedidos(p5);
		
		ArrayList<Pedidos> pedidos2= rp2.getListPedidos();
		Cliente c2= new Cliente(pedidos2);
		
		rp3.inserirPedidos(p6);
		Cliente c3= new Cliente(rp3.getListPedidos());
		
		
		rc.inserirCliente(c1);
		rc.inserirCliente(c2);
		
		ArrayList<Cliente> mesa1= rc.getClientes();
		
		
		rc2.inserirCliente(c3);
		ArrayList<Cliente> mesa2= rc2.getClientes();
		
		
		Mesa m1= new Mesa(1, mesa1);
		Mesa m2= new Mesa(2, mesa2);
		
		mesa.inserir(m1);
		mesa.inserir(m2);
		
		
		
	/*		System.out.println("--------- CONTAS---------");
			System.out.println("MESA: " + m1.getMesa());
			System.out.println("PEDIDO MESA: ");
			System.out.println(m1.getDisponibilidade());
			
			for(int i=0; i< pedidos1.size(); i++){
				p1= pedidos1.get(i);
				p2= pedidos2.get(i);
				
				System.out.println("  "+ p1.getPedidos() + " - " + p1.getPreco());
				System.out.println("  "+ p2.getPedidos() + " - " + p2.getPreco());
			}
			
			System.out.println(" ");
			System.out.println("MESA: " + m2.getMesa());
			System.out.println("PEDIDO MESA: ");
			
			
			
			for(int i=0; i< mesa1.size(); i++){
				c1= mesa1.get(i);
				
				System.out.print("  " + m1.getLPedidos());
			} */
	} 

}


